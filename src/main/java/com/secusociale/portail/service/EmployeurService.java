package com.secusociale.portail.service;

import com.secusociale.portail.domain.Employeur;
import com.secusociale.portail.repository.EmployeurRepository;
import com.secusociale.portail.security.SecurityUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing {@link Employeur}.
 */
@Service
@Transactional
public class EmployeurService {

    private final Logger log = LoggerFactory.getLogger(EmployeurService.class);

    private final EmployeurRepository employeurRepository;

    public EmployeurService(EmployeurRepository employeurRepository) {
        this.employeurRepository = employeurRepository;
    }

    /**
     * Save a employeur.
     *
     * @param employeur the entity to save.
     * @return the persisted entity.
     */
    public Employeur save(Employeur employeur) {
        log.debug("Request to save Employeur : {}", employeur);
        return employeurRepository.save(employeur);
    }

    /**
     * Get all the employeurs.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public Page<Employeur> findAll(Pageable pageable) {
        log.debug("Request to get all Employeurs");
        return employeurRepository.findAll(pageable);
    }

    /**
     * Get all employeurs by User.
     *
     * @param .
     * @return  the list of employeurs by currentUser.
     */
    @Transactional(readOnly = true)
    public Optional<Employeur> findEmployeurByUser() {
        log.debug("Request to get Employeur : {}");
        String username = SecurityUtils.getCurrentUserLogin().get(); 
        return employeurRepository.findOneByUserLogin(username);
    }

    /**
     * Get employeurs by user.
     *
     * @param  
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<Employeur> findOne(Long id) {
        log.debug("Request to get Employeur : {}", id);
        return employeurRepository.findById(id);
    }

    
    
    /**
     * Delete the employeur by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete Employeur : {}", id);
        employeurRepository.deleteById(id);
    }
}

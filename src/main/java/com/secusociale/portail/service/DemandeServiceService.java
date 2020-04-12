package com.secusociale.portail.service;

import com.secusociale.portail.domain.DemandeService;
import com.secusociale.portail.repository.DemandeServiceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing {@link DemandeService}.
 */
@Service
@Transactional
public class DemandeServiceService {

    private final Logger log = LoggerFactory.getLogger(DemandeServiceService.class);

    private final DemandeServiceRepository demandeServiceRepository;

    public DemandeServiceService(DemandeServiceRepository demandeServiceRepository) {
        this.demandeServiceRepository = demandeServiceRepository;
    }

    /**
     * Save a demandeService.
     *
     * @param demandeService the entity to save.
     * @return the persisted entity.
     */
    public DemandeService save(DemandeService demandeService) {
        log.debug("Request to save DemandeService : {}", demandeService);
        return demandeServiceRepository.save(demandeService);
    }

    /**
     * Get all the demandeServices.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public Page<DemandeService> findAll(Pageable pageable) {
        log.debug("Request to get all DemandeServices");
        return demandeServiceRepository.findAll(pageable);
    }

    /**
     * Get one demandeService by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<DemandeService> findOne(Long id) {
        log.debug("Request to get DemandeService : {}", id);
        return demandeServiceRepository.findById(id);
    }

    /**
     * Delete the demandeService by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete DemandeService : {}", id);
        demandeServiceRepository.deleteById(id);
    }
}

package com.secusociale.portail.service;

import com.secusociale.portail.domain.Immatriculation;
import com.secusociale.portail.repository.ImmatriculationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing {@link Immatriculation}.
 */
@Service
@Transactional
public class ImmatriculationService {

    private final Logger log = LoggerFactory.getLogger(ImmatriculationService.class);

    private final ImmatriculationRepository immatriculationRepository;

    public ImmatriculationService(ImmatriculationRepository immatriculationRepository) {
        this.immatriculationRepository = immatriculationRepository;
    }

    /**
     * Save a immatriculation.
     *
     * @param immatriculation the entity to save.
     * @return the persisted entity.
     */
    public Immatriculation save(Immatriculation immatriculation) {
        log.debug("Request to save Immatriculation : {}", immatriculation);
        return immatriculationRepository.save(immatriculation);
    }

    /**
     * Get all the immatriculations.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public Page<Immatriculation> findAll(Pageable pageable) {
        log.debug("Request to get all Immatriculations");
        return immatriculationRepository.findAll(pageable);
    }

    /**
     * Get one immatriculation by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<Immatriculation> findOne(Long id) {
        log.debug("Request to get Immatriculation : {}", id);
        return immatriculationRepository.findById(id);
    }

    /**
     * Delete the immatriculation by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete Immatriculation : {}", id);
        immatriculationRepository.deleteById(id);
    }
}

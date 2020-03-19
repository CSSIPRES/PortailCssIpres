package com.secusociale.portail.service;

import com.secusociale.portail.domain.RepresentantLegal;
import com.secusociale.portail.repository.RepresentantLegalRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing {@link RepresentantLegal}.
 */
@Service
@Transactional
public class RepresentantLegalService {

    private final Logger log = LoggerFactory.getLogger(RepresentantLegalService.class);

    private final RepresentantLegalRepository representantLegalRepository;

    public RepresentantLegalService(RepresentantLegalRepository representantLegalRepository) {
        this.representantLegalRepository = representantLegalRepository;
    }

    /**
     * Save a representantLegal.
     *
     * @param representantLegal the entity to save.
     * @return the persisted entity.
     */
    public RepresentantLegal save(RepresentantLegal representantLegal) {
        log.debug("Request to save RepresentantLegal : {}", representantLegal);
        return representantLegalRepository.save(representantLegal);
    }

    /**
     * Get all the representantLegals.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public Page<RepresentantLegal> findAll(Pageable pageable) {
        log.debug("Request to get all RepresentantLegals");
        return representantLegalRepository.findAll(pageable);
    }

    /**
     * Get one representantLegal by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<RepresentantLegal> findOne(Long id) {
        log.debug("Request to get RepresentantLegal : {}", id);
        return representantLegalRepository.findById(id);
    }

    /**
     * Delete the representantLegal by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete RepresentantLegal : {}", id);
        representantLegalRepository.deleteById(id);
    }
}

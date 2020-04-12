package com.secusociale.portail.service;

import com.secusociale.portail.domain.DocumentUrl;
import com.secusociale.portail.repository.DocumentUrlRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing {@link DocumentUrl}.
 */
@Service
@Transactional
public class DocumentUrlService {

    private final Logger log = LoggerFactory.getLogger(DocumentUrlService.class);

    private final DocumentUrlRepository documentUrlRepository;

    public DocumentUrlService(DocumentUrlRepository documentUrlRepository) {
        this.documentUrlRepository = documentUrlRepository;
    }

    /**
     * Save a documentUrl.
     *
     * @param documentUrl the entity to save.
     * @return the persisted entity.
     */
    public DocumentUrl save(DocumentUrl documentUrl) {
        log.debug("Request to save DocumentUrl : {}", documentUrl);
        return documentUrlRepository.save(documentUrl);
    }

    /**
     * Get all the documentUrls.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public Page<DocumentUrl> findAll(Pageable pageable) {
        log.debug("Request to get all DocumentUrls");
        return documentUrlRepository.findAll(pageable);
    }

    /**
     * Get one documentUrl by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<DocumentUrl> findOne(Long id) {
        log.debug("Request to get DocumentUrl : {}", id);
        return documentUrlRepository.findById(id);
    }

    /**
     * Delete the documentUrl by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete DocumentUrl : {}", id);
        documentUrlRepository.deleteById(id);
    }
}

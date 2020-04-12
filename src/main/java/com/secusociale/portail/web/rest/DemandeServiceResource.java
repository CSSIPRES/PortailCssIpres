package com.secusociale.portail.web.rest;

import com.secusociale.portail.domain.DemandeService;
import com.secusociale.portail.service.DemandeServiceService;
import com.secusociale.portail.web.rest.errors.BadRequestAlertException;

import io.github.jhipster.web.util.HeaderUtil;
import io.github.jhipster.web.util.PaginationUtil;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing {@link com.secusociale.portail.domain.DemandeService}.
 */
@RestController
@RequestMapping("/api")
public class DemandeServiceResource {

    private final Logger log = LoggerFactory.getLogger(DemandeServiceResource.class);

    private static final String ENTITY_NAME = "demandeService";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final DemandeServiceService demandeServiceService;

    public DemandeServiceResource(DemandeServiceService demandeServiceService) {
        this.demandeServiceService = demandeServiceService;
    }

    /**
     * {@code POST  /demande-services} : Create a new demandeService.
     *
     * @param demandeService the demandeService to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new demandeService, or with status {@code 400 (Bad Request)} if the demandeService has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/demande-services")
    public ResponseEntity<DemandeService> createDemandeService(@RequestBody DemandeService demandeService) throws URISyntaxException {
        log.debug("REST request to save DemandeService : {}", demandeService);
        if (demandeService.getId() != null) {
            throw new BadRequestAlertException("A new demandeService cannot already have an ID", ENTITY_NAME, "idexists");
        }
        DemandeService result = demandeServiceService.save(demandeService);
        return ResponseEntity.created(new URI("/api/demande-services/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * {@code PUT  /demande-services} : Updates an existing demandeService.
     *
     * @param demandeService the demandeService to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated demandeService,
     * or with status {@code 400 (Bad Request)} if the demandeService is not valid,
     * or with status {@code 500 (Internal Server Error)} if the demandeService couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/demande-services")
    public ResponseEntity<DemandeService> updateDemandeService(@RequestBody DemandeService demandeService) throws URISyntaxException {
        log.debug("REST request to update DemandeService : {}", demandeService);
        if (demandeService.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        DemandeService result = demandeServiceService.save(demandeService);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, demandeService.getId().toString()))
            .body(result);
    }

    /**
     * {@code GET  /demande-services} : get all the demandeServices.
     *
     * @param pageable the pagination information.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of demandeServices in body.
     */
    @GetMapping("/demande-services")
    public ResponseEntity<List<DemandeService>> getAllDemandeServices(Pageable pageable) {
        log.debug("REST request to get a page of DemandeServices");
        Page<DemandeService> page = demandeServiceService.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), page);
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    /**
     * {@code GET  /demande-services/:id} : get the "id" demandeService.
     *
     * @param id the id of the demandeService to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the demandeService, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/demande-services/{id}")
    public ResponseEntity<DemandeService> getDemandeService(@PathVariable Long id) {
        log.debug("REST request to get DemandeService : {}", id);
        Optional<DemandeService> demandeService = demandeServiceService.findOne(id);
        return ResponseUtil.wrapOrNotFound(demandeService);
    }

    /**
     * {@code DELETE  /demande-services/:id} : delete the "id" demandeService.
     *
     * @param id the id of the demandeService to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/demande-services/{id}")
    public ResponseEntity<Void> deleteDemandeService(@PathVariable Long id) {
        log.debug("REST request to delete DemandeService : {}", id);
        demandeServiceService.delete(id);
        return ResponseEntity.noContent().headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString())).build();
    }
}

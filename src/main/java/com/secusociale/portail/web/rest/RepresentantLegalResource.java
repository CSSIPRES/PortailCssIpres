package com.secusociale.portail.web.rest;

import com.secusociale.portail.domain.RepresentantLegal;
import com.secusociale.portail.service.RepresentantLegalService;
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

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing {@link com.secusociale.portail.domain.RepresentantLegal}.
 */
@RestController
@RequestMapping("/api")
public class RepresentantLegalResource {

    private final Logger log = LoggerFactory.getLogger(RepresentantLegalResource.class);

    private static final String ENTITY_NAME = "representantLegal";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final RepresentantLegalService representantLegalService;

    public RepresentantLegalResource(RepresentantLegalService representantLegalService) {
        this.representantLegalService = representantLegalService;
    }

    /**
     * {@code POST  /representant-legals} : Create a new representantLegal.
     *
     * @param representantLegal the representantLegal to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new representantLegal, or with status {@code 400 (Bad Request)} if the representantLegal has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/representant-legals")
    public ResponseEntity<RepresentantLegal> createRepresentantLegal(@Valid @RequestBody RepresentantLegal representantLegal) throws URISyntaxException {
        log.debug("REST request to save RepresentantLegal : {}", representantLegal);
        if (representantLegal.getId() != null) {
            throw new BadRequestAlertException("A new representantLegal cannot already have an ID", ENTITY_NAME, "idexists");
        }
        RepresentantLegal result = representantLegalService.save(representantLegal);
        return ResponseEntity.created(new URI("/api/representant-legals/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * {@code PUT  /representant-legals} : Updates an existing representantLegal.
     *
     * @param representantLegal the representantLegal to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated representantLegal,
     * or with status {@code 400 (Bad Request)} if the representantLegal is not valid,
     * or with status {@code 500 (Internal Server Error)} if the representantLegal couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/representant-legals")
    public ResponseEntity<RepresentantLegal> updateRepresentantLegal(@Valid @RequestBody RepresentantLegal representantLegal) throws URISyntaxException {
        log.debug("REST request to update RepresentantLegal : {}", representantLegal);
        if (representantLegal.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        RepresentantLegal result = representantLegalService.save(representantLegal);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, representantLegal.getId().toString()))
            .body(result);
    }

    /**
     * {@code GET  /representant-legals} : get all the representantLegals.
     *
     * @param pageable the pagination information.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of representantLegals in body.
     */
    @GetMapping("/representant-legals")
    public ResponseEntity<List<RepresentantLegal>> getAllRepresentantLegals(Pageable pageable) {
        log.debug("REST request to get a page of RepresentantLegals");
        Page<RepresentantLegal> page = representantLegalService.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), page);
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    /**
     * {@code GET  /representant-legals/:id} : get the "id" representantLegal.
     *
     * @param id the id of the representantLegal to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the representantLegal, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/representant-legals/{id}")
    public ResponseEntity<RepresentantLegal> getRepresentantLegal(@PathVariable Long id) {
        log.debug("REST request to get RepresentantLegal : {}", id);
        Optional<RepresentantLegal> representantLegal = representantLegalService.findOne(id);
        return ResponseUtil.wrapOrNotFound(representantLegal);
    }

    /**
     * {@code DELETE  /representant-legals/:id} : delete the "id" representantLegal.
     *
     * @param id the id of the representantLegal to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/representant-legals/{id}")
    public ResponseEntity<Void> deleteRepresentantLegal(@PathVariable Long id) {
        log.debug("REST request to delete RepresentantLegal : {}", id);
        representantLegalService.delete(id);
        return ResponseEntity.noContent().headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString())).build();
    }
}

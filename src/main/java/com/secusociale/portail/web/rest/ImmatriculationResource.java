package com.secusociale.portail.web.rest;

import com.secusociale.portail.domain.Immatriculation;
import com.secusociale.portail.service.ImmatriculationService;
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
 * REST controller for managing {@link com.secusociale.portail.domain.Immatriculation}.
 */
@RestController
@RequestMapping("/api")
public class ImmatriculationResource {

    private final Logger log = LoggerFactory.getLogger(ImmatriculationResource.class);

    private static final String ENTITY_NAME = "immatriculation";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final ImmatriculationService immatriculationService;

    public ImmatriculationResource(ImmatriculationService immatriculationService) {
        this.immatriculationService = immatriculationService;
    }

    /**
     * {@code POST  /immatriculations} : Create a new immatriculation.
     *
     * @param immatriculation the immatriculation to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new immatriculation, or with status {@code 400 (Bad Request)} if the immatriculation has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/immatriculations")
    public ResponseEntity<Immatriculation> createImmatriculation(@Valid @RequestBody Immatriculation immatriculation) throws URISyntaxException {
        log.debug("REST request to save Immatriculation : {}", immatriculation);
        if (immatriculation.getId() != null) {
            throw new BadRequestAlertException("A new immatriculation cannot already have an ID", ENTITY_NAME, "idexists");
        }
        Immatriculation result = immatriculationService.save(immatriculation);
        return ResponseEntity.created(new URI("/api/immatriculations/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * {@code PUT  /immatriculations} : Updates an existing immatriculation.
     *
     * @param immatriculation the immatriculation to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated immatriculation,
     * or with status {@code 400 (Bad Request)} if the immatriculation is not valid,
     * or with status {@code 500 (Internal Server Error)} if the immatriculation couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/immatriculations")
    public ResponseEntity<Immatriculation> updateImmatriculation(@Valid @RequestBody Immatriculation immatriculation) throws URISyntaxException {
        log.debug("REST request to update Immatriculation : {}", immatriculation);
        if (immatriculation.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        Immatriculation result = immatriculationService.save(immatriculation);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, immatriculation.getId().toString()))
            .body(result);
    }

    /**
     * {@code GET  /immatriculations} : get all the immatriculations.
     *
     * @param pageable the pagination information.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of immatriculations in body.
     */
    @GetMapping("/immatriculations")
    public ResponseEntity<List<Immatriculation>> getAllImmatriculations(Pageable pageable) {
        log.debug("REST request to get a page of Immatriculations");
        Page<Immatriculation> page = immatriculationService.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), page);
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    /**
     * {@code GET  /immatriculations/:id} : get the "id" immatriculation.
     *
     * @param id the id of the immatriculation to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the immatriculation, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/immatriculations/{id}")
    public ResponseEntity<Immatriculation> getImmatriculation(@PathVariable Long id) {
        log.debug("REST request to get Immatriculation : {}", id);
        Optional<Immatriculation> immatriculation = immatriculationService.findOne(id);
        return ResponseUtil.wrapOrNotFound(immatriculation);
    }

    /**
     * {@code DELETE  /immatriculations/:id} : delete the "id" immatriculation.
     *
     * @param id the id of the immatriculation to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/immatriculations/{id}")
    public ResponseEntity<Void> deleteImmatriculation(@PathVariable Long id) {
        log.debug("REST request to delete Immatriculation : {}", id);
        immatriculationService.delete(id);
        return ResponseEntity.noContent().headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString())).build();
    }
}

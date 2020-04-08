package com.secusociale.portail.web.rest;

import com.secusociale.portail.model.ReferencementModel;
import com.secusociale.portail.security.AuthoritiesConstants;
import com.secusociale.portail.service.ReferencementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;

@RestController
@RequestMapping("/api")
public class ReferencementResource {

    public ReferencementResource(ReferencementService referencementService) {
        this.referencementService = referencementService;
    }

    private ReferencementService referencementService;


    @PostMapping("/referencement")
    @PreAuthorize("hasAuthority(\"" + AuthoritiesConstants.ADMIN + "\")")
    public String createReferencement(ReferencementModel referencementModel ) throws URISyntaxException {

        if (referencementService.createRefer(referencementModel) != null){
            return "success";
        }
        else {
            return "error";
        }

    }
}

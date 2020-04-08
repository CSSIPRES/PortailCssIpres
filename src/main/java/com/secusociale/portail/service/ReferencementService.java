package com.secusociale.portail.service;

import com.secusociale.portail.model.ReferencementModel;
import com.secusociale.portail.repository.ReferencementRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ReferencementService {

    private ReferencementRepository referencementRepository;

    public ReferencementService(ReferencementRepository referencementRepository) {
        this.referencementRepository = referencementRepository;
    }

    public ReferencementModel createRefer(ReferencementModel referencementModel){
        return referencementRepository.save(referencementModel);
    }
}

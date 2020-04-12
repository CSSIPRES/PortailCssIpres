package com.secusociale.portail.repository;

import com.secusociale.portail.domain.DemandeService;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the DemandeService entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DemandeServiceRepository extends JpaRepository<DemandeService, Long> {
}

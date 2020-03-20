package com.secusociale.portail.repository;

import com.secusociale.portail.domain.Immatriculation;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Immatriculation entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ImmatriculationRepository extends JpaRepository<Immatriculation, Long> {
}

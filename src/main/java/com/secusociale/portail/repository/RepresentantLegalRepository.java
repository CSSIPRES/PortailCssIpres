package com.secusociale.portail.repository;

import com.secusociale.portail.domain.RepresentantLegal;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the RepresentantLegal entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RepresentantLegalRepository extends JpaRepository<RepresentantLegal, Long> {
}

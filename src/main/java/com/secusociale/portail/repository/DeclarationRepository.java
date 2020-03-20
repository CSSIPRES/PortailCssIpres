package com.secusociale.portail.repository;

import com.secusociale.portail.domain.Declaration;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Declaration entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DeclarationRepository extends JpaRepository<Declaration, Long> {
}

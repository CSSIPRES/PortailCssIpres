package com.secusociale.portail.repository;

import com.secusociale.portail.model.ReferencementModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReferencementRepository  extends JpaRepository<ReferencementModel, Long> {
}

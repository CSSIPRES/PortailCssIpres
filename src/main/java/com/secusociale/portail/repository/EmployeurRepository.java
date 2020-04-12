package com.secusociale.portail.repository;

import com.secusociale.portail.domain.Employeur;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data  repository for the Employeur entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EmployeurRepository extends JpaRepository<Employeur, Long> {

    @Query("select employeur from Employeur employeur where employeur.user.login = ?#{principal.username}")
    List<Employeur> findByUserIsCurrentUser();
    
    Optional<Employeur> findOneByUserLogin(String login);
    
}

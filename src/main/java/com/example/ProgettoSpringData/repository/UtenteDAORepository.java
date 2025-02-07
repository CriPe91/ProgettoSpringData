package com.example.ProgettoSpringData.repository;

import com.example.ProgettoSpringData.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteDAORepository extends JpaRepository<Utente,Long> {
    Utente findById(long id);
}

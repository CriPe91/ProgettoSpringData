package com.example.ProgettoSpringData.repository;

import com.example.ProgettoSpringData.model.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrenotazioneDAORepository extends JpaRepository<Prenotazione,Long> {
    Prenotazione findById(long id);
}

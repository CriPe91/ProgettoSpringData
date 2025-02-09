package com.example.ProgettoSpringData.repository;

import com.example.ProgettoSpringData.model.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;


@Repository
public interface PrenotazioneDAORepository extends JpaRepository<Prenotazione,Long> {
    Prenotazione findById(long id);

    @Query("SELECT COUNT(p) FROM Prenotazione p WHERE p.postazione.id = :postazioneId AND p.dataPrenotazione = :data")
    long stampaPrenotazioniPerPostazioneEData(long postazioneId, LocalDate data);
}

package com.example.ProgettoSpringData.repository;

import com.example.ProgettoSpringData.model.Postazione;
import com.example.ProgettoSpringData.model.Prenotazione;
import com.example.ProgettoSpringData.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrenotazioneDAORepository extends JpaRepository<Prenotazione,Long> {
    Prenotazione findById(long id);

    @Query("SELECT p FROM Prenotazione p WHERE p.postazione = :postazione AND p.dataPrenotazione = :data")
    List<Prenotazione> findByPostazioneAndData(Postazione postazione, LocalDate data);

    @Query("SELECT p FROM Prenotazione p WHERE p.utente = :utente AND p.dataPrenotazione = :data")
    List<Prenotazione> findByUtenteAndData(Utente utente, LocalDate data);
}

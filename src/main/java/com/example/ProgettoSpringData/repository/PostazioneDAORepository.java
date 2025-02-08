package com.example.ProgettoSpringData.repository;

import com.example.ProgettoSpringData.enumeration.Tipo;
import com.example.ProgettoSpringData.model.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostazioneDAORepository extends JpaRepository<Postazione, Long> {
    Postazione findById(long id);

    @Query("SELECT p FROM Postazione p WHERE p.tipoPostazione = :tipoPostazione AND p.edificio.citta = :citta")
    List<Postazione> findByTipoAndCitta(Tipo tipoPostazione, String citta);
}

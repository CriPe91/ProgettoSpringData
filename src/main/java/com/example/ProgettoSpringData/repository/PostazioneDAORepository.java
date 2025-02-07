package com.example.ProgettoSpringData.repository;

import com.example.ProgettoSpringData.model.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostazioneDAORepository extends JpaRepository<Postazione, Long> {
    Postazione findById(long id);
}

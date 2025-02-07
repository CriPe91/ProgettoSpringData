package com.example.ProgettoSpringData.repository;

import com.example.ProgettoSpringData.model.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificioDAORepository extends JpaRepository<Edificio,Long> {
    Edificio findById(long id);
}

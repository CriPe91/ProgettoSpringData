package com.example.ProgettoSpringData.service;

import com.example.ProgettoSpringData.model.Edificio;
import com.example.ProgettoSpringData.repository.EdificioDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EdificioService {

    @Autowired @Qualifier("edificio") ObjectProvider<Edificio> edificioProvider;

    @Autowired EdificioDAORepository edificioDAO;

    public Edificio creaEdificio(){
        return edificioProvider.getObject();
    }

    public void salvaEdificio(Edificio edificio) {
       edificioDAO.save(edificio);
    }


}

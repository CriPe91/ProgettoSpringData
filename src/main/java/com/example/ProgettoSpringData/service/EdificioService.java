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
    @Autowired @Qualifier("edificio1") ObjectProvider<Edificio> edificio1Provider;
    @Autowired @Qualifier("edificio2") ObjectProvider<Edificio> edificio2Provider;

    @Autowired EdificioDAORepository edificioDAO;

    public Edificio creaEdificio(){
        return edificioProvider.getObject();
    }

    public void salvaEdificio(Edificio edificio) {
       edificioDAO.save(edificio);
    }
    public Edificio creaEdificio1(){
        return edificio1Provider.getObject();
    }

    public void salvaEdificio1(Edificio edificio) {
        edificioDAO.save(edificio);
    }
    public Edificio creaEdificio2(){
        return edificio2Provider.getObject();
    }

    public void salvaEdificio2(Edificio edificio) {
        edificioDAO.save(edificio);
    }


}

package com.example.ProgettoSpringData.service;

import com.example.ProgettoSpringData.model.Edificio;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EdificioService {

    @Autowired
    @Qualifier("edificio")
    ObjectProvider<Edificio> edificioProvider;

    public Edificio creaEdificio(){
        return edificioProvider.getObject();
    }


}

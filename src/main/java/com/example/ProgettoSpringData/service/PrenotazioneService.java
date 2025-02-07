package com.example.ProgettoSpringData.service;

import com.example.ProgettoSpringData.model.Edificio;
import com.example.ProgettoSpringData.model.Prenotazione;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PrenotazioneService {

    @Autowired
    @Qualifier("prenotazione")
    ObjectProvider<Prenotazione> prenotazioneProvider;

    public Prenotazione creaEdificio(){
        return prenotazioneProvider.getObject();
    }

}

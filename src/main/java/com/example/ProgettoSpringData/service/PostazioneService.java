package com.example.ProgettoSpringData.service;

import com.example.ProgettoSpringData.model.Edificio;
import com.example.ProgettoSpringData.model.Postazione;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PostazioneService {
    @Autowired
    @Qualifier("postazione")
    ObjectProvider<Postazione> postazioneProvider;

    public Postazione creaEdificio(){
        return postazioneProvider.getObject();
    }
}

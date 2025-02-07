package com.example.ProgettoSpringData.service;

import com.example.ProgettoSpringData.model.Prenotazione;
import com.example.ProgettoSpringData.repository.PrenotazioneDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PrenotazioneService {

    @Autowired
    @Qualifier("prenotazione")
    ObjectProvider<Prenotazione> prenotazioneProvider;

    @Autowired
    PrenotazioneDAORepository prenotazioneDAO;

    public Prenotazione creaPrenotazione(){
        return prenotazioneProvider.getObject();
    }

    public void salvaPrenotazione(Prenotazione prenotazione) {
        prenotazioneDAO.save(prenotazione);
    }
}

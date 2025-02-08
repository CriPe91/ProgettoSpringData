package com.example.ProgettoSpringData.service;

import com.example.ProgettoSpringData.model.Postazione;
import com.example.ProgettoSpringData.model.Prenotazione;
import com.example.ProgettoSpringData.repository.PrenotazioneDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PrenotazioneService {

    @Autowired @Qualifier("prenotazione")ObjectProvider<Prenotazione> prenotazioneProvider;
    @Autowired @Qualifier("prenotazione1")ObjectProvider<Prenotazione> prenotazione1Provider;
    @Autowired @Qualifier("prenotazione2")ObjectProvider<Prenotazione> prenotazione2Provider;

    @Autowired
    PrenotazioneDAORepository prenotazioneDAO;

    public Prenotazione creaPrenotazione(){
        return prenotazioneProvider.getObject();
    }

    public void salvaPrenotazione(Prenotazione prenotazione) {
        prenotazioneDAO.save(prenotazione);
    }

    public Prenotazione creaPrenotazione1(){
        return prenotazione1Provider.getObject();
    }

    public void salvaPrenotazione1(Prenotazione prenotazione) {
        prenotazioneDAO.save(prenotazione);
    }

    public Prenotazione creaPrenotazione2(){
        return prenotazione2Provider.getObject();
    }

    public void salvaPrenotazione2(Prenotazione prenotazione) {
        prenotazioneDAO.save(prenotazione);
    }


}

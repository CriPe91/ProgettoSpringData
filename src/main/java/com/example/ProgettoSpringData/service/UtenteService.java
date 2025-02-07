package com.example.ProgettoSpringData.service;

import com.example.ProgettoSpringData.model.Utente;
import com.example.ProgettoSpringData.repository.UtenteDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UtenteService {

    @Autowired @Qualifier("utente") ObjectProvider<Utente> utenteProvider;
    @Autowired
    UtenteDAORepository utenteDAO;

    public Utente creaUtente(){
        return utenteProvider.getObject();
    }

    public void salvaUtente(Utente utente) {
        utenteDAO.save(utente);
    }



}

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
    @Autowired @Qualifier("utente1") ObjectProvider<Utente> utente1Provider;
    @Autowired @Qualifier("utente2") ObjectProvider<Utente> utente2Provider;

    @Autowired
    UtenteDAORepository utenteDAO;

    public Utente creaUtente(){
        return utenteProvider.getObject();
    }

    public void salvaUtente(Utente utente) {
        utenteDAO.save(utente);
    }

    public  Utente creaUtente1(){
        return utente1Provider.getObject();
    }
    public void salvaUtente1(Utente utente) {
        utenteDAO.save(utente);
    }
    public  Utente creaUtente2(){
        return utente2Provider.getObject();
    }
    public void salvaUtente2(Utente utente) {
        utenteDAO.save(utente);
    }


}

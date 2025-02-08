package com.example.ProgettoSpringData.service;


import com.example.ProgettoSpringData.model.Postazione;
import com.example.ProgettoSpringData.repository.PostazioneDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PostazioneService {
    @Autowired @Qualifier("postazione") ObjectProvider<Postazione> postazioneProvider;
    @Autowired @Qualifier("postazione1") ObjectProvider<Postazione> postazione1Provider;
    @Autowired @Qualifier("postazione2") ObjectProvider<Postazione> postazione2Provider;

    @Autowired
    PostazioneDAORepository postazioneDAO;

    public Postazione creaPostazione(){
        return postazioneProvider.getObject();
    }

    public void salvaPostazione(Postazione postazione) {
        postazioneDAO.save(postazione);
    }

    public Postazione creaPostazione1(){
        return postazione1Provider.getObject();
    }

    public void salvaPostazione1(Postazione postazione) {
        postazioneDAO.save(postazione);
    }

    public Postazione creaPostazione2(){
        return postazione2Provider.getObject();
    }

    public void salvaPostazione2(Postazione postazione) {
        postazioneDAO.save(postazione);
    }
}

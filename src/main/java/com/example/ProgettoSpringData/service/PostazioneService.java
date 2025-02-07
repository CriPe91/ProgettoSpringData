package com.example.ProgettoSpringData.service;


import com.example.ProgettoSpringData.model.Postazione;
import com.example.ProgettoSpringData.repository.PostazioneDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PostazioneService {
    @Autowired
    @Qualifier("postazione")
    ObjectProvider<Postazione> postazioneProvider;

    @Autowired
    PostazioneDAORepository postazioneDAO;

    public Postazione creaPostazione(){
        return postazioneProvider.getObject();
    }

    public void salvaPostazione(Postazione postazione) {
        postazioneDAO.save(postazione);
    }
}

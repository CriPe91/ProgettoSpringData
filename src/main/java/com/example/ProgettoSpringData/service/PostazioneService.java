package com.example.ProgettoSpringData.service;


import com.example.ProgettoSpringData.enumeration.Tipo;
import com.example.ProgettoSpringData.model.Postazione;
import com.example.ProgettoSpringData.repository.PostazioneDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public void cercaPostazionePerTipoECitta(Tipo tipo, String citta) {
        if (tipo.equals(Tipo.OPENSPACE) && citta.equals("Roma") ||  tipo.equals(Tipo.PRIVATO) && citta.equals("Roma") ||  tipo.equals(Tipo.SALA_RIUNIONI) && citta.equals("Roma")) {
            List<Postazione> lista = new ArrayList<>(postazioneDAO.cercaPostazionePerTipoECitta(tipo, citta));
            System.out.println("Lista postazioni :" + lista);
        } else {
            System.out.println("Nessun riscontro per tipo e citta");
        }
    }

}

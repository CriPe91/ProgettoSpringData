package com.example.ProgettoSpringData.configuration;

import com.example.ProgettoSpringData.enumeration.Tipo;
import com.example.ProgettoSpringData.model.Edificio;
import com.example.ProgettoSpringData.model.Postazione;
import com.example.ProgettoSpringData.model.Prenotazione;
import com.example.ProgettoSpringData.model.Utente;
import com.example.ProgettoSpringData.repository.EdificioDAORepository;
import com.example.ProgettoSpringData.repository.PostazioneDAORepository;
import com.example.ProgettoSpringData.repository.PrenotazioneDAORepository;
import com.example.ProgettoSpringData.repository.UtenteDAORepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalDate;
import java.util.Locale;

@Configuration
public class GestioneConfiguration {

    Faker faker = new Faker(Locale.ITALY);

    @Autowired
    EdificioDAORepository edificioDAO;
    @Autowired
    UtenteDAORepository utenteDAO;
    @Autowired
    PostazioneDAORepository postazioneDAO;
    @Autowired
    PrenotazioneDAORepository prenotazioneDAO;

    //UTENTI
    @Bean(name = "utente")
    @Scope("prototype")
    public Utente utente(){
        return new Utente(faker.name().username(),faker.name().fullName(),faker.internet().emailAddress());
    }
    @Bean(name = "utente1")
    @Scope("prototype")
    public Utente utente1(){
        return new Utente(faker.name().username(),faker.name().fullName(),faker.internet().emailAddress());
    }
    @Bean(name = "utente2")
    @Scope("prototype")
    public Utente utente2(){
        return new Utente(faker.name().username(),faker.name().fullName(),faker.internet().emailAddress());
    }


    //EDIFICIO
    @Bean(name = "edificio")
    @Scope("prototype")
    public Edificio edificio(){
        return new Edificio("Palazzo dei Congressi","Via Prati","Roma");
    }
    @Bean(name = "edificio1")
    @Scope("prototype")
    public Edificio edificio1(){
        return new Edificio("Salone delle Fontane","Via Monti","Roma");
    }
    @Bean(name = "edificio2")
    @Scope("prototype")
    public Edificio edificio2(){
        return new Edificio("Palazzo Grande","Via Colline","Roma");
    }


    //POSTAZIONI
    @Bean(name = "postazione")
    @Scope("prototype")
    public Postazione postazione(){
        return new Postazione("Convention Dottori", Tipo.OPENSPACE,200,false,edificioDAO.findById(5));
    }
    @Bean(name = "postazione1")
    @Scope("prototype")
    public Postazione postazione1(){
        return new Postazione("Convention Avvocati", Tipo.PRIVATO,30,true,edificioDAO.findById(6));
    }
    @Bean(name = "postazione2")
    @Scope("prototype")
    public Postazione postazione2(){
        return new Postazione("Convention Ingegnieri", Tipo.SALA_RIUNIONI,150,false,edificioDAO.findById(8));
    }


    //PRENOTAZIONI
    @Bean(name = "prenotazione")
    @Scope("prototype")
    public Prenotazione prenotazione(){
        return new Prenotazione(LocalDate.now(),utenteDAO.findById(4),postazioneDAO.findById(6));
    }
    @Bean(name = "prenotazione1")
    @Scope("prototype")
    public Prenotazione prenotazione1(){
        return new Prenotazione(LocalDate.of(2025,2,15),utenteDAO.findById(5),postazioneDAO.findById(7));
    }
    @Bean(name = "prenotazione2")
    @Scope("prototype")
    public Prenotazione prenotazione2(){
        return new Prenotazione(LocalDate.of(2025,3,10),utenteDAO.findById(6),postazioneDAO.findById(10));
    }

}

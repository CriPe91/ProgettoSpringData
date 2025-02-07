package com.example.ProgettoSpringData.configuration;

import com.example.ProgettoSpringData.enumeration.Tipo;
import com.example.ProgettoSpringData.model.Edificio;
import com.example.ProgettoSpringData.model.Postazione;
import com.example.ProgettoSpringData.model.Prenotazione;
import com.example.ProgettoSpringData.model.Utente;
import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Locale;

@Configuration
public class GestioneConfiguration {

    Faker faker = new Faker(Locale.ITALY);

    @Bean(name = "utente")
    public Utente utente(){
        return new Utente(faker.name().username(),faker.name().fullName(),faker.internet().emailAddress());
    }

    @Bean(name = "edificio")
    public Edificio edificio(){
        return new Edificio("Palazzo dei Congressi","Via Prati","Roma");
    }

    @Bean(name = "postazione")
    public Postazione postazione(){
        return new Postazione("Convention Dottori", Tipo.OPENSPACE,200,false,edificio());
    }

    @Bean(name = "prenotazione")
    public Prenotazione prenotazione(){
        return new Prenotazione(LocalDate.now(),utente(),postazione());
    }

}

package com.example.ProgettoSpringData.runner;

import com.example.ProgettoSpringData.model.Prenotazione;
import com.example.ProgettoSpringData.service.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PrenotazioneRunner implements CommandLineRunner {
    @Autowired
    private PrenotazioneService prenotazioneService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("PrenotazioneRunner...");

//        Prenotazione p1 = prenotazioneService.creaPrenotazione();
//        prenotazioneService.salvaPrenotazione(p1);
    }
}

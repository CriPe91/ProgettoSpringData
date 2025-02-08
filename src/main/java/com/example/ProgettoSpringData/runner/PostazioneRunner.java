package com.example.ProgettoSpringData.runner;

import com.example.ProgettoSpringData.model.Postazione;
import com.example.ProgettoSpringData.service.PostazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PostazioneRunner implements CommandLineRunner {
    @Autowired
    private PostazioneService postazioneService;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("PostazioneRunner...");

//        Postazione pos1 = postazioneService.creaPostazione();
//        postazioneService.salvaPostazione(pos1);
//        System.out.println("Postazione creata con successo!!!");

//          Postazione pos2 = postazioneService.creaPostazione1();
//          postazioneService.salvaPostazione1(pos2);
//        System.out.println("Postazione1 creata con successo!!!");

//        Postazione pos3 = postazioneService.creaPostazione2();
//        postazioneService.salvaPostazione2(pos3);
//        System.out.println("Postazione2 creata con successo!!!");
    }
}

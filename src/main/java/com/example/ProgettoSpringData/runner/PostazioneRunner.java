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

        Postazione pos1 = postazioneService.creaPostazione();
        postazioneService.salvaPostazione(pos1);
    }
}

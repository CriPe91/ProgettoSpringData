package com.example.ProgettoSpringData.runner;

import com.example.ProgettoSpringData.model.Utente;
import com.example.ProgettoSpringData.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UtenteRunner implements CommandLineRunner {

    @Autowired private UtenteService utenteService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Utente Runner...");

//        Utente u1 = utenteService.creaUtente();
//        utenteService.salvaUtente(u1);

    }
}

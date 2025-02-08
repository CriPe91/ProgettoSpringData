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
//        System.out.println("Utente creato con successo!!!");

//         Utente u2 = utenteService.creaUtente1();
//         utenteService.salvaUtente1(u2);
//        System.out.println("Utente1 creato con successo!!!");

//        Utente u3 = utenteService.creaUtente2();
//        utenteService.salvaUtente2(u3);
//        System.out.println("Utente2 creato con successo!!!");
    }
}

package com.example.ProgettoSpringData.runner;


import com.example.ProgettoSpringData.model.Edificio;
import com.example.ProgettoSpringData.service.EdificioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EdificioRunner implements CommandLineRunner {
    @Autowired
    private EdificioService edificioService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("EdificioRunner...");

//        Edificio e1 = edificioService.creaEdificio();
//        edificioService.salvaEdificio(e1);
//        System.out.println("Edificio creato con successo!!!");

//         Edificio e2 = edificioService.creaEdificio1();
//         edificioService.salvaEdificio1(e2);
//        System.out.println("Edificio1 creato con successo!!!");

//        Edificio e3 = edificioService.creaEdificio2();
//        edificioService.salvaEdificio1(e3);
//        System.out.println("Edificio2 creato con successo!!!");
    }
}

package com.example.ProgettoSpringData.model;


import com.example.ProgettoSpringData.enumeration.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

@Entity
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String descrizione;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Tipo tipoPostazione;

    @Column(nullable = false)
    private int numMaxOccupanti;

    @Column(nullable = false)
    private boolean riservato;

    @Column(nullable = false)
    private Edificio edificio;

    @OneToMany(mappedBy = "postazione")
    private List<Prenotazione> listaPrenotazioniPostazione = new ArrayList<>();

    public Postazione(String descrizione, Tipo tipoPostazione, int numMaxOccupanti, boolean riservato, Edificio edificio) {
        this.descrizione = descrizione;
        this.tipoPostazione = tipoPostazione;
        this.numMaxOccupanti = numMaxOccupanti;
        this.riservato = riservato;
        this.edificio = edificio;
    }
}

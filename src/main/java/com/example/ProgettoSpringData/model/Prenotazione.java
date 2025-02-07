package com.example.ProgettoSpringData.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private LocalDate dataInizioPrenotazione;
    @Column(nullable = false)
    private LocalDate dataFinePrenotazione = dataInizioPrenotazione.plusDays(1);

    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;

    @ManyToOne
    @JoinColumn(name = "postazione_id")
    private Postazione postazione;

    public Prenotazione(LocalDate dataInizioPrenotazione, LocalDate dataFinePrenotazione, Utente utente, Postazione postazione) {
        this.dataInizioPrenotazione = dataInizioPrenotazione;
        this.dataFinePrenotazione = dataFinePrenotazione;
        this.utente = utente;
        this.postazione = postazione;
    }
}

package com.example.ProgettoSpringData.model;

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
public class Utente{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String userName;
    @Column(nullable = false)
    private String fullName;
    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "utente")
    private List<Prenotazione> listaPrenotazioni = new ArrayList<>();

    public Utente(String userName, String fullName, String email) {
        this.userName = userName;
        this.fullName = fullName;
        this.email = email;
    }
}

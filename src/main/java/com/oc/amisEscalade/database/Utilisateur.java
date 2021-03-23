package com.oc.amisEscalade.database;


import java.util.Objects;
import javax.persistence.*;
@Entity
public class Utilisateur {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        private String nom;
        private String prenom;
        private String email;
        private String pseudo;
        private String password;
        private String phoneNumber;
        private Boolean isAdmin;


    public Utilisateur(Long id, String nom, String prenom, String email, String pseudo, String password, String phoneNumber, Boolean admin) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.pseudo = pseudo;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.isAdmin = isAdmin;
    }

    public Utilisateur() {

    }
}

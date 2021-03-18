package com.oc.amisEscalade;


    import java.util.Objects;
    import javax.persistence.*;

    @Entity
    @Table(name = "user")


public class utilisateur {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        private String nom;
        private String prenom;
        private String email;
        private String pseudo;
        private String password;
        private String phoneNumber;
        private Boolean admin;


    public utilisateur(Long id, String nom, String prenom, String email, String pseudo, String password, String phoneNumber, Boolean admin) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.pseudo = pseudo;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.admin = admin;
    }

    public utilisateur() {

    }
}

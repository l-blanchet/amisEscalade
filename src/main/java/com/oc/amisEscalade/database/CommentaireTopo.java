package com.oc.amisEscalade.database;

import javax.persistence.*;
import java.util.Date;

@Entity

public class CommentaireTopo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Utilisateur utilisateur ;
    @ManyToOne
    private Topo topo;

    private String commentaire;
    private Date date;


    public CommentaireTopo(Long id, Utilisateur utilisateur, Topo topo, String commentaire, Date date) {
        this.id = id;
        this.utilisateur = utilisateur;
        this.topo = topo;
        this.commentaire = commentaire;
        this.date = date;
    }

    public CommentaireTopo(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Topo getTopo() {
        return topo;
    }

    public void setTopo(Topo topo) {
        this.topo = topo;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

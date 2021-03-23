package com.oc.amisEscalade.database;

import javax.persistence.*;
import java.util.Date;

@Entity

public class CommentaireSiteEscalade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Utilisateur utilisateur ;
    @ManyToOne
    private SiteEscalade siteEscalade;

    private String commentaire;
    private Date date;


    public CommentaireSiteEscalade(Long id, Utilisateur utlisateur, SiteEscalade siteEscalade, String commentaire, Date date) {
        super();
        this.id = id;
        this.utilisateur = utlisateur;
        this.siteEscalade = siteEscalade;
        this.commentaire = commentaire;
        this.date = date;
    }

    public CommentaireSiteEscalade() {
        super();

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Utilisateur getUtlisateur() {
        return utilisateur;
    }

    public void setUtlisateur(Utilisateur utlisateur) {
        this.utilisateur = utlisateur;
    }

    public SiteEscalade getSiteEscalade() {
        return siteEscalade;
    }

    public void setSiteEscalade(SiteEscalade siteEscalade) {
        this.siteEscalade = siteEscalade;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}

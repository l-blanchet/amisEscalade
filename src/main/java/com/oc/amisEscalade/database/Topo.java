package com.oc.amisEscalade.database;

import javax.persistence.*;
import java.util.Date;

@Entity

public class Topo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Utilisateur utilisateur;

    @ManyToOne
    private SiteEscalade nom;

    private String site;
    private String pays;
    private String region;
    private String nomTopo;
    private String description;
    private Date dateParution;
    private Boolean isDisponible;


    public Topo(Long id, Utilisateur utilisateur, SiteEscalade nom, String site, String pays, String region, String nomTopo, String description, Date dateParution, Boolean isDisponible) {
        super();
        this.id = id;
        this.utilisateur = utilisateur;
        this.nom = nom;
        this.site = site;
        this.pays = pays;
        this.region = region;
        this.nomTopo = nomTopo;
        this.description = description;
        this.dateParution = dateParution;
        this.isDisponible = isDisponible;
    }

    public Topo(SiteEscalade nom) {
        super();
        this.nom = nom;
    }

    public Topo() {

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

    public void setUtilisateur(Utilisateur utlisateur) {
        this.utilisateur = utlisateur;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getNomTopo() {
        return nomTopo;
    }

    public void setNomTopo(String nomTopo) {
        this.nomTopo = nomTopo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateParution() {
        return dateParution;
    }

    public void setDateParution(Date dateParution) {
        this.dateParution = dateParution;
    }

    public Boolean getDisponible() {
        return isDisponible;
    }

    public void setDisponible(Boolean disponible) {
        isDisponible = disponible;
    }
}

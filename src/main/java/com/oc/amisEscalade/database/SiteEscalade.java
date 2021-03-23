package com.oc.amisEscalade.database;

import javax.persistence.*;
@Entity

public class SiteEscalade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Utilisateur utilisateur;

    private String site;
    private String pays;
    private String region;
    private String type;
    private String secteurs;
    private String voies;
    private String longueurs;
    private String cotation;
    private Boolean isOfficial;


    public SiteEscalade(Long id, Utilisateur utilisateur, String site, String pays, String region, String type, String secteurs, String voies, String longueurs, String cotation, Boolean isOfficial) {
       super();
        this.id = id;
        this.site = site;
        this.pays = pays;
        this.region = region;
        this.type = type;
        this.secteurs = secteurs;
        this.utilisateur = utilisateur;
        this.voies = voies;
        this.longueurs = longueurs;
        this.cotation = cotation;
        this.isOfficial = isOfficial;
    }

    public SiteEscalade() {
        super();

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSite() {
        return site;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSecteurs() {
        return secteurs;
    }

    public void setSecteurs(String secteurs) {
        this.secteurs = secteurs;
    }

    public String getVoies() {
        return voies;
    }

    public void setVoies(String voies) {
        this.voies = voies;
    }

    public String getLongueurs() {
        return longueurs;
    }

    public void setLongueurs(String longueurs) {
        this.longueurs = longueurs;
    }

    public String getCotation() {
        return cotation;
    }

    public void setCotation(String cotation) {
        this.cotation = cotation;
    }

    public Boolean getOfficial() {
        return isOfficial;
    }

    public void setOfficial(Boolean official) {
        isOfficial = official;
    }

}

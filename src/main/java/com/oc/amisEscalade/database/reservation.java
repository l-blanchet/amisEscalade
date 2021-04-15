package com.oc.amisEscalade.database;

import javax.persistence.*;

@Entity

public class reservation {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idReservation;



    @ManyToOne
        private Topo id;

    private String dateEmprunt;

    public reservation(Long idReservation, Topo id, String dateEmprunt) {
        this.idReservation = idReservation;
        this.id = id;
        this.dateEmprunt = dateEmprunt;
    }

    public reservation() {

    }




    public Topo getId() {
        return id;
    }

    public void setId(Topo id) {
        this.id = id;
    }

    public String getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(String dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

}

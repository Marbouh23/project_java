package project_java.Models;
import project_java.Models.Produit;

import java.sql.*;
import java.util.List;

public class Fournisseur {
    private int id_fournisseur;
    private String nom_fournisseur;
    private Date date;
    private List<Produit> prds;

    public Fournisseur(int id,String nom,Date date){
        this.nom_fournisseur=nom;
        this.id_fournisseur=id;
        this.date=date;
    }


    //Accesseurs
    public int getId_fournisseur() {
        return id_fournisseur;
    }
    public String getNom_fournisseur() {
        return nom_fournisseur;
    }
    public Date getDate(){
        return date;
    }

}

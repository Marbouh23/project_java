package project_java.Models;
import java.sql.Date;

public class Admin {
    private int id_admin;
    private int id_utilisateur;


    public Admin(int id_utilisateur ){
        this.id_utilisateur=id_utilisateur;
    }

    public Admin() {

    }

    public int getId_utilisateur() {
        return id_utilisateur;
    }


    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }


}

package Entites;

public class Agence {
    private int numeroAgence;
    private String nom;
    private String adresse;
    private int contact;
    private String email;
    private int nb_p;

    public Agence() {
    }

    public Agence(int numeroAgence, String nom, String adresse, int contact, String email, int nb_p) {
        this.numeroAgence = numeroAgence;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
        this.email = email;
        this.nb_p = nb_p;
    }

    public int getNumeroAgence() {
        return numeroAgence;
    }

    public void setNumeroAgence(int numeroAgence) {
        this.numeroAgence = numeroAgence;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNb_p() {
        return nb_p;
    }

    public void setNb_p(int nb_p) {
        this.nb_p = nb_p;
    }
}


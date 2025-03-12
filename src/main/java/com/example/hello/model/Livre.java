package com.example.hello.model;

public class Livre {
    private String titre;
    private String description;
    private String datePublication;

    // constructeur (vide et full)
    public Livre() {

    }
    public Livre(String titre, String description, String datePublication) {
        this.titre = titre;
        this.description = description;
        this.datePublication = datePublication;
    }

    // Getters et Setters
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;

    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDatePublication() {
        return datePublication;
    }
    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }


    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", datePublication='" + datePublication + '\'' +
                '}';
    }
}



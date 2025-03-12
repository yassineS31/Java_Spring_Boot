package com.example.hello.service;

import com.example.hello.model.Livre;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class LivreService {
    List<Livre> livres;

    //constructeur
    public LivreService() {
        livres = new ArrayList<Livre>();
    }

    // Getter et Setter

    public List<Livre> getLivres() {
        return livres;
    }

    public void setLivres(List<Livre> livres) {
        this.livres = livres;
    }


    // Méthodes
    public void add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est le titre du livre ?");
        String titre = scanner.nextLine();
        System.out.println("Quel est la description du livre ?");
        String description = scanner.nextLine();
        System.out.println("Quel est le genre du livre ?");
        String genre = scanner.nextLine();
        System.out.println("Quel est la date de publication ?");
        String datePublication = scanner.nextLine();

        Livre livre = new Livre(titre, description, datePublication, genre);
        livres.add(livre);

        System.out.println("Votre livre :");
        System.out.println(livre);
        System.out.println("Votre collection :");
        System.out.println(livres);
    }

    public Livre getLivre(Livre livre){
        return livre;

    }
    public void remove() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel livre souhaitez vous supprimer ?");
        String suppression = scanner.nextLine();
        for (Livre livre : this.livres) {
            System.out.println(livre);
            livres.remove(getLivre(livre));
            System.out.println("Votre collection :");
            System.out.println(livres);
        }
    }

    public void findAll(){
        System.out.println("Vos livres :" +
                "\n\t"+livres);
    }

    public void findAllByName(){
        String nom = "";
        for (int i = 0; i <livres.toArray().length ; i++) {
             nom = nom +" "+ livres.get(i).getTitre();
        }
        System.out.println("Vos livres:"+nom
                );
    }
}

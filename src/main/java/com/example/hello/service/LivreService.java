package com.example.hello.service;

import com.example.hello.model.Livre;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class LivreService {
    public void add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est le titre du livre ?");
        String titre = scanner.nextLine();
        System.out.println("Quel est la description du livre ?");
        String description = scanner.nextLine();
        System.out.println("Quel est la date de publication ?");
        String datePublication = scanner.nextLine();

        Livre livre = new Livre(titre, description, datePublication);
        System.out.println(livre);
    }

    public Livre getLivre(){
        return new Livre();
 }
}

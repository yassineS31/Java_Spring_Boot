package com.example.hello.controller;

import com.example.hello.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class LivreController {

    @Autowired
    private LivreService livreService;

    public void router(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que voulez vous faire ?");
        System.out.println("4 choix possible :");
        System.out.println("'Ajouter', 'supprimer', 'afficher' pour afficher la liste des livres ou 'quitter'");
        String choix = scanner.nextLine();
        switch (choix) {
            case "Ajouter": livreService.add();
            case "supprimer":livreService.remove();
            case "afficher":livreService.findAllByName();
            case "quitter":
                System.out.println("Processus terminé");
        }

    }
}

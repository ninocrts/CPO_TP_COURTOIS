
import java.util.Scanner;

   
public class Partie {
    private int nbCoups;
    private GrilleDeJeu grille;
    
    
    
public Partie(){
    grille = new GrilleDeJeu(4 , 4);
    nbCoups = 0;
}    
    
public void initialiserPartie(){
    grille.melangerMatriceAleatoirement(4);
    
}

public void lancerPartie(){
    Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans le jeu LightOff!");

        while (grille.cellulesToutesEteintes() != true) {

            System.out.println(grille);

            System.out.println("Choisissez l'action :");

            System.out.println("1) Activer une ligne");

            System.out.println("2) Activer une colonne");

            System.out.println("3) Activer la diagonale montante");

            System.out.println("4) Activer la diagonale descendante");

            System.out.println("Entrez le numéro de l'action : ");

            int action = scanner.nextInt();

            switch (action) {

                case 1 -> {

                    System.out.println("Entrez le numéro de la ligne à activer : ");

                    int ligneChoisie = scanner.nextInt();

                    grille.activerLigneDeCellules(ligneChoisie);

                }

                case 2 -> {

                    System.out.println("Entrez le numéro de la colonne à activer : ");

                    int colonneChoisie = scanner.nextInt();

                    grille.activerColonneDeCellules(colonneChoisie);

                }

                case 3 ->

                    grille.activerDiagonaleMontante();

                case 4 ->

                    grille.activerDiagonaleDescendante();

                default ->

                    System.out.println("Choix invalide. Veuillez choisir une autre action");

 

            }

            nbCoups++;

            System.out.println("Nombre de coups : " + nbCoups);

            grille.toString();

        }

        System.out.println("Félicitations! Vous avez éteint toutes les cellules en " + nbCoups + " coups.");

    }

}
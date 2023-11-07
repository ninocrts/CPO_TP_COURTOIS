

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Random;
import projet_lightsoff_courtois_nino.CelluleLumineuse;
/**
 *
 * @author utilisateur
 */
public class GrilleDeJeu {
    public CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

    // Constructeur de la classe
    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        // Initialisation de la matrice avec des cellules lumineuses éteintes
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    // Méthode pour éteindre toutes les cellules de la grille
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].EteindreCellule();
            }
        }
    }

    // Méthode pour activer de manière aléatoire une ligne, une colonne ou une diagonale
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int choix = random.nextInt(3); // 0 pour ligne, 1 pour colonne, 2 pour diagonale

        switch (choix) {
            case 0:
                int ligne = random.nextInt(nbLignes);
                for (int j = 0; j < nbColonnes; j++) {
                    matriceCellules[ligne][j].ActiverCellule();
                }
                break;
            case 1:
                int colonne = random.nextInt(nbColonnes);
                for (int i = 0; i < nbLignes; i++) {
                    matriceCellules[i][colonne].ActiverCellule();
                }
                break;
            case 2:
                // Activation de la diagonale descendante
                for (int i = 0; i < nbLignes; i++) {
                    matriceCellules[i][i].ActiverCellule();
                }
                // Activation de la diagonale montante
                for (int i = 0; i < nbLignes; i++) {
                    matriceCellules[i][nbColonnes - i - 1].ActiverCellule();
                }
                break;
        }
    }

    // Méthode pour mélanger la matrice de cellules aléatoirement
    public void melangerMatriceAleatoirement(int nbTours) {
        eteindreToutesLesCellules();
        Random random = new Random();
        for (int tour = 0; tour < nbTours; tour++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }

    // Méthode pour activer une ligne spécifique de cellules
    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].ActiverCellule();
        }
    }

    // Méthode pour activer une colonne spécifique de cellules
    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].ActiverCellule();
        }
    }

    // Méthodes pour activer les diagonales
    public void activerDiagonaleDescendante() {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][i].ActiverCellule();
        }
    }

    public void activerDiagonaleMontante() {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][nbColonnes - i - 1].ActiverCellule();
        }
    }

    // Méthode pour vérifier si toutes les cellules de la grille sont éteintes
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if ((matriceCellules[i][j]).GetEtat()) {
                    return false; // Au moins une cellule est allumée
                } else {
                }
            }
        }
        return true; // Toutes les cellules sont éteintes
    }

    // Redéfinition de la méthode toString pour afficher l'état de la grille
    @Override
    public String toString() {
        StringBuilder grilleString = new StringBuilder();

        // Affichage des indices de colonnes
        grilleString.append(" |");
        for (int j = 0; j < nbColonnes; j++) {
            grilleString.append(" ").append(j).append(" |");
        }
        grilleString.append("\n");

        // Ligne de séparation
        grilleString.append("-+");
        for (int j = 0; j < nbColonnes; j++) {
            grilleString.append("---+");
        }
        grilleString.append("\n");

        // Affichage de l'état des cellules
        for (int i = 0; i < nbLignes; i++) {
            grilleString.append(i).append("|");
            for (int j = 0; j < nbColonnes; j++) {
                grilleString.append(" ").append(matriceCellules[i][j]).append(" |");
            }
            grilleString.append("\n");

            // Ligne de séparation
            grilleString.append("-+");
            for (int j = 0; j < nbColonnes; j++) {
                grilleString.append("---+");
            }
            grilleString.append("\n");
        }

        return grilleString.toString();
    }
}
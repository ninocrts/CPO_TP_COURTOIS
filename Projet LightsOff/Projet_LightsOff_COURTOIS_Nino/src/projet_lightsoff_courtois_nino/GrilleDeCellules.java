package projet_lightsoff_courtois_nino;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Random;
/**
 *
 * @author utilisateur
 */
public class GrilleDeCellules {
    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;
    private Random random;

    // Constructeur pour créer une nouvelle grille de jeu avec le nombre spécifié de lignes et de colonnes
    public GrilleDeCellules(int p_nbLignes, int p_nbColonnes) {
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        random = new Random();

        // Initialisation de la matriceCellules avec des nouvelles cellules lumineuses
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

    // Méthode pour activer aléatoirement une ligne, une colonne ou une diagonale de cellules
    public void activerLigneColonneOuDiagonaleAleatoire() {
        int choix = random.nextInt(3); // 0 pour ligne, 1 pour colonne, 2 pour diagonale

        switch (choix) {
            case 0:
                activerLigneDeCellules(random.nextInt(nbLignes));
                break;
            case 1:
                activerColonneDeCellules(random.nextInt(nbColonnes));
                break;
            case 2:
                if (random.nextBoolean()) {
                    activerDiagonaleDescendante();
                } else {
                    activerDiagonaleMontante();
                }
                break;
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

    // Méthode pour activer la diagonale descendante de cellules
    public void activerDiagonaleDescendante() {
        int min = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < min; i++) {
            matriceCellules[i][i].ActiverCellule();
        }
    }

    // Méthode pour activer la diagonale montante de cellules
    public void activerDiagonaleMontante() {
        int min = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < min; i++) {
            matriceCellules[i][nbColonnes - i - 1].ActiverCellule();
        }
    }

    // Méthode pour vérifier si toutes les cellules de la grille sont éteintes
    public boolean cellulesToutes;
}

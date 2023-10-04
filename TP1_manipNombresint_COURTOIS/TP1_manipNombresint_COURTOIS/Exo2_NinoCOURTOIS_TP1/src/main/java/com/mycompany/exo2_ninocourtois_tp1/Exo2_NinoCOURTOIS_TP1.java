/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
/**
 * Nino COURTOIS EXO2
 * TP1
 *
 */
package com.mycompany.exo2_ninocourtois_tp1;

public class Exo2_NinoCOURTOIS_TP1
{

    public static void main(String[] args) {
        //Declaration des variables
        int nb; // nombre dentiers a additionner
        int result; // resultat
        int ind; //indice
        nb = 5;
        result = 0;
// Addition des nb premiers entiers
        ind = 1;
        while (ind <= nb) {
            result = result + ind;
        }
// Affichage du resultat
        System.out.println();
        System.out.println("La somme des " + nb + "entiers est: " + result);
    }
}

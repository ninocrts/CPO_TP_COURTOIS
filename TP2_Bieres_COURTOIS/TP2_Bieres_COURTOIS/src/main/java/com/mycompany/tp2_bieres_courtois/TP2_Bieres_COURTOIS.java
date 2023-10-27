/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_bieres_courtois;



public class TP2_Bieres_COURTOIS {
    
    public static void main(String[] args) {
        
        
    // PREMIERE PARTIE DU TP
    /*BouteilleBiere uneBiere = new BouteilleBiere();
    uneBiere.nom = "Cuvée des trolls";
    uneBiere.degreAlcool = 7.0 ;
    uneBiere.brasserie = "Dubuisson";
    uneBiere.ouverte = false;
    uneBiere.lireEtiquette();

    BouteilleBiere Biere2 = new BouteilleBiere ();
    Biere2.nom = "Leffe";
    Biere2.degreAlcool = 6.6;
    Biere2.brasserie = "Abbaye de Leffe";
    Biere2.lireEtiquette();
*/
    //DEUXIEME PARTIE DU TP
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",
    7 ,"Dubuisson") ;
    uneBiere.lireEtiquette();
 /*   
    BouteilleBiere Biere2 = new BouteilleBiere("Amsterdamer",
    11, "Brasserie Clément") ;
    Biere2.lireEtiquette();
    
    Biere2.ouverte = true;
    
    System.out.println(Biere2);
*/
 
 
 

 
 
 
}
}

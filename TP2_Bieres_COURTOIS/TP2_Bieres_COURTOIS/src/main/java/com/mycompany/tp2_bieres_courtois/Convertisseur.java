/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_bieres_courtois;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author utilisateur
 */
       public class Convertisseur {
    int nbConversions;
    public static double CelciusVersKelvin (double tCelcius) {
    return(tCelcius+273.15);
    }
    public static double KelvinVersCelcius (double tKelvin) {
    return(tKelvin-273.15);
}
    public static double FarenheitVersCelcius(double tFahrenheit) {
        double celsius = (tFahrenheit - 32) * 5/9;
        return celsius;
    }
    public static double CelciusVersFarenheit (double tCelcius) {
    return(tCelcius*1.8+32);
}
    public static double KelvinVersFarenheit (double tKelvin) {
    return((tKelvin-273.15)*1.8+32);
}
    public static double FarenheitVersKelvin (double tFarenheit) {
    return(CelciusVersKelvin(FarenheitVersCelcius(tFarenheit)));  
}
    
    
          
    public String toString () {
    return "nb de conversions"+ nbConversions;
        
    }
     }  


    /*
     Scanner sc;  
     sc = new Scanner(System.in);
     System.out.println("valeur1 ?");
     double valeur1 = sc.nextDouble();
     System.out.println(valeur1);
     double valeur2;
     valeur2 = valeur1 + 273;
     System.out.println(valeur2);
    */
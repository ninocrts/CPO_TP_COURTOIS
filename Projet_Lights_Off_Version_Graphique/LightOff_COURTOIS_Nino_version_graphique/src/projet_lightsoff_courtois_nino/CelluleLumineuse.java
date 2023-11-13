package projet_lightsoff_courtois_nino;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author utilisateur
 */
public class CelluleLumineuse {  
    
boolean etat;

public CelluleLumineuse () {
    etat = false;
}

public void ActiverCellule(){
if (etat == true){
    etat = false;
}
else {
    etat = true;
}
}

    public void EteindreCellule(){
    etat = false;
    }

    public boolean EstEteint(){
    return !(etat);
}
    public boolean GetEtat() {
   return etat;
}
}

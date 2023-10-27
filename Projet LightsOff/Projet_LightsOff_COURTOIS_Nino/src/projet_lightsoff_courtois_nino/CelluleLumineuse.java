/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_lightsoff_courtois_nino;

/**
 *
 * @author utilisateur
 */
public class CelluleLumineuse {  
    
boolean EstAllumee;

public CelluleLumineuse () {
    EstAllumee = false;
}

public void ActiverCellule(){
if (EstAllumee == true){
    EstAllumee = false;
}
else {
    EstAllumee = true;
}
}

    public void EteindreCellule(){
    EstAllumee = false;
    }

    public boolean EstEteint(){
    return !(EstAllumee);
}
    public void GetEtat() {
    if (EstAllumee == true) {
        System.out.println("X");
    }
    else{
        System.out.println("O");
    }
}
}


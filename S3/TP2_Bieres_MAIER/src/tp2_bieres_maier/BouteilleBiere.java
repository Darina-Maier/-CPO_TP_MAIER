/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_maier;

/**
 *
 * @author maier
 */
public class BouteilleBiere {
    String Nom;
    double degreAlcool;
    String brasserie; 
    boolean ouverte; 
    
public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) { 
    Nom = unNom; 
    degreAlcool = unDegre; 
    brasserie = uneBrasserie; 
    ouverte = false; 
}
    
    public void lireEtiquette() { 
        System.out.println("Bouteille de " + Nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ; 
    }  
    
    public boolean Decapsuler() {
        if (ouverte == false) {
            ouverte = true;
            return ouverte;
        } else {
            System.out.print("erreur : biere déjà ouverte");
            return false; 
        }
    }
}

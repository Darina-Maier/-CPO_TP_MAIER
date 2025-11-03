/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_maier;

/**
 *
 * @author maier
 */
public class TP2_Bieres_MAIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere() ; 
        uneBiere.Nom = "Cuvée des Trolls";
        uneBiere.degreAlcool = 7.0;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false;
        uneBiere.lireEtiquette(); 
        
        BouteilleBiere Biere2 = new BouteilleBiere();
        Biere2.Nom = " Leffe";
        Biere2.degreAlcool = 6.6;
        Biere2.brasserie = " Abbaye de Leffe";
        Biere2.lireEtiquette();
    }
    
}

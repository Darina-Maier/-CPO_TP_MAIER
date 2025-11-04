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
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson"); 
        uneBiere.lireEtiquette(); 
        uneBiere.Decapsuler();
        System.out.println(uneBiere) ; 
        
        BouteilleBiere Biere2 = new BouteilleBiere ("Leffe", 6.6, " Abbaye de Leffe");
        Biere2.lireEtiquette();
        System.out.println(Biere2) ; 
        
        BouteilleBiere Biere3 = new BouteilleBiere ("Heineken", 5.0, " Heineken N.V");
        Biere2.lireEtiquette();
        System.out.println(Biere3) ;
    }
     
   
    
}

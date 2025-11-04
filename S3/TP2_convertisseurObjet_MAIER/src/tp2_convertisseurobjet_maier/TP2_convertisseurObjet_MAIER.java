/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_maier;

import java.util.Scanner;

/**
 *
 * @author maier
 */
public class TP2_convertisseurObjet_MAIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur conv = new Convertisseur ();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Bonjour, saisissez une valeur");
        double valeur = sc.nextDouble();
        
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :");
        System.out.println("1) De Celcius vers Kelvin ");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Celcius vers Farenheit");
        System.out.println("4) De Kelvin vers Farenheit");
        System.out.println("5) De Farenheit vers Kelvin");   
        
        int choix = sc.nextInt();
        double resultat =0;
        
        switch (choix) {
            case 1:
                resultat = conv.CelciusVersKelvin(valeur);
                break;
            case 2:
                resultat = conv.KelvinVersCelcius(valeur);
                break;
            case 3:
                resultat = conv.FarenheitVersCelcius(valeur);
                break;
            case 4:
                resultat = conv.CelciusVersFarenheit(valeur);
                break;
            case 5:
                resultat = conv.KelvinVersFarenheit(valeur);
                break;
            case 6:
                resultat = conv.FarenheitVersKelvin(valeur);
                break;
            default:
                break;
        }
         
        System.out.println("La valeur est de" + resultat);
    }
    
   
}

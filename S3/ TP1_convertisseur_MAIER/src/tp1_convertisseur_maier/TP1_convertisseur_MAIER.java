package tp1_convertisseur_maier;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author maier
 */
public class TP1_convertisseur_MAIER {

    /**
     * @param args the command line arguments
     */
    
    public static double CelciusVersKelvin (double tCelcius) { 
        return tCelcius + 273.15;
    }
    
    public static double KelvinVersCelcius (double tKelvin) {
        return tKelvin - 273.15;
    }
    
    public static double FarenheitVersCelcius (double tFarenheit) {
        return (tFarenheit-32.0)*5/9;
    }  
    
    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius*9/5)+32;
    }
    
    public static double KelvinVersFarenheit(double tKelvin) {
        return (tKelvin-273.15)*9/5+32;
    }
    
    public static double FarenheitVersKelvin(double tFarenheit) {
        return (tFarenheit-32)*5/9+273.15;
    }
    
    public static void main(String[] args) {
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
        
        if (choix == 1) {
        resultat = CelciusVersKelvin(valeur);
        }
        
        else if (choix == 2) {
            resultat = KelvinVersCelcius(valeur);
        }
        
        else if (choix == 3) {
            resultat = FarenheitVersCelcius(valeur);
        }
        
        else if (choix == 4) {
            resultat = CelciusVersFarenheit(valeur);
        }
        
        else if (choix == 5) {
            resultat = KelvinVersFarenheit(valeur);
        }
             
        else if (choix == 6) {
            resultat = FarenheitVersKelvin(valeur);
        }
         
        System.out.println("La valeur est de" + resultat);
    }
    
}

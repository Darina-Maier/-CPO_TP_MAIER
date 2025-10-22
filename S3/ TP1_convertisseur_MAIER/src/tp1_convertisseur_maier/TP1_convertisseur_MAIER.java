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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisi une valeur");
        double valeur = sc.nextDouble();
        System.out.println("La veleur est" + valeur);
        
        double temp = valeur + 273;
        System.out.println("La tempértaure est de : " + temp + "K" );
        
        
    }
    
}

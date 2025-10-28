/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_maier;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author maier
 */

public class TP1_stats_MAIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random nbAlea = new Random();
        
        int[] dé = new int [6];
      
        System.out.println("Saisissez le nombre de lancers");
        int m = sc.nextInt();
        
        for (int i = 0; i<m; i++) {
            int tirage = nbAlea.nextInt(6);
            dé[tirage]++;
        }
        System.out.println("Voici le tableau correspondant :");
        for (int i = 0; i<6; i++) {
            System.out.println("Face " +(i+1)+ ":" +dé[i]);
        }
        System.out.println("Voici le pourcentage pour chaque face :");
        for (int i = 0; i<6;i++) {
            double pourcentage = (dé[i]*100.0)/m;
            System.out.println("Face" +(i+1)+ ":" +pourcentage + "%");
        }
        
    }
    
}

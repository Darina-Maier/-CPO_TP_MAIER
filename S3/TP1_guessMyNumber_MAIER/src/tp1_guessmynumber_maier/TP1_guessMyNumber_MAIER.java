/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_maier;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author maier
 */
public class TP1_guessMyNumber_MAIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        
        System.out.println("Voici les 5 nombres aléatoires :");
        for (int i =0; i<5; i++) {
            int nb = generateurAleat.nextInt(101);
            System.out.println(nb);
        }
    }
    
}

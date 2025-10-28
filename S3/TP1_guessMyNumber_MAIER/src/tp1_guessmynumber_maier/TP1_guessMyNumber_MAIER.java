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
        
        System.out.println("Choisissez un niveau de dificulté :facile / normal / difficile");
        System.out.print("Entrez le niveau :");
        String niveau = sc.next().toLowerCase();
        
        int tentativeMax = 0;
        if (niveau.equals("facile")) {
            tentativeMax = 20;
        }
        else if (niveau.equals("normal")){
            tentativeMax = 10;
        }
        else if (niveau.equals("difficile")){
            tentativeMax = 5;
        }
                
        
        int nombreAlea = generateurAleat.nextInt(101); 
        int nombreUtilisateur = -1;
        int cpt=0;
        
        System.out.println("Devinez un nombre entre 0 et 100");
         
        while(nombreUtilisateur != nombreAlea && cpt<tentativeMax) {
            System.out.println("Entrez un nombre: ");
            nombreUtilisateur = sc.nextInt();
            cpt++;
            
            if (nombreUtilisateur < nombreAlea){
                System.out.println("trop petit");
            }
            else if (nombreUtilisateur > nombreAlea){
                System.out.println("trop grand");
            }
        }
        if (nombreUtilisateur == nombreAlea){
            System.out.println("Vous avez gagné");
            System.out.println("Nombre de tentative :" +cpt);
        }
        else {
            System.out.println("Vous avez perdu");
        }
    }
    
}

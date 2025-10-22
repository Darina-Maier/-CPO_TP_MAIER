package tp1_manipnombresint_maier;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *clavier
 * @author maier
 */
public class TP1_manipNombresInt_Maier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez nombre 1 :");
        int nombre1 = sc.nextInt();
        System.out.print("Entrez nombre 2 :");
        int nombre2 = sc.nextInt();
        
        int somme = nombre1 + nombre2;
        int difference = nombre1 - nombre2;
        int produit = nombre1*nombre2;
        
        System.out.println("La somme est de " +somme);
        System.out.println("La différence est de " + difference);
        System.out.println("Le produit est de " + produit);
        
        int quotient = nombre1/nombre2; 
        int reste = nombre1 % nombre2;
        
        System.out.println("Le quotient est de " + quotient);
        System.out.println("Le reste est de: " + reste);
        
        
        
    }
    
}

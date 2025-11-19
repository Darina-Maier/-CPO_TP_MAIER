/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_maier;

import java.util.ArrayList;

/**
 *
 * @author maier
 */
public class TP3_Heroic_Fantasy_MAIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee Epee1 = new Epee ("Excalibur", 7,5); 
        Epee Epee2 = new Epee ("Durandal", 4,7);
        
        Baton Baton1 = new Baton ("Chêne", 4, 5);
        Baton Baton2 = new Baton ("Charme", 5, 6);
    
        ArrayList<String> TabArmes = new ArrayList<String>();
        TabArmes.add("Epee1"); 
        TabArmes.add("Epee2"); 
        TabArmes.add("Baton1"); 
        TabArmes.add("Baton2"); 
        
        for (int i = 0; i < TabArmes.size(); i++) {
            System.out.println(TabArmes.elementAt(i));
        }
        
        
    }
    
}

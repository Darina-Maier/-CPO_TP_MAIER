/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maier
 */
public class combinaison4 {
    private int[] combinaison;
    private int tentativesRestantes =5; 

    public combinaison4() {
        combinaison = new int[4];
        genererCombiAleat();
    }

    private void genererCombiAleat() {
        for (int i = 0; i < combinaison.length; i++) {
            combinaison[i] = (int)(Math.random() * 10);
        }
    }

    public int[] verifierEssai(int[] essai) {
        int correct = 0;
        int tropHauts = 0;
        int tropBas = 0;

        for (int i = 0; i < 4; i++) {
            if (essai[i] == combinaison[i]) {
                correct++;
            } else if (essai[i] > combinaison[i]) {
                tropHauts++;
            } else {
                tropBas++;
            }
        }

        tentativesRestantes--;
        return new int[]{correct, tropHauts, tropBas};
    }
    
    public int[] getCombinaison() {
        return combinaison;
    }   
}
        
    


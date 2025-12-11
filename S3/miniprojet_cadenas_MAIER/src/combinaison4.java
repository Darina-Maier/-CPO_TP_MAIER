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
    private int tentativesRestantes;
    private final int MAX_TENTATIVES = 10; 
    private boolean partieGagnee;
    private boolean partieTerminee;

    public combinaison4() {
        combinaison = new int[4];
        tentativesRestantes = MAX_TENTATIVES;
        partieGagnee = false;
        partieTerminee = false;
        genererCombiAleat();
    }

    private void genererCombiAleat() {
        for (int i = 0; i < combinaison.length; i++) {
            combinaison[i] = (int)(Math.random() * 10);
        }
    }

    public int[] verifierEssai(int[] essai) {
        if (partieTerminee) {
            return null;
        }
        
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
        
        if (correct == 4) {
            partieGagnee = true;
            partieTerminee = true;
        }
        
        if (tentativesRestantes == 0 && !partieGagnee) {
            partieTerminee = true;
        }
        
        return new int[]{correct, tropHauts, tropBas};
    }
    
    public int[] getCombinaison() {
        return combinaison;
    }
    
    public int getTentativesRestantes() {
        return tentativesRestantes;
    }
    
    public boolean isPartieGagnee() {
        return partieGagnee;
    }
    
    public boolean isPartieTerminee() {
        return partieTerminee;
    }
    
    public void nouvellePartie() {
        tentativesRestantes = MAX_TENTATIVES;
        partieGagnee = false;
        partieTerminee = false;
        genererCombiAleat();
    }
}
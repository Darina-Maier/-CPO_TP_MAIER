/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maier
 */
public class combinaison4 {
    private int[] combiSecrete = new int[4];
    private int[] combiTestee = new int[4];
    private int tentativesRestantes = 5;
    private boolean partieTerminee = false;
    private boolean partieGagnee = false;

    public combinaison4() {
        genererCombiAleat();
    }

    private void genererCombiAleat() {
        for (int i = 0; i < 4; i++) {
            combiSecrete[i] = (int)(Math.random() * 10);
        }
    }

    public void augmenterChiffre(int indice) {
        combiTestee[indice]++;

        if (combiTestee[indice] == 10) {
            combiTestee[indice] = 0; 
        }
    }

    public void diminuerChiffre(int indice) {
        combiTestee[indice]--;

        if (combiTestee[indice] == -1) {
            combiTestee[indice] =9; 
        }
    }
    
    public int[] comparer() {

    if (partieTerminee) {
        return new int[] {0, 0, 0};
    }

    int exact = 0;
    int haut = 0;
    int bas = 0;

    for (int i = 0; i < 4; i++) {
        if (combiSecrete[i] == combiTestee[i]) {
            exact++;
        } else if (combiTestee[i] > combiSecrete[i]) {
            haut++;
        } else {
            bas++;
        }
    }

    tentativesRestantes--;

    if (exact == 4) {
        partieGagnee = true;
        partieTerminee = true;
    }

    if (tentativesRestantes == 0 && !partieGagnee) {
        partieTerminee = true;
    }

    return new int[] { exact, haut, bas };
 
    }

    public int getTentatives() {
        return tentativesRestantes;
    }

    public int[] getCombiTestee() {
        return combiTestee;
    }

    public int[] getCombiSecrete() {
        return combiSecrete;
    }
    
    public boolean isPartieTerminee() {
    return partieTerminee;
    }

    public boolean isPartieGagnee() {
    return partieGagnee;
    }
        
    public void nouvellePartie() {
        tentativesRestantes = 5;
        partieTerminee = false;
        partieGagnee = false;
        genererCombiAleat();
        combiTestee = new int[4];
    }
}

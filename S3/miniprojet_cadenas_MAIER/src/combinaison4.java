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

        if (combiTestee[indice] == -1) {
            combiTestee[indice] = 5; 
        }
    }

    public void diminuerChiffre(int indice) {
        combiTestee[indice]--;

        if (combiTestee[indice] == -1) {
            combiTestee[indice] = 5; 
        }
    }

    public int[] comparer() {

        int exact = 0;
        int haut = 0;
        int bas = 0;

        for (int i = 0; i < 4; i++) {

            int cs = combiSecrete[i];
            int ct = combiTestee[i];

            if (cs == ct) {
                exact++;
            } else if (cs < ct) {
                haut++;   
            } else {
                bas++;    
            }
        }

        tentativesRestantes--;

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
        
    public void nouvellePartie() {
        tentativesRestantes = 5;
        genererCombiAleat();
        combiTestee = new int[4];
    }
}

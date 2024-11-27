/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_dauguet_boisson;

import java.util.ArrayList;

/**
 *
 * @author daugu
 */
public class PlateauDeJeu {
    private Combinaison combinaisonSecrete;
    private int nbToursMax;
    private  ArrayList <Combinaison> tentatives;
    private  ArrayList <String> reponses;

    public PlateauDeJeu(Combinaison combinaisonSecrete, int nbToursMax, ArrayList<Combinaison> tentatives, ArrayList<String> reponses) {
        this.combinaisonSecrete = combinaisonSecrete;
        this.nbToursMax = nbToursMax;
        this.tentatives = tentatives;
        this.reponses = reponses;
    }
    public void proposerCombinaison(Combinaison tentatives){
        tentatives.add(tentatives);
        int rouges = 0; // Bons éléments bien placés
        int blancs = 0; // Bons éléments mal placés
        for (int i = 0; i < 4; i++) {
            if (combinaisonSecrete.get(i) == tentatives.get(i)) {
               rouges++;
            } else if (combinaisonSecrete.contient(tentatives.get(i))) {
               blancs++;
        }
    }


    }
    public void afficherPlateau(){
        
    }
    public void estVictoire(){
        
    }
    public void estDefaite(){
        
    }
}

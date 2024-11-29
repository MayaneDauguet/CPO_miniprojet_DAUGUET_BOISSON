/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_dauguet_boisson;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author daugu
 */
public class Combinaison {
    private Pion[] elements; // Tableau de Pions représentant la combinaison
    private int taille = 4; // Taille de la combinaison (fixe à 4 pour le projet)
    
    public Combinaison(Pion[] elements) {
        // On utilise "this.elements" pour désigner l'attribut de la classe,
        // et "elements" pour désigner l'argument passé au constructeur.
        this.elements = elements; 
    }
    
    // A partir d'ici c'est copie colle de chat gpt, faut vérifier 
    // J'ai meme pas pu tester dans le code principal (faut vraiment revoir)
    // Getter pour l'attribut 'elements'
    public Pion[] getElements() {
        return elements;
    }

    // Getter pour l'attribut 'taille'
    public int getTaille() {
        return taille;
    }

    // Méthode pour générer une combinaison aléatoire
    public void genererAleatoire(int taille, ArrayList<Character> couleursDisponibles) {
        Random rand = new Random(); // Création d'un générateur de nombres aléatoires
        Pion[] combinaisonAleatoire = new Pion[taille]; // Tableau pour la nouvelle combinaison

        // Remplir le tableau avec des Pions aléatoires
        for (int i = 0; i < taille; i++) {
            // Choisir une couleur aléatoire parmi les couleursDisponibles
            char couleurAleatoire = couleursDisponibles.get(rand.nextInt(couleursDisponibles.size()));
            // Créer un nouveau Pion avec cette couleur
            combinaisonAleatoire[i] = new Pion(couleurAleatoire);
        }

        
    } 
}

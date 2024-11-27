/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_dauguet_boisson;

/**
 *
 * @author daugu
 */
public class Pion {
    private char couleur; // Attribut pour représenter la couleur du pion

    // Constructeur 
    public Pion(char couleur) {
        this.couleur = couleur;
    }

    public char getCouleur() {
        return couleur;
    }

    // Méthode toString pour une représentation textuelle
    @Override
    public String toString() {
        return Character.toString(couleur);
    }
}

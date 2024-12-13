/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsofff_dauguet_boisson;

/**
 *
 * @author Inès
 */
public class CelluleLumineuse {
    // Attribut
    private boolean etat; // true si allumée, false si éteinte

    // Constructeur par défaut
    public CelluleLumineuse() {
        this.etat = false; // Par défaut, la cellule est éteinte (false)
    }

    // Méthode pour activer (inverser l'état de la cellule)
    public void activerCellule() {
        this.etat = !this.etat; // Inverse l'état (true -> false, false -> true)
    }

    // Méthode pour éteindre la cellule
    public void eteindreCellule() {
        this.etat = false; // Force l'état à éteint (false)
    }

    // Méthode pour vérifier si la cellule est éteinte
    public boolean estEteinte() {
        return !this.etat; // Renvoie true si éteinte, false sinon
    }

    // Getter pour l'état de la cellule
    public boolean getEtat() {
        return this.etat; // Renvoie true si allumée, false si éteinte
    }

    // Méthode toString pour afficher la cellule
    
}
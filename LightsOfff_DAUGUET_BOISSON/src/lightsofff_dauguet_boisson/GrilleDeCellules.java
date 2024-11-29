/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsofff_dauguet_boisson;

/**
 *
 * @author Inès
 */
public class GrilleDeCellules {
    // Attributs
    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

    // Constructeur
    public GrilleDeCellules(int p_nbLignes, int p_nbColonnes) {
        this.nbLignes = p_nbLignes;
        this.nbColonnes = p_nbColonnes;
        // Initialisation de la grille
        this.matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse(); // Chaque cellule est éteinte par défaut
            }
        }
    }

    // Méthode pour éteindre toutes les cellules
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    // Méthode toString pour afficher la grille
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("   ");
        for (int col = 0; col < nbColonnes; col++) {
            sb.append("| ").append(col).append(" ");
        }
        sb.append("|\n");
        sb.append("---".repeat(nbColonnes + 1)).append("\n");
        for (int i = 0; i < nbLignes; i++) {
            sb.append(" ").append(i).append(" ");
            for (int j = 0; j < nbColonnes; j++) {
                sb.append("| ").append(matriceCellules[i][j].toString()).append(" ");
            }
            sb.append("|\n");
            sb.append("---".repeat(nbColonnes + 1)).append("\n");
        }
        return sb.toString();
    }

    // Getters (si nécessaire pour d'autres fonctionnalités)
    public int getNbLignes() {
        return nbLignes;
    }

    public int getNbColonnes() {
        return nbColonnes;
    }

    public CelluleLumineuse[][] getMatriceCellules() {
        return matriceCellules;
    }
}

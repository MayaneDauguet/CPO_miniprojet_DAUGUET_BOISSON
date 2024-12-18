/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightsofff_dauguet_boisson;

/**
 *
 * @author daugu
 */
public class LightsOfff_DAUGUET_BOISSON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Test de la classe CelluleLumineuse :");
    CelluleLumineuse cellule = new CelluleLumineuse();
    System.out.println("Etat initial de la cellule : " + cellule);
    cellule.activerCellule();
    System.out.println("Après activation de la cellule : " + cellule);
    cellule.eteindreCellule();
    System.out.println("Après extinction de la cellule : " + cellule);
    System.out.println();

    System.out.println("Test de la classe GrilleDeCellules :");
    GrilleDeCellules grille = new GrilleDeCellules(10, 10);
    System.out.println("Grille initiale :");
    System.out.println(grille);

    grille.activerLigneDeCellules(2);
    System.out.println("Après activation de la ligne 2 :");
    System.out.println(grille);

    grille.activerColonneDeCellules(3);
    System.out.println("Après activation de la colonne 3 :");
    System.out.println(grille);

    grille.activerDiagonaleDescendante();
    System.out.println("Après activation de la diagonale descendante :");
    System.out.println(grille);

    System.out.println("Toutes les cellules sont-elles éteintes ? " + grille.cellulesToutesEteintes());
    System.out.println();

    System.out.println("Test de la classe Partie :");
    Partie partie = new Partie(10, 10);
    partie.initialiserPartie();
    partie.lancerPartie();
}
}

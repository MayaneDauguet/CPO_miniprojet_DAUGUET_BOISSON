/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsofff_dauguet_boisson;
import java.util.Scanner;
/**
 *
 * @author Inès
 */
public class Partie {
    // Attributs
    private GrilleDeCellules grille; // Grille de cellules associée à la partie
    private int nbCoups;            // Compteur du nombre de coups joués

    // Constructeur
    public Partie(int nbLignes, int nbColonnes) {
        this.grille = new GrilleDeCellules(nbLignes, nbColonnes); // Création de la grille
        this.nbCoups = 0; // Initialisation du compteur de coups
    }

    // Méthode pour initialiser la partie
    public void initialiserPartie() {
        grille.eteindreToutesLesCellules(); // Éteindre toutes les cellules
        grille.melangerMatriceAleatoirement(5); // Mélanger la grille avec 5 tours par défaut
        System.out.println("La partie est initialisée !");
    }

    // Méthode pour lancer la partie
    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Début de la partie !");
        System.out.println("Voici la grille initiale :");
        System.out.println(grille);

        while (!grille.cellulesToutesEteintes()) {
            System.out.println("Choisissez une action : ");
            System.out.println("1 - Activer une ligne");
            System.out.println("2 - Activer une colonne");
            System.out.println("3 - Activer la diagonale descendante");
            System.out.println("4 - Activer la diagonale montante");

            int choix = scanner.nextInt();

            switch (choix) {
                case 1 -> {
                    System.out.print("Entrez le numéro de la ligne : ");
                    int ligne = scanner.nextInt();
                    grille.activerLigneDeCellules(ligne);
                }
                case 2 -> {
                    System.out.print("Entrez le numéro de la colonne : ");
                    int colonne = scanner.nextInt();
                    grille.activerColonneDeCellules(colonne);
                }
                case 3 -> grille.activerDiagonaleDescendante();
                case 4 -> grille.activerDiagonaleMontante();
                default -> System.out.println("Choix invalide. Réessayez.");
            }

            nbCoups++;
            System.out.println("Grille mise à jour :");
            System.out.println(grille);
        }

        System.out.println("Félicitations ! Vous avez éteint toutes les cellules !");
        System.out.println("Nombre total de coups : " + nbCoups);
    }
}

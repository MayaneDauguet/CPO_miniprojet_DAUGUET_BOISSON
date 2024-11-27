/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mastermind_dauguet_boisson;
import java.util.ArrayList;
/**
 *
 * @author daugu
 */
public class Mastermind_DAUGUET_BOISSON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pion pionRouge = new Pion('R'); // Pion rouge
        Pion pionBleu = new Pion('B');  // Pion bleu
        Pion pionVert = new Pion('V');  // Pion vert

        // Test des accesseurs
        System.out.println("Couleur du pion rouge : " + pionRouge.getCouleur()); // Affiche 'R'
        System.out.println("Couleur du pion bleu : " + pionBleu.getCouleur());   // Affiche 'B'
        System.out.println("Couleur du pion vert : " + pionVert.getCouleur());   // Affiche 'V'

        // Test de la méthode toString
        System.out.println("Representation textuelle du pion rouge : " + pionRouge); // Affiche 'R'
        System.out.println("Representation textuelle du pion bleu : " + pionBleu);   // Affiche 'B'
        System.out.println("Representation textuelle du pion vert : " + pionVert);   // Affiche 'V'
    }
    
    
}

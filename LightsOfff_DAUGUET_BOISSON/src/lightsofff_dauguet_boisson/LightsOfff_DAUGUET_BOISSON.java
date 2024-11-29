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
        CelluleLumineuse cellule = new CelluleLumineuse();
        System.out.println("État initial : " + cellule); // Affiche "O"
        cellule.activerCellule();
        System.out.println("Après activation : " + cellule); // Affiche "X"
        cellule.eteindreCellule();
        System.out.println("Après extinction : " + cellule); // Affiche "O"
   
    }
   
}

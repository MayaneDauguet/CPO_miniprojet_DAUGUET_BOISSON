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
    private boolean etat;

    public CelluleLumineuse() {
        this.etat = false;
    }

    public void activerCellule() {
        this.etat = !this.etat;
    }

    public void eteindreCellule() {
        this.etat = false;
    }

    public boolean estEteinte() {
        return !this.etat;
    }

    public boolean getEtat() {
        return this.etat;
    }

    @Override
    public String toString() {
        return this.etat ? "O" : "X";
    }
}
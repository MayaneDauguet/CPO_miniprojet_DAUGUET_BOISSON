/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsofff_dauguet_boisson;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author Inès
 */
public class CelluleGraphique extends JButton {
    int largeur; 
    int hauteur; 
    CelluleLumineuse celluleLumineuseAssociee;

    
    public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int l, int h) {
        this.largeur = l;
        this.hauteur = h;
        this.celluleLumineuseAssociee = celluleLumineuseAssociee;
        setPreferredSize(new Dimension(largeur, hauteur)); 
        setFocusPainted(false); 
        setBorderPainted(false); 
        setOpaque(true); // Pour que le fond soit coloré
        updateAppearance(); 
    }

    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        updateAppearance(); 
    }

    
    private void updateAppearance() {
        if (celluleLumineuseAssociee.estEteinte()) {
            setBackground(Color.DARK_GRAY); 
        } else {
            setBackground(Color.YELLOW); 
        }

        setText(""); 
    }
}
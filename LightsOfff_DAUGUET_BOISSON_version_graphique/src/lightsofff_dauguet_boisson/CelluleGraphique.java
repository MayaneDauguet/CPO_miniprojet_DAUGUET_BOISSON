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
    int largeur; // largeur en pixel de la cellule
    int hauteur; // hauteur en pixel de la cellule
    CelluleLumineuse celluleLumineuseAssociee;

    // Constructeur (appelé depuis FenetrePrincipale)
    public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int l, int h) {
        this.largeur = l;
        this.hauteur = h;
        this.celluleLumineuseAssociee = celluleLumineuseAssociee;
        setPreferredSize(new Dimension(largeur, hauteur)); // Définit la taille de chaque bouton
        setFocusPainted(false); // Enlève le focus pour une meilleure esthétique
        setBorderPainted(false); // Enlève les bordures par défaut
        setOpaque(true); // Pour que le fond soit coloré
        updateAppearance(); // Met à jour l'apparence initiale de la cellule
    }

    // Méthode gérant le dessin de la cellule
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        updateAppearance(); // Actualise l'apparence à chaque redessin
    }

    // Méthode pour mettre à jour l'apparence en fonction de l'état de la cellule
    private void updateAppearance() {
        // Change l'arrière-plan en fonction de l'état de la cellule
        if (celluleLumineuseAssociee.estEteinte()) {
            setBackground(Color.DARK_GRAY); // Fond sombre pour éteinte (X)
        } else {
            setBackground(Color.YELLOW); // Fond lumineux pour allumée (O)
        }

        setText(""); // Enlève le texte ("X" ou "O")
    }
}
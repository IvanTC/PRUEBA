/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola_mundo;

/**
 *
 * @author IvanTC
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class ICONO implements Icon{
 
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Image image = new ImageIcon(getClass().getResource("/recursos/icono.jpg")).getImage();
        g.drawImage(image, x, y, c);
    }
 
    @Override
    public int getIconWidth() {
        return 150;
    }
 
    @Override
    public int getIconHeight() {
        return 150;
    }
 
}

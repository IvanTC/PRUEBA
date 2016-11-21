/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola_git;

import javax.swing.JOptionPane;

/**
 *
 * @author IvanTC
 */
public class HOLA_GIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        nombre=JOptionPane.showInputDialog("DIME TU NOMBRE: ");
        JOptionPane.showMessageDialog(null, "HOLA "+nombre+" BIENVENIDO A LA PROGRAMACION EN GIT");
        JOptionPane.showMessageDialog(null, "ESTE ES UN SEGUNDO CAMBIO QUE SE HIZO DESDE NETBEANS");
        System.out.println("aki cambie");

    }
}


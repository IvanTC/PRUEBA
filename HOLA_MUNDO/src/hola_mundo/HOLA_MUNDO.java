/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola_mundo;

import javax.swing.JOptionPane;


/**
 *
 * @author IvanTC
 */
public class HOLA_MUNDO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //SHOW MESSAGE DIALOG
       //JOptionPane.showMessageDialog(null, "OPERACION REALIZADA CON EXITO");
       //JOptionPane.showMessageDialog(null, "MENSAJE DENTRO DE LA VENTANA", "MENSAJE DE LA BARRA", JOptionPane.ERROR_MESSAGE);
       //ICONO ic = new ICONO();
       //JOptionPane.showMessageDialog(null, "TITULO DENTRO DEL COMPONENTE", "TITULO EN LA BARRA", JOptionPane.DEFAULT_OPTION, ic);
      
       //JOptionPane.showMessageDialog(null, "CORRECTO", "AVISO",JOptionPane.INFORMATION_MESSAGE);
       String x;
       String y;
       int a;
       int b;
       int c;
       x=JOptionPane.showInputDialog("Ingresa el primer numero: ");
       a=Integer.parseInt(x);
       y=JOptionPane.showInputDialog("Ingrese el segundo numero: ");
       b=Integer.parseInt(y);
       c=a+b;
       JOptionPane.showMessageDialog(null, "LA SUMA DE A +B = "+c, "AVISO",JOptionPane.INFORMATION_MESSAGE);
       //SHOW INPUT DIALOG
       //nombre = JOptionPane.showInputDialog("Ingresa tu nombre: ");
      //a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa numero 1: ", "solo numeros"));
      //b = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESA EL NUMERO 2: ", "SOLO NUMEROS"));
      //c=a+b;
      //JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+c, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
      //a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ud. no ingreso un numero\nIngrese un numero: ", "INGRESE NUMERO", JOptionPane.ERROR_MESSAGE));
      /*String[] carreras = {
            "Ingeniería en sistemas computacionales",
            "Ingeniería industrial",
            "Ingeniería en mecatrónica",
            "Ingeniería en informatica",
            "Ingeniería petroquímica"
        };
      nombre = (String) JOptionPane.showInputDialog(null, "Seleccione una carrera a cursar", "Carrera", JOptionPane.DEFAULT_OPTION, null, carreras, carreras[0]);
        System.out.println(nombre);*/
      
      ///SHOW COFIRM DIALOG
      //int respuesta = JOptionPane.showConfirmDialog(null, "Estas seguro que deseas continuar?");
      //int respuesta = JOptionPane.showConfirmDialog(null, "En realidad desea continuar?", "ALERTA", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        
      //SHOW OPTIONS DIALOG
      //String [] opciones ={"OPCION A", "OPCION B", "OPCION C"};
      //int x = JOptionPane.showOptionDialog(null, "SELECCIONA UNA OPCION", "SELECCION",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
      //System.out.println(x);
      
      int ab = JOptionPane.showConfirmDialog(null, "deseaeas continuar");
      
    }   
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu1;

import javax.swing.JOptionPane;

/**
 *
 * @author I N T R I A G O 
 */
public class Menu1 {
public static void sumar(){
     int num1,num2,resultado;
     JOptionPane.showMessageDialog(null,"Ud ingreso a la opcion sumar: ");
    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
    num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
    resultado = num1 + num2;
    JOptionPane.showMessageDialog(null,"El resultado es: "+ resultado);
    }


 
    public static void main(String[] args) {

      
        
    }
    
}

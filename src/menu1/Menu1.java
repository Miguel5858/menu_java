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
     //JOptionPane.showMessageDialog(null,"Ud ingreso a la opcion sumar: ");
    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
    num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
    resultado = num1 + num2;
    JOptionPane.showMessageDialog(null,"El resultado es: "+ resultado);
    }

public static void restar(){
     int num1,num2,resultado;
     //JOptionPane.showMessageDialog(null,"Ud ingreso a la opcion sumar: ");
    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
    num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
    resultado = num1 - num2;
    JOptionPane.showMessageDialog(null,"El resultado es: "+ resultado);
    }

public static void multilicar(){
     int num1,num2,resultado;
     //JOptionPane.showMessageDialog(null,"Ud ingreso a la opcion sumar: ");
    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
    num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
    resultado = num1 * num2;
    JOptionPane.showMessageDialog(null,"El resultado es: "+ resultado);
    }
public static void dividir(){
     double num1,num2,resultado;
     JOptionPane.showMessageDialog(null,"Ud ingreso a la opcion dividir: ");
    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
    num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
    if(num2==0)
    {
    JOptionPane.showMessageDialog(null,"Error : Division por cero");
    }else
    {
     resultado = num1/num2;
     JOptionPane.showMessageDialog(null,"El resultado es: "+ resultado);
    }
}

public static void modulo(){
     float num1,num2,resultado;
     //JOptionPane.showMessageDialog(null,"Ud ingreso a la opcion sumar: ");
    num1 =  Float.parseFloat(JOptionPane.showInputDialog("Ingrese numero 1"));
    num2 =  Float.parseFloat(JOptionPane.showInputDialog("Ingrese numero 2"));
    resultado = num1 % num2;
    JOptionPane.showMessageDialog(null,"El resultado es: "+ resultado);
    }

public static void pitagoras(){
     float cateto1,cateto2;
     //JOptionPane.showMessageDialog(null,"Ud ingreso a la opcion sumar: ");
    cateto1 =  Float.parseFloat(JOptionPane.showInputDialog("Ingrese la longitud del cateto 1:"));
    cateto2 =  Float.parseFloat(JOptionPane.showInputDialog("Ingrese la longitud del cateto 2:"));   

     double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
     
    JOptionPane.showMessageDialog(null,"El resultado es: "+ hipotenusa);
    }





 
    public static void main(String[] args) {
        int opcion;
      opcion= Integer.parseInt(JOptionPane.showInputDialog("1. Sumar"+ 
                                                     "\n2. restar"+
                                                     "\n3. Multiplicar"+
                                                     "\n4. Dividir"+
                                                     "\n5. Modulo"+
                                                     "\n6. Pitagoras"+
                                                     "\n7. Seno"+
                                                     "\n8. Coseno"+
                                                     "\n9. Area circulo"+
                                                     "\n10. Numero PI"+
                                                     "\n11. Numero n"+
                                                     "\n12. Salir"+
                                                     "\n\nElija la opcion"));
    switch(opcion)
    {
        case 1:
            JOptionPane.showMessageDialog(null,"Ingreso a la opcion suma: ");
         sumar();    
        break;
        case 2:
            JOptionPane.showMessageDialog(null,"Ingreso a la opcion restar:");
        restar();
        break;
        case 3:
        JOptionPane.showMessageDialog(null,"Ingreso a la opcion multilicar:");
        multilicar();   
        break;
        case 4:

        dividir();   
        break;
        case 5:
        JOptionPane.showMessageDialog(null,"Ingreso a la opcion modulo:");
        modulo();   
        break;
        case 6:
        pitagoras();   
        break;
        case 7:
       //  seno();   
        break;
        case 8:
            
        break;
        case 9:
            
        break;
        case 10:
            
        break;
        case 11:
            
        break;
        case 12:
        break;
        default:
         JOptionPane.showMessageDialog(null,"Opcion no valida");   
    }
       
System.exit(0); 
    }
}      
        
    
    


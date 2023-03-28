
import javax.swing.JOptionPane;


//import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class Datos {
//    Scanner numer1 = new Scanner(System.in);
    int numero1;
    int numero2;
    Multiplo mult1 = new Multiplo();
    
    public void Entrada(){
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del cual desea saber obtener su multiplo"));
        System.out.println("Ingrese el valor para determinar si es multiplo de "+ numero1);
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para determinar si es multiplo de "+ numero1));
        mult1.Calcular(numero1, numero2);
        
    }
}

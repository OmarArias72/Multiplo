
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class Multiplo {
    
    public void Calcular(int a, int b){
        if(b%a==0){
            JOptionPane.showMessageDialog(null,b + " es multiplo de "+ a);
        }
        else{
            JOptionPane.showMessageDialog(null,b + " no es multiplo de "+ a);
        }
    }
}


package boletin12_2;

import javax.swing.JOptionPane;


public class Boletin12_2 {

    
    public static void main(String[] args) {
        int p1 = (int)(Math.random()*(50-1)+1);
        int p2 =0;
        int intento = Integer.parseInt(JOptionPane.showInputDialog("Cuantos intentos?"));
        if (intento==0){
       JOptionPane.showMessageDialog(null, "Es del 1 al 50 eso no vale");
       intento = intento+5;
        }
        else if{
       JOptionPane.showMessageDialog(null, "");
       intento = -intento;
        }
        
    }
    
}

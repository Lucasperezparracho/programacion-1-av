
package boletin7_1;

import javax.swing.JOptionPane;


public class Boletin7_1 {

    
    public static void main(String[] args) {
        numero obx1 = new numero();
        String res = JOptionPane.showInputDialog("teclea o numero");
        int numero = Integer.parseInt(res);
        obx1.numeroPositivo(numero);
    }
    
}


package boletin5_1;


public class Boletin5_1 {

    
    public static void main(String[] args) {
        Consumo obx1 = new Consumo();
        obx1.amosar();
        obx1.setkMetros(100);
        obx1.setlitros(50);
        obx1.setpGas((float) 1.57);
        obx1.consumoMedio();
        obx1.consumoEuros();
        
        
    }
    
}


package boletin3_1;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner obxScaner = new Scanner(System.in);
        System.out.println("teclee el precio de la tarifa:");
        float tarifa= obxScaner.nextFloat();
        System.out.println("teclee lo que debe pagar:");
        float pagado= obxScaner.nextFloat();
        float porcentaje=((tarifa-pagado)/tarifa )*100;
        System.out.println("porcentaje ="+ porcentaje+"%");
    }
}

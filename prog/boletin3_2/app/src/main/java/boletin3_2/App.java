/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package boletin3_2;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

   
    public static void main(String[] args) {
        Scanner obxScaner = new Scanner(System.in);
        System.out.println("teclee los grados centigrados:");
        float c=obxScaner.nextFloat();
        float fahrenheit=((c*9)/5)+32;
        float kelvin=c+273;
        System.out.println("Fahrnheit = "+fahrenheit+" kelvin = "+kelvin);
            
        
        
    }
}

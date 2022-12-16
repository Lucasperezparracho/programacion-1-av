/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2_4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner obxScaner = new Scanner(System.in);
        System.out.println("teclea un numero:");
        double numA=obxScaner.nextDouble();
        System.out.println("teclea otro numero:");
        double numB=obxScaner.nextDouble();
        float suma= (float) (numA+numB);
        float resta= (float) (numA-numB);
        float producto=(float) (numA*numB);
        float cociente=(float) (numA/numB);
        System.out.println("suma ="+suma+"resta ="+resta+"producto ="+producto+"cociente ="+cociente);
        
                
        
    }
    
}

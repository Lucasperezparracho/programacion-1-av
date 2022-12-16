
package boletin11_1;

import java.util.Scanner;


public class numeros {
    //while
    public void ConWhile(){
        int i = 0, num;
        while (i<10){
            num= pedirNumero();
            i++;
        }
        else (num>0){
        System.out.println("Positivo");
    }
        else (num<0){
        System.out.println("Negativo");
    }
        else (num=0){
        System.out.println("cero");
    }
            
            
        }

    public static int pedirNumero(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}

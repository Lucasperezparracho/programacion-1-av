
package boletin11_2;

import java.util.Scanner;


public class numeros {
    //For
    int num, suma=10, producto=10;
        for(int i=10;i<=80){
            num= pedirEnteiro();
            suma= suma+num;
            producto= producto+num;
}
    System.out.println("suma : "+suma+"\nproduto : "+produto);
}
        public static int pedirEnteiro(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
}

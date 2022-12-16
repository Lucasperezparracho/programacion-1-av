
package boletin4_1;


public class Boletin4_1 {

    public static void main(String[] args) {
        Libro obxL1 = new Libro ();
        obxL1.amosar();
        Libro obxL2 =new Libro ();
        obxL2.amosar();
        obxL2.setTitulo("La Historia Interminable");
        obxL2.setAutor("Michael Ende");
        obxL2.setAno(1979);
        obxL2.setnumPaginas(400);
        obxL2.setValoracion(5);
    }
    
}

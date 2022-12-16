
package boletin4_1;

public class Libro {
    //atributos
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;
    //constructores
     public Libro(){ //constructor por defecto
    
    }
    public Libro(String t, String au, int a, short np, float v){
    titulo = t;
    autor = au;
    ano = a;
    numPaginas = np;
    valoracion = v;
    }  
    //metodos de acceso
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        autor = autor;
    }
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        ano = ano;
    }
    public short getnumPaginas(){
        return numPaginas;
    }
    public void setnumPaginas(short numPaginas){
        numPaginas = numPaginas;
    }
    public float getValoracion(){
        return valoracion;
    }
    public void setValoracion(float valoracion){ 
        valoracion = valoracion;
    }
    //metodos
    public void amosar(){
        System.out.println("\nTitulo : "+titulo+"\nAutor : "+autor+"\nAno : "+ano+"ªnNº de paginas : "+numPaginas+"\nValoracion : "+valoracion);
    
    }
        
        
    

    
}






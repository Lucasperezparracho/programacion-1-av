
package boletin5_1;


public class Consumo {
    //atributos
    private float kMetros;
    private float litros;
    private float vMed;
    private float pGas;
    //constructores
     public Consumo(){ //constructor por defecto
    }
    public Consumo(float km, float l, float vm, float pg){
    kMetros = km;
    litros = l;
    vMed = vm;
    pGas = pg;
    }  
    //metodos
     public float getTempo(){
        return (kMetros/vMed);
    }
     public void setTempo(float Tempo){
        Tempo = Tempo;
    }
    public float consumoMedio(){
        return (litros*100/litros);
    }
    public float consumoEuros(){
        return (litros*100/litros)*pGas;
    }
    public float getkMetros(){
        return kMetros;
    }
    public void setkMetros(float kMetros){
        kMetros = kMetros;
    }
    public float getlitros(){
        return litros;
    }
    public void setlitros(float litros){
        litros = litros;
    }
    public float getvMed(){
        return vMed;
    }
    public void setvMed(float vMed){
        vMed = vMed;
    }
    public float getpGas(){
        return pGas;
    }
    public void setpGas(float pGas){
        pGas = pGas;
    }

    public void amosar(){
        System.out.println("\nConsumo Medio : "+consumoMedio+"\Litros Consumidos : "+consumoEuros+"\nVelocidade Media : "+vMed);
    }
    
}

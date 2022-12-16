
package boletin17;


public class clase1 {
    private float notaTotal;
    private float probaEscrita;
    private float probaPractica;
    private float boletins;

    public clase1(float notaTotal, float probaEscrita, float probaPractica, float boletins) {
        this.notaTotal = notaTotal;
        this.probaEscrita = probaEscrita;
        this.probaPractica = probaPractica;
        this.boletins = boletins;
    }

    public float getNotaTotal() {
        return notaTotal;
    }

    public float getProbaEscrita() {
        return probaEscrita;
    }

    public float getProbaPractica() {
        return probaPractica;
    }

    public float getBoletins() {
        return boletins;
    }

    public void setNotaTotal(float notaTotal) {
        this.notaTotal = notaTotal;
    }

    public void setProbaEscrita(float probaEscrita) {
        this.probaEscrita = probaEscrita;
    }

    public void setProbaPractica(float probaPractica) {
        this.probaPractica = probaPractica;
    }

    public void setBoletins(float boletins) {
        this.boletins = boletins;
    }

    @Override
    public String toString() {
        return "clase1{" + "notaTotal=" + notaTotal + ", probaEscrita=" + probaEscrita + ", probaPractica=" + probaPractica + ", boletins=" + boletins + '}';
    }
    
}

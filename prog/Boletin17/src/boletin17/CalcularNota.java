/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin17;

/**
 *
 * @author dam1
 */
public class CalcularNota {
    private static int nExamenes;
    private static double notasTeoricos;
    private static double notasPracticos;
    private static int nTeoricos;
    private static int nPracticos;
    private static int nBoletines;

    public CalcularNota() {
    }

    public static int getnExamenes() {
        return nExamenes;
    }

    public static double getNotasTeoricos() {
        return notasTeoricos;
    }

    public static double getNotasPracticos() {
        return notasPracticos;
    }

    public static int getnTeoricos() {
        return nTeoricos;
    }

    public static int getnPracticos() {
        return nPracticos;
    }

    public static int getnBoletines() {
        return nBoletines;
    }

    public static void setnExamenes(int nExamenes) {
        CalcularNota.nExamenes = nExamenes;
    }

    public static void setNotasTeoricos(double notasTeoricos) {
        CalcularNota.notasTeoricos = notasTeoricos;
    }

    public static void setNotasPracticos(double notasPracticos) {
        CalcularNota.notasPracticos = notasPracticos;
    }

    public static void setnTeoricos(int nTeoricos) {
        CalcularNota.nTeoricos = nTeoricos;
    }

    public static void setnPracticos(int nPracticos) {
        CalcularNota.nPracticos = nPracticos;
    }

    public static void setnBoletines(int nBoletines) {
        CalcularNota.nBoletines = nBoletines;
    }
        
}

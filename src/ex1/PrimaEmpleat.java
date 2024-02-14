/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;

public class PrimaEmpleat {
    private String nom;
    private String codiDirectiu;
    private int antiguitat;

    private static final int PRIMA_DIRECTIU_S = 400;
    private static final int PRIMA_DIRECTIU_N = 100;
    private static final int PRIMA_SUPERIOR_S = 600;
    private static final int PRIMA_SUPERIOR_N = 150;

    public static void main(String[] args) {
        PrimaEmpleat empleat = new PrimaEmpleat("Elvira", "S", 11);
        empleat.calcularPrima();
    }

    public PrimaEmpleat(String nom, String codiDirectiu, int antiguitat) {
        this.nom = nom;
        this.codiDirectiu = codiDirectiu;
        this.antiguitat = antiguitat;
    }

    public void calcularPrima() {
        int prima = 0;
        if (antiguitat >= 0 && antiguitat < 1000) {
            if ("S".equals(codiDirectiu)) {
                prima = (antiguitat > 12) ? PRIMA_SUPERIOR_S : PRIMA_DIRECTIU_S;
            } else if ("N".equals(codiDirectiu)) {
                prima = (antiguitat > 12) ? PRIMA_SUPERIOR_N : PRIMA_DIRECTIU_N;
            } else {
                System.out.println("El codi del càrrec ha de ser 'S' o 'N'");
                return;
            }
            System.out.println("La prima que li correspon a " + nom + " és de " + prima + " Euros");
        } else {
            System.out.println("La antiguitat ha de ser un nombre entre 0 i 999");
        }
    }

    @Override
    public String toString() {
        return "Empleat: " + nom + ", Codi Directiu: " + codiDirectiu + ", Antiguitat: " + antiguitat;
    }
}
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
    private static final String MISSATGE_ERROR_ANTIGUITAT = "La antiguitat ha de ser un nombre entre 0 i 999";
    private static final String MISSATGE_ERROR_CODI = "El codi del càrrec ha de ser 'S' o 'N'";

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
        if (antiguitatValida()) {
            if ("S".equals(codiDirectiu)) {
                prima = (antiguitat > 12) ? PRIMA_SUPERIOR_S : PRIMA_DIRECTIU_S;
            } else if ("N".equals(codiDirectiu)) {
                prima = (antiguitat > 12) ? PRIMA_SUPERIOR_N : PRIMA_DIRECTIU_N;
            } else {
                System.out.println(MISSATGE_ERROR_CODI);
                return;
            }
            mostrarPrima(prima);
        } else {
            System.out.println(MISSATGE_ERROR_ANTIGUITAT);
        }
    }

    private boolean antiguitatValida() {
        return antiguitat >= 0 && antiguitat < 1000;
    }

    private void mostrarPrima(int prima) {
        System.out.println("La prima que li correspon a " + nom + " és de " + prima + " Euros");
    }
}
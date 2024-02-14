/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;

/**
 *
 * @author polra
 */
public class PrimaEmpleat {
	private String nom;
	private String directiu;
	private int antiguitat;

	public static void main(String[] args) {

		PrimaEmpleat e = new PrimaEmpleat("Elvira", "S", 11);
		int p = 0;
		if (e.antiguitat >= 0 && e.antiguitat < 1000) {
			if (e.directiu == "S") {
				if (e.antiguitat > 12)
					p = 600;
				else {
					p = 400;
				}
			} else if (e.directiu == "N") {
				if (e.antiguitat > 12)
					p = 150;
				else
					p = 100;
			} else
				System.out.println("El codi del càrrec ha de ser 'S' o 								'N'");
			if (p!=0)
			   System.out.println("La prima que li correspon a " + e.nom
			 		          + " és de " + p + " Euros");
		} else
			System.out.println("La antiguitat ha de ser un nombre entre 0 i 							999");
	}

	public PrimaEmpleat(String nome, String dire, int ante) {
		this.nom = nome;
		this.directiu = dire;
		this.antiguitat = ante;
	}
}


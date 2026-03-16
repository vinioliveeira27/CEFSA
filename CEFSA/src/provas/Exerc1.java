package provas;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tr, nc, vtc;

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o número de compras: ");
		nc = sc.nextInt();
		System.out.println("Entre com o valor total das compras: ");
		vtc = sc.nextInt();
		System.out.println("Entre com o tempo de relacionamento: ");
		tr = sc.nextInt();

		if (vtc > 10000 && tr > 5) {
			System.out.println("\nCliente diamante.");
		} else if (vtc > 10000 && tr > 2) {
			System.out.println("\nCliente ouro.");
		} else if (vtc > 5000 && tr > 0) {
			System.out.println("\nCliente prata");
		} else {
			System.out.println("\nCliente comum");
		}
	}

}

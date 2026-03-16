package lacoderepeticao;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escrever um sistema que lê 5 valores para a,
		// um de cada vez, e conta quantos destes valores são negativos, escrevendo esta
		// informação.

		Scanner sc = new Scanner(System.in);
		int contadorneg = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println("\nDigite um valor: ");
			int a = sc.nextInt();
			if (a < 0) {
				contadorneg++;
			}
		}
		System.out.println("\nValores negativos: " + contadorneg);
		sc.close();
	}

}

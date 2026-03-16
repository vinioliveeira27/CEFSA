package lacoderepeticao;

import java.util.Scanner;

public class DoWhile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escreva um algoritmo em Java, que leia números inteiros via teclado, até que
		// o número zero seja digitado.
		// Ao final,mostre na tela a média de todos os números digitados, que sejam
		// múltiplos de 3.

		Scanner sc = new Scanner(System.in);
		int i = 0;
		int cont = 0;
		int res = 0;
		double media = 0;

		do {
			i = sc.nextInt();

			if (i % 3 == 0) {
				res += i;
				cont++;
			}

		} while (i != 0);

		if (cont > 0) {
			media = (double) res / cont;
			System.out.println("A média dos números múltiplos de 3 é: " + media);
		} else {
			System.out.println("Nenhum múltiplo de 3 foi digitado.");
		}

		sc.close();
	}
}

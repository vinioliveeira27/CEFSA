package lacoderepeticao;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escreva um algoritmo em Java, que leia números inteiros via teclado, até que
		 * o número zero seja digitado. Ao final, mostre na tela a soma de todos os
		 * números digitados, que sejam positivos.
		 */

		Scanner sc = new Scanner(System.in);
		double numero;
		double resultado = 0;
		System.out.print("Digite um número (0 para sair): ");

		do {
			numero = sc.nextDouble();

			if (numero > 0) {
				resultado += numero;
			}

		} while (numero != 0);

		System.out.println("O resultado é: " + resultado);
		sc.close();
	}
}

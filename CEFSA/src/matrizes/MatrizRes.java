package matrizes;

import java.util.Scanner;

public class MatrizRes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// =============================
		// VETORES
		// =============================

		System.out.println("=== VETORES ===");

		int[] numeros = new int[5]; // criando vetor com 5 posições

		// preenchendo vetor
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextInt();
		}

		// mostrando vetor
		System.out.println("\nValores do vetor:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posição " + i + ": " + numeros[i]);
		}

		// soma
		int soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}

		// média
		double media = (double) soma / numeros.length;

		System.out.println("\nSoma: " + soma);
		System.out.println("Média: " + media);

		// maior número
		int maior = numeros[0];

		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
		}

		System.out.println("Maior número: " + maior);

		// =============================
		// MATRIZES
		// =============================

		System.out.println("\n=== MATRIZ 3x3 ===");

		int[][] matriz = new int[3][3];

		// preenchendo matriz
		for (int linha = 0; linha < 3; linha++) {

			for (int coluna = 0; coluna < 3; coluna++) {

				System.out.print("Digite valor [" + linha + "][" + coluna + "]: ");
				matriz[linha][coluna] = sc.nextInt();

			}
		}

		// mostrando matriz
		System.out.println("\nMatriz:");

		for (int linha = 0; linha < 3; linha++) {

			for (int coluna = 0; coluna < 3; coluna++) {

				System.out.print(matriz[linha][coluna] + " ");

			}

			System.out.println();

		}

		// soma de todos elementos da matriz
		int somaMatriz = 0;

		for (int linha = 0; linha < 3; linha++) {

			for (int coluna = 0; coluna < 3; coluna++) {

				somaMatriz += matriz[linha][coluna];

			}

		}

		System.out.println("\nSoma da matriz: " + somaMatriz);

		// diagonal principal
		System.out.println("\nDiagonal principal:");

		for (int i = 0; i < 3; i++) {

			System.out.print(matriz[i][i] + " ");

		}

		sc.close();
	}
}

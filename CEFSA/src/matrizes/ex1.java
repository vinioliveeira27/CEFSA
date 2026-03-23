package matrizes;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[3][3];

		int somaPrincipal = 0;
		int somaSecundaria = 0;

		// Entrada de dados
		System.out.println("Digite os elementos da matriz 3x3:");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		// Exibindo diagonal principal
		System.out.println("\nElementos da Diagonal Principal:");
		for (int i = 0; i < 3; i++) {
			System.out.print(matriz[i][i] + " ");
			somaPrincipal += matriz[i][i];
		}

		// Exibindo diagonal secundária
		System.out.println("\n\nElementos da Diagonal Secundária:");
		for (int i = 0; i < 3; i++) {
			System.out.print(matriz[i][2 - i] + " ");
			somaSecundaria += matriz[i][2 - i];
		}

		// Exibindo as somas
		System.out.println("\n\nSoma dos Elementos da Diagonal Principal:");
		System.out.println(somaPrincipal);

		System.out.println("\nSoma dos Elementos da Diagonal Secundária:");
		System.out.println(somaSecundaria);

		sc.close();
	}

}

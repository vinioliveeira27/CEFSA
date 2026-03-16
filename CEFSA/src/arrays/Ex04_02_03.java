package arrays;

import java.util.Scanner;

public class Ex04_02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 4- Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela
		 * possui.
		 */

		Scanner sc = new Scanner(System.in);

		int[][] matriz = new int[4][4];
		int contador = 0;

		System.out.println("Digite os valores da matriz 4x4:");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

				matriz[i][j] = sc.nextInt();

				if (matriz[i][j] > 10) {
					contador++;
				}
			}
		}

		System.out.println("Quantidade de valores maiores que 10: " + contador);

		sc.close();
	}
}

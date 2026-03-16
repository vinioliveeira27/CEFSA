package arrays;

import java.util.Scanner;

public class Ex03_02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3- Crie em Java uma matriz 3x5 de inteiros, preencha a matriz e depois:
		 * 
		 * a) Informe se a matriz possui elementos repetidos;
		 * 
		 * b) A quantidade de números pares;
		 * 
		 * c) A quantidade de números ímpares
		 */

		Scanner sc = new Scanner(System.in);

		int[][] matriz = new int[3][5];
		int par = 0, impar = 0;
		int repetidos = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {

				matriz[i][j] = sc.nextInt();

				if (matriz[i][j] % 2 == 0)
					par++;
				else
					impar++;
			}
		}

		// Contar números repetidos
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {

				boolean jaContado = false;

				// Verifica se já foi contado antes
				for (int x = 0; x < i; x++) {
					for (int y = 0; y < 5; y++) {
						if (matriz[i][j] == matriz[x][y]) {
							jaContado = true;
						}
					}
				}

				if (!jaContado) {
					int contador = 0;

					for (int x = 0; x < 3; x++) {
						for (int y = 0; y < 5; y++) {
							if (matriz[i][j] == matriz[x][y]) {
								contador++;
							}
						}
					}

					if (contador > 1) {
						repetidos++;
					}
				}
			}
		}

		System.out.println("Quantidade de pares: " + par);
		System.out.println("Quantidade de ímpares: " + impar);
		System.out.println("Quantidade de números repetidos: " + repetidos);

		sc.close();
	}
}
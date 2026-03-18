package matrizes;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[3][5];

		int pares = 0, impares = 0;
		boolean repetido = false;

		// Leitura
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = sc.nextInt();

				if (matriz[i][j] % 2 == 0)
					pares++;
				else
					impares++;
			}
		}

		// Verificar repetidos
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				for (int k = i; k < 3; k++) {
					for (int l = 0; l < 5; l++) {

						if (i == k && j >= l)
							continue;

						if (matriz[i][j] == matriz[k][l])
							repetido = true;
					}
				}
			}
		}

		System.out.println("Possui repetidos? " + repetido);
		System.out.println("Quantidade de pares: " + pares);
		System.out.println("Quantidade de ímpares: " + impares);

		sc.close();
	}

}

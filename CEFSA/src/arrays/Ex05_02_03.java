package arrays;

public class Ex05_02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5- Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os
		 * demais elementos. Escreva ao final a matriz obtida.
		 */

		int[][] matriz = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				if (i == j) {
					matriz[i][j] = 1;
				} else {
					matriz[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}

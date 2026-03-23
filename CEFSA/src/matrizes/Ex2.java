package matrizes;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double[][] matriz = new double[10][4]; // 10 alunos, 4 bimestres
		double[] medias = new double[10];

		// Entrada das notas
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite as 4 notas do aluno " + (i + 1) + ":");

			double soma = 0;

			for (int j = 0; j < 4; j++) {
				matriz[i][j] = sc.nextDouble();
				soma += matriz[i][j];
			}

			medias[i] = soma / 4; // cálculo da média
		}

		// Exibição das médias
		System.out.println("\nMédias dos alunos:");

		for (int i = 0; i < 10; i++) {
			System.out.printf("Aluno %d: %.1f\n", (i + 1), medias[i]);
		}

		sc.close();
	}

}

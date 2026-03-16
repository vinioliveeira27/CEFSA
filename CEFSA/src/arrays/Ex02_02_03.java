package arrays;

import java.util.Scanner;

public class Ex02_02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Elabore um algoritmo que leia as notas de uma classe com 10 participantes
		 * durante 4 bimestres de um ano. As 4 notas de cada participante serão
		 * armazenadas em uma linha de uma matriz de números reais, logo cada linha da
		 * matriz serão as notas de um participante. Em um vetor de números reais,
		 * armazene as médias de cada participante e exiba as médias de cada um na tela.
		 */

		Scanner sc = new Scanner(System.in);

		float[][] notas = new float[10][4];
		float[] medias = new float[10];

		for (int i = 0; i < 10; i++) {

			float soma = 0;

			System.out.println("Aluno " + (i + 1));

			for (int j = 0; j < 4; j++) {
				System.out.print("Nota do " + (j + 1) + "º bimestre: ");
				notas[i][j] = sc.nextFloat();
				soma += notas[i][j];
			}

			medias[i] = soma / 4;
		}

		System.out.println("\nMédias dos alunos:");

		for (int i = 0; i < 10; i++) {
			System.out.println("Aluno " + (i + 1) + ": " + medias[i]);
		}

		sc.close();
	}
}

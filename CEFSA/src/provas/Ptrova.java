package provas;

import java.util.Scanner;

public class Ptrova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// =========================
		// 🔹 VETOR
		// =========================
		System.out.println("=== VETOR ===");

		int[] v = new int[5];
		int soma = 0;

		// Preencher vetor
		for (int i = 0; i < v.length; i++) {
			System.out.print("Digite um número: ");
			v[i] = sc.nextInt();
		}

		// Mostrar vetor + soma
		System.out.println("\nElementos do vetor:");
		for (int i = 0; i < v.length; i++) {
			System.out.println("Posição " + i + ": " + v[i]);
			soma += v[i];
		}

		// Média
		double media = soma / (double) v.length;
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);

		// Maior valor
		int maior = v[0];
		for (int i = 1; i < v.length; i++) {
			if (v[i] > maior) {
				maior = v[i];
			}
		}
		System.out.println("Maior valor: " + maior);

		// Contar pares
		int pares = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] % 2 == 0) {
				pares++;
			}
		}
		System.out.println("Quantidade de pares: " + pares);

		// Buscar número
		System.out.print("Digite um número para buscar: ");
		int busca = sc.nextInt();
		boolean achou = false;

		for (int i = 0; i < v.length; i++) {
			if (v[i] == busca) {
				System.out.println("Encontrado na posição: " + i);
				achou = true;
			}
		}

		if (!achou) {
			System.out.println("Número não encontrado.");
		}

		// =========================
		// 🔹 MATRIZ
		// =========================
		System.out.println("\n=== MATRIZ 3x3 ===");

		int[][] m = new int[3][3];

		// Preencher matriz
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print("Digite valor [" + i + "][" + j + "]: ");
				m[i][j] = sc.nextInt();
			}
		}

		// Mostrar matriz
		System.out.println("\nMatriz:");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

		// Soma da matriz
		int somaMatriz = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				somaMatriz += m[i][j];
			}
		}
		System.out.println("Soma da matriz: " + somaMatriz);

		// Diagonal principal
		System.out.println("Diagonal principal:");
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i][i]);
		}

		// =========================
		// 🔹 WHILE
		// =========================
		System.out.println("\n=== WHILE ===");

		int contador = 0;

		while (contador < 5) {
			System.out.println("Contador: " + contador);
			contador++;
		}

		// =========================
		// 🔹 DO WHILE
		// =========================
		System.out.println("\n=== DO WHILE ===");

		int opcao;

		do {
			System.out.print("Digite 0 para sair: ");
			opcao = sc.nextInt();
		} while (opcao != 0);

		// =========================
		// 🔹 IF / ELSE
		// =========================
		System.out.println("\n=== IF / ELSE ===");

		System.out.print("Digite um número: ");
		int n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println("Número PAR");
		} else {
			System.out.println("Número ÍMPAR");
		}

		sc.close();
	}
}

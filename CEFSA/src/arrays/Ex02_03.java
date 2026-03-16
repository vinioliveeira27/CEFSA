package arrays;

import java.util.Scanner;

public class Ex02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em
		 * seguida, mostre na tela:
		 * 
		 * Todos os elementos da Diagonal Principal
		 * 
		 * Todos os elementos da Diagonal Secundária
		 * 
		 * A Soma de todos os elementos da Diagonal Principal
		 * 
		 * A Soma de todos os elementos da Diagonal Secundária
		 */

		Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        // Leitura da matriz
        System.out.println("Digite os valores da matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        int somaPrincipal = 0;
        int somaSecundaria = 0;

        System.out.println("\nDiagonal Principal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
            somaPrincipal += matriz[i][i];
        }

        System.out.println("\nSoma da Diagonal Principal: " + somaPrincipal);

        System.out.println("\nDiagonal Secundária:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][2 - i] + " ");
            somaSecundaria += matriz[i][2 - i];
        }

        System.out.println("\nSoma da Diagonal Secundária: " + somaSecundaria);

        sc.close();
    }
}
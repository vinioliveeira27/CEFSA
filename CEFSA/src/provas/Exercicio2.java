package provas;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int horas, resultado = 0;
		double valorpontos;

		System.out.println("Entre com o total de horas: ");
		horas = sc.nextInt();

		if (horas <= 10) {
			resultado = horas * 2;
		} else if (horas >= 10 && horas <= 20) {
			resultado = horas * 5;
		} else if (horas >= 20 && horas <= 720) {
			resultado = horas * 10;
		} else if (horas > 720) {
			System.out.println("\nValor superior ao limite de horas do mês!");
			{
			}

		}

		valorpontos = resultado * 0.05;
		System.out.println("\nVocê acumulou: " + resultado + " pontos e irá receber R$ " + valorpontos);

	}

}

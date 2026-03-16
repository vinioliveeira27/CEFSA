package provas;

import java.util.Scanner;

public class Prova2BIM1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1- Faça um programa que receba cinco idades, pesos e Alturas e que calcule e
		 * mostre: · A média das idades das cinco pessoas; · A quantidade de pessoas com
		 * peso superior a 90 quilos e altura inferior a 1,50; · A porcentagem de
		 * pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90;
		 */

		Scanner sc = new Scanner(System.in);
		int somaidade = 0, idade = 0, cont = 0, contpa = 0, contzz = 0;
		double altura = 0, peso = 0, media = 0, mediazz = 0;

		do {
			System.out.println("Digite a sua idade: ");
			idade = sc.nextInt();
			somaidade += idade;
			System.out.println("Digite o seu peso: ");
			peso = sc.nextDouble();
			System.out.println("Digite a sua altura: ");
			altura = sc.nextDouble();
			cont++;
			if (peso > 90 && altura < 1.50) {
				contpa++;
			}
			if (altura > 1.90) {
				if (idade > 10 && idade < 30) {
					contzz++;
				}

			}
		} while (cont <= 4);
		media = somaidade / cont;
		mediazz = contzz * 20;

		System.out.println("A média da idade das 5 pessoas é de: " + media);
		System.out.println("A quantidade de pessoas com peso superior a 90kg e altura inferior a 1,50 é de: " + contpa);
		System.out.println(
				"A porcentagem de pessoas com idade entre e 10 e 30 anos entre as pessoas que medem mais de 1,90m é de: "
						+ mediazz + "%");

		sc.close();

	}

}

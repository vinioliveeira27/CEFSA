package provas;

import java.util.Scanner;

public class Prova2Bim2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salarioa = 0, novosalario = 0;
		int genero = 0, tpempresa = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o seu salário atual (Digite 0 para encerrar) : ");
		salarioa = sc.nextDouble();

		while (salarioa != 0) {
			System.out.println("Digite seu gênero, sendo 1 para mulher e 0 para homem. ");
			genero = sc.nextInt();
			System.out.println("Digite seu tempo de empresa: ");
			tpempresa = sc.nextInt();
			if (genero == 1 && tpempresa < 15) {
				novosalario = salarioa * 1.05;
			} else if (genero == 1 && tpempresa >= 15 && tpempresa < 20) {
				novosalario = salarioa * 1.12;
			} else if (genero == 1 && tpempresa > 20) {
				novosalario = salarioa * 1.25;

			} else if (genero == 0 && tpempresa < 20) {
				novosalario = salarioa * 1.03;
			} else if (genero == 0 && tpempresa >= 20 && tpempresa <= 30) {
				novosalario = salarioa * 1.13;
			} else if (genero == 0 && tpempresa > 30) {
				novosalario = salarioa * 1.25;
			}
			System.out.println("Seu novo salário é de: R$"+novosalario);
			System.out.println("Digite o seu salário atual (Digite 0 para encerrar) : ");
			salarioa = sc.nextDouble();
		}

	}
}

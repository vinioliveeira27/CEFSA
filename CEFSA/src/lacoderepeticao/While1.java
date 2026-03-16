package lacoderepeticao;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Faça um programa que leia número reais maiores que zero.
		// Quando for digitado o número zero, o programa
		// deverá apresentar quantos números foram digitados e a média destes.

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite números reais e digite 0 quando quiser encerrar o programa: ");
		
		double x = sc.nextDouble();
		double res = 0;
		int contador = 0;
		double res2=0;

		while (x > 0) {
			res =res+ x;
			x=sc.nextDouble();
			contador++;
		}
		
		System.out.println("\nA quantidade de números é de: "+contador);
		res2=res/contador;
		
		System.out.println("\nA média entres esses números é de: "+res2);

		sc.close();
	}

}

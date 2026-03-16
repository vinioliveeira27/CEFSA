package lacoderepeticao;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Desenvolver um programa que leia um número não determinado de valores,
		// calcule e escreva a média aritmética deles,
		// a quantidade de valores positivos, a quantidade de valores negativos e o
		// percentual de valores negativos e positivos.

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os valores desejados: ");
		double x = sc.nextDouble();
		double res = 0;
		double contpos = 0;
		double contneg = 0;
		double conttot = 0;
		double ma = 0;
		double pn = 0;
		double pp = 0;

		while (x != 0) {
			res += x;
			x = sc.nextDouble();
			if (x < 0) {
				contneg++;
			} else {
				contpos++;
			}
			conttot = contneg + contpos;
			ma = res / conttot;
			pp = (contpos / conttot) * 100;
			pn = (contneg / conttot) * 100;
		}

		System.out.println("\nMédia aritmética: " + ma);
		System.out.println("\nQuantidade de positivos: " + contpos);
		System.out.println("\nQuantidade de negativos: " + contneg);
		System.out.println("\nPercentual de positivos: " + pp);
		System.out.println("\nPercentual de negativos: " + pn);

		sc.close();
	}

}

package provas;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a,b,c,x;
		
		System.out.println("Entre com o primeiro número: ");
		a=sc.nextInt();
		System.out.println("Entre com o segundo número: ");
		b=sc.nextInt();
		System.out.println("Entre com o terceiro número: ");
		c=sc.nextInt();
		
		if (a>b && b>c) {
			System.out.println("Os números em ordem crescente são:"+a+b+c);
		} else if (b>a && a>c) {
			System.out.println("Os números em ordem crescente são:"+b+a+c);
			
			
			
		}
	}

}

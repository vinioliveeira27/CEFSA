package programas;

import java.util.Scanner;

public class ifelse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,resultado=0;
		int opcao;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Calculadora técnica");
		System.out.println("\n\t1.Soma");
		System.out.println("\n\t2.Subtração");
		System.out.println("\n\t3.Divisão");
		System.out.println("\n\t4.Multiplicação");
		System.out.println("\nDigite a sua opção: ");
		opcao = input.nextInt();
		
		System.out.println("\nDigite a n1: ");
		n1 = input.nextInt();
		System.out.println("\nDigite a n2: ");
		n2 = input.nextInt();
		
		switch(opcao) {
		case 1:
			resultado=n1+n2;
			break;
			
		case 2:
			resultado=n1-n2;
			break;
				
		case 3:
			if(n2==0)  {
				System.out.println("Não existe divisão por 0!");
			} else {
			resultado=n1/n2;}
			break;
			
		case 4:
			resultado=n1*n2;
			break;
			
			default:
				System.out.println("\nOpção inválida");
		}
				System.out.println("\nSeu resultado é: "+resultado);
		

		

	}

}

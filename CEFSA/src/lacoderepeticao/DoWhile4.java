package lacoderepeticao;

import java.util.Scanner;

public class DoWhile4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1- Faça um programa que implemente um menu onde o usurário deverá selecionar 1 ou 0.
		//Caso seja entrado um número diferente, o programa deverá solicitar uma nova opção. 
		
		Scanner sc=new Scanner(System.in);
		int i=0;
		do {
			System.out.println("Escolha um número entre 1 e 0:");
			i=sc.nextInt();
			
		} while(i!=0 && i!=1);
		System.out.println("\nPrograma encerrado.");
		
		sc.close();
	}

}

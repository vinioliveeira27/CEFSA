package lacoderepeticao;

import java.util.Scanner;

public class For7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7. Ler um valor inteiro e escrever a tabuada de 1 a 10 do valor lido.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\nDigite um valor: ");
		int x=sc.nextInt();
		
		for (int i=1;i<=10;i++) {
			int valortabuada=i*x;
			System.out.println(valortabuada);
		}

	}

}

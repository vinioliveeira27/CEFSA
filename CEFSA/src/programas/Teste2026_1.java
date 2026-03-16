package programas;

import java.util.Scanner;

public class Teste2026_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CALCULADORA GENERICA
		
		Scanner sc = new Scanner(System.in);
		float num=0,produto=0;
		int cont=0;
		
		System.out.println("Digite quaisquer números. Os números múltiplos de 3 serão contados e multiplicados entre si");
		System.out.println("Digite X para encerrar a calculadora");
		
		num = sc.nextFloat();
		
		if (num%3==0) {
			cont++;
			produto*=num;
		}
	}

}

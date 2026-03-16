package programacaosequencial;

import java.util.Scanner;

public class ProgramacaoSequencial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c,r,s;
		float d;
		
		Scanner calculo2 = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor de A: ");
		a = calculo2.nextInt();
		System.out.println("\nEntre com o valor de B: ");
		b = calculo2.nextInt();
		System.out.println("\nEntre com o valor de C: ");
		c = calculo2.nextInt();
		
		r= (int) Math.pow((a+b), 2);
		s= (int) Math.pow((b+c), 2);
		d= (r+s)/2;
		
		System.out.println("\nO valor de D é: "+d);
	}

}

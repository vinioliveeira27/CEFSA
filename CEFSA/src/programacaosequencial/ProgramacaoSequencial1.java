package programacaosequencial;

import java.util.Scanner;

public class ProgramacaoSequencial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float x1,x2,y1,y2,d;
		
		Scanner calculo = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor de X1: ");
		x1 = calculo.nextFloat();
		System.out.println("\nEntre com o valor de X2: ");
		x2 = calculo.nextFloat();
		System.out.println("\nEntre com o valor de Y1: ");
		y1 = calculo.nextFloat();
		System.out.println("\nEntre com o valor de Y2: ");
		y2 = calculo.nextFloat();
		
		d= (float) Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		System.out.println("\nO valor de D é: "+d);

		
	}

}

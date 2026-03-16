package exercfor;

import java.util.Scanner;

public class For3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int res,x,tabuada;
		
		System.out.println("Entre com a tabuada desejada: ");
		tabuada=sc.nextInt();
		
		for (x=1;x<=10;x++) {
			res = tabuada*x;
			System.out.println(tabuada+" X "+x+" = "+res);
		}

		sc.close();
	}

}

package lacoDeDecisao;

import java.util.Scanner;

public class LacoDeDecisao7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		
		float ip;
		
		Scanner chapa=new Scanner(System.in);
		System.out.println("\nEntre com o seu índice: ");
		ip=chapa.nextFloat();
		
		if(ip<35) {
			System.out.println("\nÍndice bom.😆");
		}else if(ip>=35 && ip<50) {
			System.out.println("\nÍndice de atenção!");
		}else if(ip>=50 && ip<75) {
			System.out.println("\nÍndice perigoso!");
		}else{
			System.out.println("\nÍndice de emergência!");

		}
	}

}

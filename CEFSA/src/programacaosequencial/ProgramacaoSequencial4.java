package programacaosequencial;

import java.util.Scanner;

public class ProgramacaoSequencial4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dias,meses,anos,td;
		
		Scanner ps4=new Scanner(System.in);
		
		System.out.println("\nEntre com a quantidade total de dias: ");
		td=ps4.nextInt();
		
		anos= (td/365);
		meses= (td%365/30);
		dias= ((td%365)%30);
		
		System.out.println("\nO seu total de anos é de " +anos+ " anos, " +meses+ " meses e "+dias+" dias!");
	}

}

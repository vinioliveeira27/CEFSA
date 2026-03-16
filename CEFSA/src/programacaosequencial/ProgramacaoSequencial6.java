package programacaosequencial;

import java.util.Scanner;

public class ProgramacaoSequencial6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		
		int seg,min,hr,totalseg;
		
		Scanner ps6 = new Scanner(System.in);
		
		System.out.println("\nDigite o total de segundos: ");
		totalseg = ps6.nextInt();
		
		hr=(totalseg/3600);
		min=((totalseg%3600)/60);
		seg=((totalseg%3600)%60);
		
		System.out.println("\nO seu total é de "+hr+" horas, "+min+" minutos e "+seg+" segundos!");

	}

}

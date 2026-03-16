package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> notas = new ArrayList<Double>();

		Double y = Double.valueOf(9);

		notas.add(y);
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(4.0);

		System.out.println("Notas cadastradas: " + notas);
		System.out.println("\nA posição da nota 5 é: " + notas.indexOf(5d));
		System.out.println("\nA nota 5 existe na lista?: " + notas.contains(5d));
		System.out.println("\nA posição 1 da lista, a nota é:  " + notas.get(1));
		notas.set(notas.indexOf(5d), 6.0d);
		System.out.println("\nA nota 5 foi alterada para 6: " + notas);
		notas.remove(notas.indexOf(4.0d));
		System.out.println("\nA nota 4 foi apagada: "+notas);
		System.out.println("\nA lista está vazia? "+notas.isEmpty());
		System.out.println("\nO tamanho da lista é: "+notas.size());
		
		for(Double nota : notas) {
			System.out.println(nota);
		}
		System.out.println("\nNotas cadastradas -- Interface Iterator");
		Iterator<Double> iNotas = notas.iterator();
		
		while(iNotas.hasNext()) {
			System.out.println(iNotas.next());
		}
	}

}

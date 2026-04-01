package poo;

public class Exercicio1professor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//foi criada uma lista e atribuído valores de String e double
		Exercicio1entities[] lista = new Exercicio1entities[3];
		lista[0] = new Exercicio1entities("Francisco", 4000);
		lista[1] = new Exercicio1entities("Leandro Testa", 200);
		lista[2] = new Exercicio1entities("João Bergara", 15000);

		//funcao para rodar todos os elementos da lista
		for (Exercicio1entities roda : lista) {
			roda.imprimir();

		}
		//mostra salários atualizados
		System.out.println("\nSalários atualizados: ");
		for (Exercicio1entities roda : lista) {
			roda.aumentarSalario(10);
			roda.imprimir();

		}
	}

}

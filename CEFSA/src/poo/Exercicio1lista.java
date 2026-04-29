package poo;

import entities.Gerente;
import entities.Vendedor;

public class Exercicio1lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Utilizando os conceitos de Herança, da Programação Orientada a Objetos, crie
		 * as Classes Gerente e Vendedor como heranças da Classe Funcionario (criada na
		 * lista de exercícios anterior), com os seus respectivos Métodos e Atributos.
		 * Na sequência, utilize a Classe TestaFuncionario para instanciar dois objetos
		 * da Classe Gerente e dois objetos da Classe Vendedor, e apresente as
		 * informações destes 4 Objetos na tela.
		 */

		  Gerente g1 = new Gerente("Rodolfo", 40, "Gerente", 200000, 2000);
	        Gerente g2 = new Gerente("Mariana", 35, "Gerente", 7500, 1500);

	        // Vendedores
	        Vendedor v1 = new Vendedor("João", 25, "Vendedor", 2000, 500);
	        Vendedor v2 = new Vendedor("Ana", 28, "Vendedor", 2200, 600);

	        // Exibir
	        g1.visualizar();
	        g2.visualizar();
	        v1.visualizar();
	        v2.visualizar();
	    }
	}
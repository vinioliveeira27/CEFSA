package provas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Prova23_03_2 {
	/*
	 * Criar um programa que: 1. Cadastre livros com título e autor. 2. Permita
	 * buscar um livro pelo título. 3. Liste todos os livros disponíveis. 4. Remova
	 * um livro emprestado do sistema.
	 * 
	 * 
	 */
	private static ArrayList<String> livros = new ArrayList<>();
	private static ArrayList<String> autores = new ArrayList<>();

	
	public static void main(String[] args) {

		String input;
		int opcao = -1;

		while (opcao != 0) {

			try {

				input = JOptionPane.showInputDialog(null,
						"---Sistema de gerenciamento de biblioteca---\n\n" + "1- Adicionar livro\n"
								+ "2- Listar livros\n" + "3- Buscar livro por título\n"
								+ "4- Remover livro emprestado\n" + "0- Sair do programa\n\n" + "Escolha sua opção: ",
						"Biblioteca", JOptionPane.PLAIN_MESSAGE);

				if (input == null) {
					opcao = 0;
					break;
				}

				opcao = Integer.parseInt(input);

				switch (opcao) {

				case 1:
					adicionarLivros();
					break;

				case 2:
					listarLivros();
					break;

				case 3:
					buscarLivro();
					break;

				case 4:
					removerChavao();
					break;

				case 0:
					JOptionPane.showMessageDialog(null, "Encerrando o programa.");
					break;

				default:
					JOptionPane.showMessageDialog(null, "Opção inválida.");
				}

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite apenas números.");
			}
		}
	}

	private static void adicionarLivros() {
		try {
			String nome = JOptionPane.showInputDialog("Nome do livro:");
			String autor = JOptionPane.showInputDialog("Nome do autor:");
			livros.add(nome);
			autores.add(autor);

			JOptionPane.showMessageDialog(null, "Livro adicionado com sucesso!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao adicionar livro.");
		}
	}

	private static void listarLivros() {

		if (livros.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Nenhum livro cadastrado.");
			return;
		}

		StringBuilder lista = new StringBuilder();

		for (int i = 0; i < livros.size(); i++) {

			lista.append("Livro: ").append(livros.get(i));
			lista.append("\nAutor: ").append(autores.get(i)).append("\n----------------------\n");

		}


		JOptionPane.showMessageDialog(null, lista.toString());
	}

	private static void buscarLivro() {

		String nomeBusca = JOptionPane.showInputDialog("Digite o nome do livro:");

		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).equalsIgnoreCase(nomeBusca)) {

				JOptionPane.showMessageDialog(null, "Produto encontrado:\n\n" + "Nome: " + livros.get(i));
				return;
			}
		}

		JOptionPane.showMessageDialog(null, "Livro não encontrado.");
	}

	private static void removerChavao() {

		String nomeRemover = JOptionPane.showInputDialog("Digite o nome do livro para remover:");

		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).equalsIgnoreCase(nomeRemover)) {

				livros.remove(i);

				JOptionPane.showMessageDialog(null, "Livro removido com sucesso!");
				return;
			}
		}

		JOptionPane.showMessageDialog(null, "Livro não encontrado.");
	}
}
package provas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Prova23_03 {
	/*
	 * /* Criar um programa que: 1. Registre a entrada de veículos (placa e modelo).
	 * 2. Remova veículos quando saírem. 3. Liste todos os veículos estacionados. 4.
	 * Limite a capacidade do estacionamento (ex.: 5 vagas).
	 * 
	 */

	static ArrayList<String> carros = new ArrayList<>();

	public static void main(String[] args) {

		int opcao = -1;

		while (opcao != 0) {

			try {

				String input = JOptionPane.showInputDialog(null,
						"---Sistema de Estacionamento---\n\n" + "1- Registrar entrada de veículo\n"
								+ "2- Listar veículos estacionados\n" + "3- Remover veículo\n" + "0- Sair\n\n"
								+ "Escolha sua opção: ",
						"Estacionamento", JOptionPane.PLAIN_MESSAGE);

				if (input == null) {
					opcao = 0;
					break;
				}

				opcao = Integer.parseInt(input);

				switch (opcao) {

				case 1:
					adicionarCarro();
					break;

				case 2:
					listarCarros();
					break;

				case 3:
					removerCarro();
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

	private static void adicionarCarro() {

		

		String placa = JOptionPane.showInputDialog("Digite a placa do veículo:");
		if (placa == null || placa.isBlank())
			return;

		String modelo = JOptionPane.showInputDialog("Digite o modelo do veículo:");
		if (modelo == null || modelo.isBlank())
			return;

		int cont=0;
		cont++;

		JOptionPane.showMessageDialog(null, "Veículo registrado com sucesso!");
	}

	private static void listarCarros() {

		if (carros.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Nenhum veículo estacionado.");
			return;
		}

		StringBuilder lista = new StringBuilder("VEÍCULOS NO ESTACIONAMENTO:\n\n");

		for (int i = 0; i < carros.size(); i++) {
			lista.append((i + 1) + " - " + carros.get(i) + "\n");
		}

		lista.append("\nVagas ocupadas: " + carros.size() + "/" );

		JOptionPane.showMessageDialog(null, lista.toString());
	}

	private static void removerCarro() {

		if (carros.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Não há veículos para remover.");
			return;
		}

		String placaRemover = JOptionPane.showInputDialog("Digite a placa do veículo para remover:");

		if (placaRemover == null || placaRemover.isBlank())
			return;

		for (int i = 0; i < carros.size(); i++) {

			if (carros.get(i).toUpperCase().startsWith(placaRemover.toUpperCase())) {

				carros.remove(i);

				JOptionPane.showMessageDialog(null, "Veículo removido com sucesso!");
				return;
			}
		}

		JOptionPane.showMessageDialog(null, "Veículo não encontrado.");
	}
}
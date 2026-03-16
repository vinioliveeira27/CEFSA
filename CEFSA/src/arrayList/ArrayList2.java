package arrayList;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayList2 {

	private static ArrayList<String> nomes = new ArrayList<>();
	private static ArrayList<Double> precos = new ArrayList<>();
	private static ArrayList<Integer> quantidades = new ArrayList<>();

	public static void main(String[] args) {

		String input;
		int opcao = -1;

		while (opcao != 0) {

			try {

				input = JOptionPane.showInputDialog(null,
						"---Sistema de gerenciamento de mercado---\n\n"
						+ "1- Adicionar produto\n"
						+ "2- Listar produtos (com estoque e valor total)\n"
						+ "3- Buscar produto por nome\n"
						+ "4- Remover produto por nome\n"
						+ "0- Sair do programa\n\n"
						+ "Escolha sua opção: ",
						"Supermercado", JOptionPane.PLAIN_MESSAGE);

				if (input == null) {
					opcao = 0;
					break;
				}

				opcao = Integer.parseInt(input);

				switch (opcao) {

				case 1:
					JOptionPane.showMessageDialog(null, "Função adicionar produto ainda não implementada.");
					break;

				case 2:
					JOptionPane.showMessageDialog(null, "Função listar produtos ainda não implementada.");
					break;

				case 3:
					JOptionPane.showMessageDialog(null, "Função buscar produto ainda não implementada.");
					break;

				case 4:
					JOptionPane.showMessageDialog(null, "Função remover produto ainda não implementada.");
					break;

				case 0:
					JOptionPane.showMessageDialog(null, "OK CHEFE .Encerrando o programa monstre.");
					break;

				default:
					JOptionPane.showMessageDialog(null, "Opção inválida.");
				}

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite apenas números.");
			}
		}
	}
}

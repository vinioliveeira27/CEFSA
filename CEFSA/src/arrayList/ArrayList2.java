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
                    adicionarProduto();
                    break;

                case 2:
                    listarProdutos();
                    break;

                case 3:
                    buscarProduto();
                    break;

                case 4:
                    removerProduto();
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

    // 🔹 ADICIONAR
    private static void adicionarProduto() {
        try {
            String nome = JOptionPane.showInputDialog("Nome do produto:");
            double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço:"));
            int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade:"));

            nomes.add(nome);
            precos.add(preco);
            quantidades.add(quantidade);

            JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar produto.");
        }
    }

    // 🔹 LISTAR
    private static void listarProdutos() {

        if (nomes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum produto cadastrado.");
            return;
        }

        StringBuilder lista = new StringBuilder();
        double totalGeral = 0;

        for (int i = 0; i < nomes.size(); i++) {
            double total = precos.get(i) * quantidades.get(i);
            totalGeral += total;

            lista.append("Produto: ").append(nomes.get(i))
                 .append("\nPreço: ").append(precos.get(i))
                 .append("\nQuantidade: ").append(quantidades.get(i))
                 .append("\nTotal: ").append(total)
                 .append("\n----------------------\n");
        }

        lista.append("\nTOTAL GERAL: ").append(totalGeral);

        JOptionPane.showMessageDialog(null, lista.toString());
    }

    // 🔹 BUSCAR
    private static void buscarProduto() {

        String nomeBusca = JOptionPane.showInputDialog("Digite o nome do produto:");

        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equalsIgnoreCase(nomeBusca)) {

                double total = precos.get(i) * quantidades.get(i);

                JOptionPane.showMessageDialog(null,
                        "Produto encontrado:\n\n"
                        + "Nome: " + nomes.get(i)
                        + "\nPreço: " + precos.get(i)
                        + "\nQuantidade: " + quantidades.get(i)
                        + "\nTotal: R$ " + total);
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Produto não encontrado.");
    }

    // 🔹 REMOVER
    private static void removerProduto() {

        String nomeRemover = JOptionPane.showInputDialog("Digite o nome do produto para remover:");

        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equalsIgnoreCase(nomeRemover)) {

                nomes.remove(i);
                precos.remove(i);
                quantidades.remove(i);

                JOptionPane.showMessageDialog(null, "Produto removido com sucesso!");
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Produto não encontrado.");
    }
}
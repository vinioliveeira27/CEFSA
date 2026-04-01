
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

package provas;

public class Prova2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    // =============================
		    // 🔢 VARIÁVEIS
		    // =============================
		    int idade = 21;
		    double altura = 1.76;
		    String nome = "Vinicius";
		    boolean ativo = true;

		    // =============================
		    // 🧮 IF / ELSE
		    // =============================
		    if (idade >= 18) {
		        System.out.println("Maior de idade");
		    } else {
		        System.out.println("Menor de idade");
		    }

		    if (idade >= 18 && idade <= 60) {
		        System.out.println("Adulto");
		    }

		    if (idade < 18 || idade > 60) {
		        System.out.println("Fora do padrão");
		    }

		    // =============================
		    // 🔁 FOR
		    // =============================
		    for (int i = 0; i < 5; i++) {
		        System.out.println("FOR: " + i);
		    }

		    // =============================
		    // 🔁 WHILE
		    // =============================
		    int i = 0;
		    while (i < 5) {
		        System.out.println("WHILE: " + i);
		        i++;
		    }

		    // =============================
		    // 🔁 DO WHILE
		    // =============================
		    int j = 0;
		    do {
		        System.out.println("DO WHILE: " + j);
		        j++;
		    } while (j < 5);

		    // =============================
		    // 📊 ARRAY (VETOR)
		    // =============================

		    int[] numeros = new int[5];
		    numeros[0] = 10;

		    int[] nums = {1, 2, 3, 4, 5};

		    for (int k = 0; k < nums.length; k++) {
		        System.out.println("ARRAY: " + nums[k]);
		    }

		    // =============================
		    // 🧾 ARRAYLIST
		    // =============================

		    ArrayList<String> nomes = new ArrayList<>();

		    nomes.add("Ana");
		    nomes.add("Carlos");

		    System.out.println(nomes.get(0));

		    nomes.set(0, "João");

		    nomes.remove("Carlos");

		    System.out.println("Tamanho: " + nomes.size());

		    System.out.println("Contém Ana? " + nomes.contains("Ana"));

		    Collections.sort(nomes);

		    for (String n : nomes) {
		        System.out.println("ARRAYLIST: " + n);
		    }

		    // =============================
		    // 📌 MÉDIA (ARRAY)
		    // =============================

		    int[] notasArray = {7, 8, 6};
		    int somaArray = 0;

		    for (int k = 0; k < notasArray.length; k++) {
		        somaArray += notasArray[k];
		    }

		    int mediaArray = somaArray / notasArray.length;
		    System.out.println("Média ARRAY: " + mediaArray);

		    // =============================
		    // 📌 MÉDIA (ARRAYLIST)
		    // =============================

		    ArrayList<Double> notas = new ArrayList<>();
		    notas.add(7.5);
		    notas.add(8.0);
		    notas.add(6.0);

		    double soma = 0;

		    for (double n : notas) {
		        soma += n;
		    }

		    double media = soma / notas.size();
		    System.out.println("Média ARRAYLIST: " + media);

		    // =============================
		    // 📌 MAIOR NÚMERO
		    // =============================

		    int[] valores = {2, 9, 5, 1};
		    int maior = valores[0];

		    for (int k = 1; k < valores.length; k++) {
		        if (valores[k] > maior) {
		            maior = valores[k];
		        }
		    }

		    System.out.println("Maior: " + maior);

		    // =============================
		    // 📌 CONTAR PARES
		    // =============================

		    int[] lista = {1, 2, 3, 4, 5, 6};
		    int count = 0;

		    for (int n : lista) {
		        if (n % 2 == 0) {
		            count++;
		        }
		    }

		    System.out.println("Pares: " + count);

		    // =============================
		    // 📌 SISTEMA SIMPLES
		    // =============================

		    Scanner sc = new Scanner(System.in);
		    ArrayList<String> sistema = new ArrayList<>();
		    int opcao = 0;

		    while (opcao != 4) {
		        System.out.println("1-Adicionar 2-Listar 3-Remover 4-Sair");
		        opcao = sc.nextInt();
		        sc.nextLine();

		        if (opcao == 1) {
		            String nomeInput = sc.nextLine();
		            sistema.add(nomeInput);
		        } else if (opcao == 2) {
		            for (String n : sistema) {
		                System.out.println(n);
		            }
		        } else if (opcao == 3) {
		            String nomeRemove = sc.nextLine();
		            sistema.remove(nomeRemove);
		        }
		    }

		    sc.close();

		    // =============================
		    // ⚠️ DICAS IMPORTANTES
		    // =============================

		    // ARRAY -> .length
		    // ARRAYLIST -> .size()
		    // int -> Integer (ArrayList)
		    // índice começa em 0

		    // CUIDADO:
		    // loop infinito (while sem i++)
		    // índice inválido
		    // divisão por zero

		}```

}
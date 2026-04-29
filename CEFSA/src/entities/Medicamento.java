package entities;

public class Medicamento extends Farmacia {

	private boolean receitaObrigatoria;

	public Medicamento(String nomeProduto, String marca, String quantidade, double valor, boolean receitaObrigatoria) {
		super(nomeProduto, marca, quantidade, valor);
		this.receitaObrigatoria = receitaObrigatoria;
	}
	

}

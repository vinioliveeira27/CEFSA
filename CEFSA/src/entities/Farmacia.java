package entities;

public class Farmacia {
	private String nomeProduto;
	private String marca;
	private String quantidade;
	private double valor;

	public Farmacia(String nomeProduto, String marca, String quantidade, double valor) {
		super();
		this.nomeProduto = nomeProduto;
		this.marca = marca;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;

	}

	public void visualizar() {
		System.out.println("Nome: " + nomeProduto);
		System.out.println("Marca: " + marca);
		System.out.println("Preço: " + valor);
		System.out.println("Quantidade: " + quantidade);

	}
}
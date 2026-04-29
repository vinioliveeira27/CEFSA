package poo;

public class Profissao {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

	private String nomeCliente;
	private int codigoCliente;
	private int idadeCliente;
	private int dia;
	private String hora;

	public Profissao(String nomeCliente, int codigoCliente, int idadeCliente) {
		this.nomeCliente = nomeCliente;
		this.codigoCliente = codigoCliente;
		this.idadeCliente = idadeCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public int getIdadeCliente() {
		return idadeCliente;
	}

	public void setIdadeCliente(int idadeCliente) {
		this.idadeCliente = idadeCliente;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getInfo() {
		return "Nome: " + nomeCliente + "\nCódigo: " + codigoCliente + "\nIdade: " + idadeCliente + "\nDia: " + dia
				+ "\nHora: " + hora;
	}
}

package entities;

public class Gelo extends Produto {
	private double peso;
	
	public Gelo(String descricao, String codigo, double valorUnitario) {
		super(descricao, codigo, valorUnitario);
		// TODO Auto-generated constructor stub
	}
	
	public Gelo(String descricao, String codigo, double valorUnitario, int quantEstoque) {
		super(descricao, codigo, valorUnitario);
		// TODO Auto-generated constructor stub
	}

	//Encapsulamentos
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
package entities;

public class Doces extends Produto {
	private String fabricante;

	public Doces(String descricao, String iD, double valorUnitario, String fabricante) {
		super(descricao, iD, valorUnitario);
		this.fabricante = fabricante;
	}

	//Encapsulamento - Getters and setters
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
}
package entities;

public class Doces extends Produto {
	private String fabricante;
	
	public Doces(String descricao, String codigo, double valorUnitario, int quantEstoque, String fabricante) {
		super(descricao, codigo, valorUnitario);
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
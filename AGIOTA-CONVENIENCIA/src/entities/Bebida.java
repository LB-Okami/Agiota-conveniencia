package entities;

public class Bebida extends Produto{
	private String fabricante;
	
	public Bebida(String descricao, String codigo, double valorUnitario, int quantEstoque, String fabricante) {
		super(descricao, codigo, valorUnitario, quantEstoque);
		this.fabricante = fabricante;
		
	}
	
	//Encapsulamento
	public String getFabricante() {
		return fabricante;
	}

	/*
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	*/
}

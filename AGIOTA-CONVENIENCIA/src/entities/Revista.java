package entities;

public class Revista extends Produto {
	private String editora;

	

	public Revista(String descricao, String codigo, double valorUnitario) {
		super(descricao, codigo, valorUnitario);
		// TODO Auto-generated constructor stub
	}
	
	public Revista(String descricao, String codigo, double valorUnitario, int quantEstoque) {
		super(descricao, codigo, valorUnitario);
		// TODO Auto-generated constructor stub
	}

	   

	//Encapsulamento - Getters and setters
	
	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
}
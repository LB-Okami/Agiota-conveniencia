package entities;

public abstract class Produto {
	//Atributos
	private String descricao;
	private String ID;
	private double valorUnitario;
	private int quantEstoque = 0;
	
	
	//Construtor 
	public Produto(String descricao, String iD, double valorUnitario) {
		super();
		this.descricao = descricao;
		ID = iD; 
		this.valorUnitario = valorUnitario;
	}
	//Construtor com sobrecarga
	public Produto(String descricao, String iD) {
		super();
		this.descricao = descricao;
		ID = iD;
	}

	
	
	//Encapsulamento - getters & setters
	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getID() {
		return ID;
	}

	/*
	 public void setID(String ID) {
		this.ID = ID;
	}
	*/

	public double getValorUnitario() {
		return valorUnitario;
	}


	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}


	public int getQuantEstoque() {
		return quantEstoque;
	}

	/*
	public void setQuantEstoque(int quantEstoque) {
		this.quantEstoque = quantEstoque;
	}
	
	*/
	
	//Métodos
	public void incluirEstoque(int valorInserido) {
		quantEstoque += valorInserido;
		
	}
	
	public void retirarEstoque(int valorInserido) {
		
		if(quantEstoque >= valorInserido) {
			quantEstoque -= valorInserido;
		}
		else if(quantEstoque < valorInserido) {
			System.out.println("Infelizmente o estoque deste produto acabou...");
		}
	}
}
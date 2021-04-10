package entities;

import java.util.List;

public class Loja extends Produto {
	private String cnpj = "19819156";
	private String nomeEmpresa = "Agiota Conveni�ncia";
	private double total = 0;
	private double juros10 = 0;
	private double juros20 = 0;
	private double desconto = 0;
	
	public Loja(String descricao, String codigo) {
		super(descricao, codigo);
	}


	//Encapsulamento
	public String getCnpj() {
		return cnpj;
	}
	
	/*
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	*/
	public String getNome() {
		return nomeEmpresa;
	}
	
	/*
	public void setNome(String nome) {
		this.nome = nome;
	}
	*/
	
	//M�todos
	
	
	public void emissaoNota(double total, List<Produto> lista) {
		
		System.out.print(nomeEmpresa);
		System.out.println("\nCNPJ: " + cnpj);
		System.out.println("NFe: 15615616565");
		
		for(Produto x: lista) {
			if(x.getQuantEstoque() != 10) {
				System.out.println("Descri��o: " + x.getDescricao() + " | Valor unit�rio: " + x.getValorUnitario() + " | Quantidade: " + (10 - x.getQuantEstoque()));
			}
		}
	}
	
	public void pagamento (int opcaoPagamento, int vezes, double total) {
		double resultado = 0;
		double parcela = 0;
		this.total = total;
		
		if(opcaoPagamento == 1) {
			if(vezes == 1) {
				resultado = total + (total * 0.1);
				this.juros10 = total * 0.1;
				System.out.printf("O total de juros foi: %.2f\n", juros10);
				System.out.println("O total � R$" + resultado);
			}
			else if(vezes == 2) {
				resultado = total + (total * 0.2);
				parcela = resultado / 2; 
				this.juros20 = total * 0.2;
				System.out.printf("O total de juros foi: %.2f\n", juros20);
				System.out.println("O total � R$"+ resultado);
				System.out.println("Valor por parcela "+ parcela);
			}
		}
		else if(opcaoPagamento == 2) {
			System.out.println("O total � R$" + total);
		}
		else if(opcaoPagamento == 3) {
			resultado = total - (total * 0.1);
			this.desconto = total * 0.1;
			System.out.printf("O total de desconto foi: %.2f\n", desconto);
			System.out.println("O total � R$" + resultado);
		}
		else {
			System.out.println("Insira uma op��o v�lida");
		}
	}
	
}
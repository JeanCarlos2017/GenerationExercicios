package semana4.dia2Heranca;

import java.text.NumberFormat;

/*
Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe
Fornecedor. 

Considere que cada instância da classe Fornecedor tem, para além dos atributos
que caracterizam a classe Pessoa, os atributos valorCredito (correspondente ao crédito
máximo atribuído ao fornecedor) e valorDivida (montante da dívida para com o fornecedor).

Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadores,
um método obterSaldo() que devolve a diferença entre os valores dos atributos valorCredito e
valorDivida. 
Depois de implementada a classe Fornecedor, crie um programa de teste
adequado que lhe permita verificar o funcionamento dos métodos implementados na classe
Fornecedor e os herdados da classe Pessoa.
*/
public class Fornecedor extends Pessoa {
	private float valorCredito;
	private float valorDivida;
	
	
	
	
	
	public Fornecedor(String nome, String endereço, String telefone) {
		super(nome, endereço, telefone);
	}
	
	public Fornecedor(String nome, String endereço, String telefone, float valorCredito, float valorDivida) {
		super(nome, endereço, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}



	public float obterSaldo() {
		return this.valorCredito - this.valorDivida;
	}
	
	
	public String format(float number) {
		return NumberFormat.getCurrencyInstance().format(number);
	}

	@Override
	public String toString() {
		return  super.toString() 
				+ " Fornecedor[valorCredito= " + this.format(valorCredito) + ", valorDivida= " 
				+ this.format(valorDivida)
				+", saldo= "+this.format(this.obterSaldo())+ "]";
	}

	//getters and setters
	public float getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}
	public float getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}
	
}




package semana4.dia2Heranca;

import java.text.NumberFormat;

/*
 * Considere, como subclasse da classe Pessoa, a classe Empregado. 
 * Considere que cada instância da classe Empregado tem, para além dos atributos que caracterizam a classe Pessoa,
	os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem
	retida dos impostos). Implemente a classe Empregado com métodos seletores e modificadores
	e um método calcularSalario. Escreva um programa de teste adequado para a classe
	Empregado.
 */
public class Empregado extends Pessoa{
	private int codigoSetor;
	private float salarioBase;
	private float salarioLimpo; //sem imposto
	private float imposto; //valor decimal de 0 a 1
	
	
	//constructors	
	public Empregado(String nome, String endereço, String telefone, int codigoSetor, float salarioBase, float imposto) {
		super(nome, endereço, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
		this.calculaSalario(); //calcular o salario limpo do empregado
	}
	public Empregado(String nome, String endereço, String telefone) {
		super(nome, endereço, telefone);
	}
	
	public void calculaSalario() {
		this.salarioLimpo= (1 - this.imposto) * this.salarioBase;
	}
	
	public String format(float number) {
		return NumberFormat.getCurrencyInstance().format(number);
	}
	
	@Override
	public String toString() {
		return super.toString()+"Empregado [codigoSetor=" + codigoSetor + 
				", salarioBase=" + this.format(salarioBase) + ", salarioLimpo="
				+ this.format(salarioLimpo) + ", imposto=" + imposto + "]";
	}
	
	//get and set 
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public float getSalarioLimpo() {
		return this.salarioLimpo;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getImposto() {
		return imposto;
	}
	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	
	
}

package semana4.dia2Heranca;

public class Operario extends Pessoa{
	private float valorProducao;
	private float comissao;
	private float salarioBase;
	private float salarioComissao; //salario total do empregado
	
	
	//constructors 
	public Operario(String nome, String endereço, String telefone) {
		super(nome, endereço, telefone);
	}
	
	public Operario(String nome, String endereço, String telefone, float valorProducao, float comissao,
			float salarioBase) {
		super(nome, endereço, telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
		this.salarioBase = salarioBase;
		this.setSalarioComissao();
	}
	
	

	@Override
	public String toString() {
		return  super.toString() 
				+ " Operario [valorProducao=" + valorProducao + ", comissao=" + comissao + ", "
						+ "salarioBase=" + salarioBase+ ", salário total= "+ salarioComissao
				+ "]";
	}
	
	public void setSalarioComissao() {
		this.salarioComissao = this.salarioBase + (this.valorProducao * this.comissao);
	}
	
	//get e set 
	public float getSalarioComissao() {
		return salarioComissao;
	}

	

	public float getValorProducao() {
		return valorProducao;
	}
	
	public void setValorProducao(float valorProducao) {
		this.valorProducao = valorProducao;
	}
	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	
}

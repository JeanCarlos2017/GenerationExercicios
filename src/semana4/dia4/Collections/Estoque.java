package semana4.dia4.Collections;

public class Estoque implements Comparable<Estoque>{
	//implements Comparable: usado para usar o método sort, que é um método que ordena a minha collection - list 
	//caso não deseja fazer a ordenação o implements Comparable não se faz necessário
	
	//PS: atributos elaborados de forma bem superficial
	private int qntProduto;
	private int idEstoque; //usado apenas para o estoque ter mais atributos :D
	private String tipoProduto;
	private String nomeResponsavel;
	private String descricao;
	
	
	
	public Estoque(int qntProduto, int idEstoque, String tipoProduto, String nomeResponsavel, String descricao) {
		super();
		this.qntProduto = qntProduto;
		this.idEstoque = idEstoque;
		this.tipoProduto = tipoProduto;
		this.nomeResponsavel = nomeResponsavel;
		this.descricao = descricao;
	}

	
	
	@Override
	public String toString() {
		return "\nEstoque [qntProduto=" + qntProduto + ", idEstoque=" + idEstoque + ", tipoProduto=" + tipoProduto
				+ ", nomeResponsavel=" + nomeResponsavel + ", descricao=" + descricao+ "]";
	}

	public int compareTo(Estoque e) {
		/*aqui eu indico que eu quero ordenar de acordo com o nome responsável,
		 *  se nao deseja ordenar, não é necessário ter esse método
		 */
		return this.nomeResponsavel.compareTo(e.nomeResponsavel);
	}
	//get and set 
	public int getQntProduto() {
		return qntProduto;
	}
	public void setQntProduto(int qntProduto) {
		this.qntProduto = qntProduto;
	}
	public String getTipoProduto() {
		return tipoProduto;
	}
	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}
	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}
	public int getIdEstoque() {
		return idEstoque;
	}
	public void setIdEstoque(int idEstoque) {
		this.idEstoque = idEstoque;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	

}

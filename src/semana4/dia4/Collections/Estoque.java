package semana4.dia4.Collections;

public class Estoque {
	//PS: atributos elaborados de forma bem superficial
	private int qntProduto;
	private int idEstoque; //usado apenas para o estoque ter mais atributos kk 
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

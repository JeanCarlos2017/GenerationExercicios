package semana4.dia1;

public class Ex3Produto {
	private String nome;
	private String descricao;
	private float preco;
	private int garantia; //garantia em meses 
	private float notaAvaliacao;
	private int qntEstoque;
	
	public Ex3Produto(String nome, String descricao, float preco, int garantia, 
			float notaAvaliacao, int qntEstoque) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.garantia = garantia;
		this.notaAvaliacao = notaAvaliacao;
		this.qntEstoque = qntEstoque;
	}

	@Override
	public String toString() {
		return "Ex3Produto [nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + 
				", garantia=" + garantia	+ ", notaAvaliacao=" + notaAvaliacao
				+ ", qntEstoque=" + qntEstoque + "]";
	}
	
	public static void main( String args[]) {
		Ex3Produto lista_produto[] = new Ex3Produto[3];
		
		lista_produto[0]= new Ex3Produto("Celular", "celular rápido e eficiente...", 1200.99f, 
				36, 4.1f, 1000);
		
		lista_produto[1]= new Ex3Produto("Relógio", "presenteie a pessoa que voce ama com....", 120.99f, 
				0, 4.5f, 40);
		lista_produto[2]= new Ex3Produto("Televisão", "assista os seus programas favoritos...", 3200.99f, 
				36, 2.1f, 10000);
		
		for(int i=0; i <=2; i++) {
			System.out.println(lista_produto[i].toString()+"\n");
		}
	}
	
}

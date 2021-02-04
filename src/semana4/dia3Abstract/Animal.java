package semana4.dia3Abstract;

public abstract class Animal {
	private String nome;
	private int idade;
	private static int qntAnimal= 0;
	
	
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
		Animal.qntAnimal++;
	}
	
	public abstract String emitirSom();

	@Override
	public String toString() {
		return "[Nome=" + nome + ", Idade=" + idade + "]\n";
	}
	
	//get & set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public static int getQntAnimal() {
		return qntAnimal;
	}
	
	public static int setQntAnimal() {
		return qntAnimal++;
	}
	
	

}

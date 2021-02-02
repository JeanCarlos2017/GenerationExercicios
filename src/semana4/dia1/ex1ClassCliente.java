package semana4.dia1;

import java.util.ArrayList;

public class ex1ClassCliente {
	private String nome;
	private int idade;
	private boolean ativo;
	private String endereco;
	private String email;
	private String telefone;
	
	//construtores 
	public ex1ClassCliente() {}
	
	public ex1ClassCliente(String nome, int idade, boolean ativo, String endereco, 
			String email, String telefone) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.ativo = ativo;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}
	
	//getters 
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}

	@Override
	public String toString() {
		return "ex1ClassCliente [nome=" + nome + ", idade=" + idade + ", ativo=" + ativo + 
				", endereco=" + endereco+ ", email=" + email + ", telefone=" + telefone + "]\n\n";
	}
	
	
	
	public static void main(String args[]) {
		ArrayList<ex1ClassCliente> arrayCliente = new ArrayList<>();
		//populando o array 
		arrayCliente.add(new ex1ClassCliente("Jean Carlos", 27, true, "Poá-São José", 
				"jean@email.com", "jean_telefone"));
		arrayCliente.add(new ex1ClassCliente("Mamis", 25, true, "Poá-São José", 
				"mamis@email.com", "mamis_telefone"));
		arrayCliente.add(new ex1ClassCliente("Paula", 27, true, "Poá-Nova Poá", 
				"paula@email.com", "paula_telefone"));
		arrayCliente.add(new ex1ClassCliente("Rafaella", 5, true, "Poá-Nova Poá", 
				"rafan@email.com", "rafa_telefone"));
		
		//imprimindo 
		arrayCliente.stream().forEach( cliente -> System.out.println(cliente.toString()));
		
	}
	
	
	
	
	

}

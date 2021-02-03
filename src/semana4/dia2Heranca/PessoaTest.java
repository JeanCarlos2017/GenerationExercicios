package semana4.dia2Heranca;

public class PessoaTest {
	public static void main(String[] args) {
		Pessoa vet_pessoa[]= new Pessoa[3];
		vet_pessoa[0]= new Pessoa("pessoa1", "endereço1", "telefone1");
		vet_pessoa[1]= new Pessoa("pessoa2", "endereço2");
		vet_pessoa[2]= new Pessoa();
		
		for(int i=0; i < 3; i++) {
			System.out.println(vet_pessoa[i]);
		}
		
		vet_pessoa[1].setTelefone("telefone2");
		vet_pessoa[2].setNome("nome3");
		vet_pessoa[2].setEndereço("endereço3");
		vet_pessoa[2].setTelefone("telefone3");
		
		System.out.println("\n\nNova impressão");
		for(int i=0; i < 3; i++) {
			System.out.println(vet_pessoa[i]);
		}
	}

}

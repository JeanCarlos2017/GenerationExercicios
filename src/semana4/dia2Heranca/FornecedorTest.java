package semana4.dia2Heranca;

public class FornecedorTest {
	public static void main(String[] args) {
		Fornecedor vet_forn[]= new Fornecedor[3];
		
		vet_forn[0]= new Fornecedor("fornecedor1", "endereço1", "telefone1", 3000.50f, 197.33f);
		vet_forn[1]= new Fornecedor("fornecedor2", "endereço2", "telefone2");
		vet_forn[2]= new Fornecedor("fornecedor3", "endereço3", "telefone3", 3.50f, 7893.5f);
		
		for (int i = 0; i < vet_forn.length; i++) {
			System.out.println(vet_forn[i]);
			
		}
		
		
		vet_forn[2].setNome("Vencedor jogo do bixo");
		vet_forn[2].setValorCredito(10000.50f);
		System.out.println("\n\n"+vet_forn[2]);
		
	}
}

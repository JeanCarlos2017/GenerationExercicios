package semana4.dia2Heranca;

public class OperarioTest {
	public static void main(String[] args) {
		Operario vet_op[]= new Operario[3];
		
		vet_op[0]= new Operario("operario1", "endereço1", "telefone1");
		vet_op[1]= new Operario("operario2", "endereço2", "telefone2", 300f, 0.01f, 993.42f);
		vet_op[2]= new Operario("operario3", "endereço3", "telefone3", 87000f, 0.1f, 2587.66f);
		
		for (int i= 0; i < vet_op.length; i++) {
			System.out.println(vet_op[i]);
		}
		
	}

}

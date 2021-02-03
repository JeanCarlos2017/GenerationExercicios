package semana4.dia2Heranca;

public class EmpregadoTest {
	public static void main(String[] args) {
		Empregado vet_emp[]= new Empregado[3];
		
		vet_emp[0]= new Empregado("empregado1", "endereço1", "telefone1", 01, 1250.75f, 0.1f);
		vet_emp[1]= new Empregado("empregado2", "endereço2", "telefone2");
		vet_emp[2]= new Empregado("empregado3", "endereço3", "telefone3", 03, 22250.75f, 0.3f);
		
		for (int i = 0; i < vet_emp.length; i++) {
			System.out.println(vet_emp[i]);
		}
		
		vet_emp[1].setCodigoSetor(2);
		vet_emp[1].setSalarioBase(50000.30f);
		vet_emp[1].setImposto(0.2f);
		vet_emp[1].calculaSalario();
		System.out.println("\n\n"+vet_emp[1]);
	}

}

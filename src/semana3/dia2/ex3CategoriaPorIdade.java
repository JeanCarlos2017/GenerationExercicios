package semana3.dia2;

import java.util.Scanner;

public class ex3CategoriaPorIdade {
	public static void main (String[] args) {
		int idade;
		String categoria= "nenhuma";
		
		try (Scanner leitura = new Scanner(System.in)) {
			System.out.print("Digite a sua idade: ");
			idade= leitura.nextInt();
			
			if(idade >= 10 && idade <= 14) {
				categoria= "infantil";
			}
			
			if(idade >= 15 && idade <= 17) {
				categoria= "juvenil";
			}
			
			if(idade >=18 && idade <=25) {
				categoria="adulto";
			}
			
			System.out.println("Você pertence a categoria: "+categoria);
		}
	}

}

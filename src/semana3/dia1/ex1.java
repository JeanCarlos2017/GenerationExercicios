package semana3.dia1;

import java.util.Scanner;

public class ex1 {
	//programa que converte a idade de uma pessoa para dias 
	public static void main (String[] args) {
		int qnt_anos, qnt_meses, qnt_dias, resposta;
		try (Scanner leitura = new Scanner(System.in)) {
			
			//leitura dos dados fornecidos pelo usuário 
			System.out.print("Digite a quantidade de anos que você tem: ");
			qnt_anos = leitura.nextInt();
			System.out.print("Digite a quantidade de meses que você tem: ");
			qnt_meses = leitura.nextInt();
			System.out.print("Digite a quantidade de dias que você tem: ");
			qnt_dias = leitura.nextInt();
			
			//apresentando a resposta para o usuário
			resposta = (qnt_anos * 365) + (qnt_meses*30) + qnt_dias;
			System.out.println("\nVocê tem "+resposta+" dias!");
			
		}catch(Exception e) {
			System.out.println("Erro na leitura de dados. "+e);
		}
		
		
	}
}

package semana3;

import java.util.Scanner;

	public class ex2 {
		//programa que converte a quantidade de dias da pessoa para a sua idade 
		public static void main (String[] args) {
			int qnt_anos, qnt_meses, entrada_usuario;
			try (Scanner leitura = new Scanner(System.in)) {
				
				//leitura dos dados fornecidos pelo usu�rio 
				System.out.print("Digite a quantidade de dias que voc� tem: ");
				entrada_usuario = leitura.nextInt();
				
				//obtendo a quantidade de anos que o usu�rio tem
				qnt_anos = entrada_usuario/365;
				entrada_usuario%= 365;
				//obtendo quandos meses ele tem 
				qnt_meses = entrada_usuario/30;
				entrada_usuario%=30; //quantidade de dias do usu�rio
				
				//mostrando a resposta ao usu�rio 
				System.out.println("O usu�rio tem "+qnt_anos+" anos, "+
						qnt_meses+ " meses e "+entrada_usuario+" dias!");
				
				
			}catch(Exception e) {
				System.out.println("Erro na leitura de dados. "+e);
			}
			
		
	}
}

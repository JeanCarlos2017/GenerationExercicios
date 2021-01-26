package semana3.dia1;

import java.util.Scanner;

public class ex3 {
	//programa que converte a quantidade de horas de uma pessoa para segundos
	public static void main (String[] args) {
		int qnt_horas, qnt_minutos, qnt_segundos;
		try (Scanner leitura = new Scanner(System.in)) {
			
			//leitura dos dados fornecidos pelo usuário 
			System.out.print("Digite a quantidade de segundos: ");
			qnt_segundos = leitura.nextInt();
			
			//obtendo a quantidade de horas
			qnt_horas = qnt_segundos/3600;
			qnt_segundos%= 3600;
			//obtendo quandos minutos
			qnt_minutos = qnt_segundos/60;
			qnt_segundos%=60; //quantidade de dias do usuário
			
			//mostrando a resposta ao usuário 
			System.out.println("\n"+qnt_horas+" hora(s), "+
					qnt_minutos+ " minuto(s) e "+qnt_segundos+" segundo(s)");
			
			
		}catch(Exception e) {
			System.out.println("Erro na leitura de dados. "+e);
		}
	}
}

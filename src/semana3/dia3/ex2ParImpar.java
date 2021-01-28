package semana3.dia3;

import java.util.Scanner;

public class ex2ParImpar {
	//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
	public static void main (String[] args) {
		int entrada_usuario, contPar = 0, contImpar = 0;
		try (Scanner leitura = new Scanner(System.in)) {
			for(int i= 1; i <= 10; i++) {
				System.out.print("Digite o "+i +"° número: ");
				entrada_usuario = leitura.nextInt();
				
				if( (entrada_usuario%2) == 0) contPar++;
				else contImpar++;
			}
			System.out.println("Temos "+contPar+" números pares e "+contImpar+" números ímpares");
		}catch(Exception ex) {
			System.out.println("Entrada Inválida. Erro: "+ex);
		}
		
	}
}

package semana3.dia3;
import java.util.Scanner;

public class ex3ContIdade {
	//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	//idade for =-99. (WHILE)
		public static void main (String[] args) {
			int entrada_usuario=0, 
					cont21 = 0, cont50 = 0;
			
			try (Scanner leitura = new Scanner(System.in)) {
				while(entrada_usuario != 99) {
										
					if(entrada_usuario > 0 && entrada_usuario < 21) cont21++;
					if( entrada_usuario > 50) cont50++;
					
					System.out.print("Digite a idade do usuário: ");
					entrada_usuario = leitura.nextInt();
				}
				System.out.println("Temos "+cont21+" pessoas com menos de 21 anos");
				System.out.println("Temos "+cont50+" pessoas com mais  de 50 anos");
			}catch(Exception ex) {
				System.out.println("Entrada Inválida. Erro: "+ex);
			}
			
		}
}

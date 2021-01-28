package semana3.dia3;

import java.util.Scanner;

public class ex6MediaMult3 {
 /*
  * 6- Escrever um programa que receba vários números inteiros no teclado. E no
	final imprimir a média dos números múltiplos de 3. Para sair digitar
	0(zero).(DO...WHILE)
  */
	public static void main (String[] args) {
		int entrada_usuario=0, somaMult3= 0, contMult3= 0;
		float media= 0;
		
		try (Scanner leitura = new Scanner(System.in)) {
			do {
				System.out.print("Digite um número: ");
				entrada_usuario = leitura.nextInt();
				
				if( (entrada_usuario % 3) == 0 && entrada_usuario!= 0) {
					somaMult3+= entrada_usuario;
					contMult3++;
				}
				
			}while(entrada_usuario != 0);
			
			if(contMult3 != 0) media = (float) somaMult3/contMult3;
			
			System.out.println("A média dos números digitados que são múltiplos por 3 é: "+media);
		}catch(Exception ex) {
			System.out.println("Entrada Inválida. Erro: "+ex);
		}
		
	}
}

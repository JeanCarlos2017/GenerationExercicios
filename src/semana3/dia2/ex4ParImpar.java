package semana3.dia2;

import java.util.Scanner;

public class ex4ParImpar {
	public static void main (String[] args) {
		int entrada_usuario;
		float raiz;
		try (Scanner leitura = new Scanner(System.in)) {
			System.out.print("Digite um n�mero: ");
			entrada_usuario = leitura.nextInt();
			
			if(entrada_usuario % 2 == 0) {
				
				System.out.print("O n�mero "+entrada_usuario+" � par, ");
				raiz = (float) Math.sqrt(entrada_usuario);
				System.out.println("e sua raiz quadrada �: "+String.format("%.2f", raiz));
				
			}else {
				System.out.print("O n�mero "+entrada_usuario+" � �mpar, ");
				entrada_usuario = (int) Math.pow(entrada_usuario, 2);
				System.out.println("e elevado ao quadrado fica: "+entrada_usuario);
			}
		}catch (Exception ex) {
			System.out.println("Erro na leitura de dados. "+ex);
		}
	}

}

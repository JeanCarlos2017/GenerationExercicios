package semana3.dia1;

import java.util.Scanner;

public class ex5 {
	//programa que calcula a média 
	public static void main (String[] args) {
		float n1, n2, n3, media;
		
		try (Scanner leitura = new Scanner(System.in)) {
			System.out.println("Digite a primeira nota: ");
			n1 = leitura.nextFloat();
			System.out.println("Digite a segunda nota: ");
			n2 = leitura.nextFloat();
			System.out.println("Digite a terceira nota: ");
			n3 = leitura.nextFloat();
			
			//calculando a média
			media= (float) ((n1*2 + n2*3 + n3*5)/10);
			System.out.println("Sua média é: "+media);
			
		}catch(Exception e) {
			System.out.println("Erro na leitura de dados. "+e);
		}
	}

}

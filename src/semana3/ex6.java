package semana3;

import java.util.Scanner;

public class ex6 {
	//calcula a distancia entre dois pontos 
	public static void main (String[] args) {
		float x1, x2, y1, y2, distancia;
		
		try (Scanner leitura = new Scanner(System.in)) {
			//lendo a entrada do usuário
			System.out.println("Digite o valor de x1: ");
			x1 = leitura.nextFloat();
			System.out.println("Digite o valor de y1: ");
			y1 = leitura.nextFloat();
			System.out.println("Digite o valor de x2: ");
			x2 = leitura.nextFloat();
			System.out.println("Digite o valor de y2: ");
			y2 = leitura.nextFloat();
			
			//calculo da distancia 
			distancia = (float) Math.sqrt( Math.pow( x2-x1, 2) + Math.pow( y2-y1, 2) );
			System.out.println("Distância: "+distancia);
			
		}catch(Exception e) {
			System.out.println("Erro na leitura de dados. "+e);
		}
	}

}

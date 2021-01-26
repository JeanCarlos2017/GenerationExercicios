package semana3.dia1;

import java.util.Scanner;

public class ex7 {
		//encontra o valor de x e y
		public static void main (String[] args) {
			float a, b, c, d, e, f, x, y, divisor;
			
			try (Scanner leitura = new Scanner(System.in)) {
				//lendo a entrada do usuário
				System.out.print("Digite o valor de a:");
				a = leitura.nextFloat();
				System.out.print("Digite o valor de b:");
				b = leitura.nextFloat();
				System.out.print("Digite o valor de c:");
				c = leitura.nextFloat();
				System.out.print("Digite o valor de d:");
				d = leitura.nextFloat();
				System.out.print("Digite o valor de e:");
				e = leitura.nextFloat();
				System.out.print("Digite o valor de f:");
				f = leitura.nextFloat();
				//divisor 
				divisor = ( a*e - b*d );
				//calculando x e y
				x = ( ( c*e - b*f) / divisor );
				y = ( ( a*f - c*d) / divisor);
				
				System.out.println("Valor de x: "+x);
				System.out.println("Valor de y: "+y);
			}catch(Exception ex) {
				System.out.println("Erro na leitura de dados. "+ex);
			}
		}

}

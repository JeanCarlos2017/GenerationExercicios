package semana3.dia3;

public class ex1DivPor11 {
	public static void main (String[] args) {
		//Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
		//obtemos resto = 5. (FOR)
		int pulaLinha= 0;
		
		System.out.println("Os n�meros entre 1000 - 1999 que divididos por 11 tem resto 5 s�o: ");
		for(int i= 1000; i < 2000; i++) {
			if( (i % 11) == 5) {
				System.out.print(i+" - ");
				pulaLinha++;
			}
			//pula linha a cada 10 numeros 
			if ( pulaLinha == 10) {
				System.out.println();
				pulaLinha= 0;
			}
		}
	}
}

package DesafiosEmprego.mercadoLivre;

import java.util.ArrayList;
import java.util.List;

public class Ex1Lista4Digitos {
	
	public static boolean verficaSomaNumeros(int numero, int maxDigit) {
		int digito= 1;
		int soma= 0;
		
		while(numero != 0) {
			//pego cada digito do número 
			digito= numero % 10;
			//faço a verificação 
			if(digito > maxDigit) {
				return false;
			}
			//somo cada digito 
			soma+= digito;
			//preparo para a proxima interação 
			numero /= 10;
			
		}
		//verifico a soma dos digitos 
		if (soma != 21 ) {
			return false;
		}
		return true;
	}
	public static List<Integer> calculation(int maxDigit) {
        List<Integer> list= new ArrayList<>();
        int limite= maxDigit*1111; //otimiza o código
        for(int i=1000; i <= limite; i++) {
        	if (Ex1Lista4Digitos.verficaSomaNumeros(i, maxDigit)) {
        		list.add(i);
        	}
        }
        if (list.size() == 0) return null;
        return list;
    }
	
	public static void main(String[] args) {
		List<Integer> list= Ex1Lista4Digitos.calculation(1);
		System.out.println(list);
	}
}

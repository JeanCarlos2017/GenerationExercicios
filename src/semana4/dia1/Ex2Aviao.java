package semana4.dia1;


public class Ex2Aviao {
	private String nomeFabricante;
	private String modelo;
	private int qntAssentos;
	
	
	public Ex2Aviao(String nomeFabricante, String modelo, int qntAssentos) {
		this.nomeFabricante = nomeFabricante;
		this.modelo = modelo;
		this.qntAssentos = qntAssentos;
	}


	@Override
	public String toString() {
		return "ex2Aviao [nomeFabricante=" + nomeFabricante + ", modelo=" + modelo + ", qntAssentos=" + qntAssentos
				+ "]";
	}
	
	
	public static void main( String args[]) {
		Ex2Aviao [] arrayAviao = new Ex2Aviao[3];
		arrayAviao[0]= new Ex2Aviao("Santos Dumont", "14-bis", 2);
		arrayAviao[1]= new Ex2Aviao("Fabricante1", "MOdelo01", 200);
		arrayAviao[2]= new Ex2Aviao("Fabricante2", "fabricante2-1344v5", 300);
		
		for(int i=0; i <=2; i++) {
			System.out.println(arrayAviao[i].toString()+"\n");
		}
	}
	
}

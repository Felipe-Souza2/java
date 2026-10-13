package vetores;

public class vetores2Dimensoes {

	public static void main(String[] args) {
		
		Double[] faturamentoJaneiro = new Double[] {1500.0, 2000.0, 1800.0};
		Double[] faturamentoFevereiro = new Double[] {1700.0, 2100.0, 1400.0};
		
		
		Double[][] faturamentoAnual= new Double[][] { faturamentoJaneiro, faturamentoFevereiro};
		
		System.out.println("Fatuaramento dia 1  de Janeiro: " + faturamentoAnual[0][2]);
		System.out.println("Fatuaramento dia 2  de Fevereiro: " + faturamentoAnual[1][2]);
		
		for (int i = 0 ; i < faturamentoAnual.length; i++) {
			System.out.println("Mes: " +(i+1));
			
			Double[] mes = faturamentoAnual[i];
			
			for (int in = 0; in < mes.length; in++) {
				Double dia = mes[in]; //Double dia = faturamentoAnual[i][in];
				
				System.out.println("Dia " + (in + 1) + ": " + dia);
			}
		}
	}
	

}

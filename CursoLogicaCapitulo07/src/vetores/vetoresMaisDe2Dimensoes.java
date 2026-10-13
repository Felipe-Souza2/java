package vetores;

public class vetoresMaisDe2Dimensoes {

	public static void main(String[] args) {
		
		Double[] faturamentoJaneiro = new Double[] {1500.0, 2000.0, 1800.0};
		Double[] faturamentoFevereiro = new Double[] {1700.0, 2100.0, 1400.0};
		
		
		Double[][] faturamentoAnual= new Double[][] { faturamentoJaneiro, faturamentoFevereiro}; // aqui só funciona com 1 dimenção
		
		Double[][][] faturamentoQuinquenal= new Double[][][] { faturamentoAnual};  //aqui só com  duas
		
		Double[][][][] faturamentoDaDecada= new Double[][][][] { faturamentoQuinquenal};  //aqui tres e assim sucessivamente funcionando com a anterior dentro das chaves  
		
		
//		A regra para vetores é  a posição de um vetor de mais de uma dimenção  a menos.
		
		
		
		
		
		
	}
	

}

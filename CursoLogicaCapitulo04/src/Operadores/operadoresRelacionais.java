package Operadores;

public class operadoresRelacionais {
	public static void main(String[] args) {
		Boolean tresMaiorQueDois = 3 > 2;
		System.out.println("3 > 2 ?" + tresMaiorQueDois);
		
		Boolean tresMenorQueDois = 3 < 2;
		System.out.println("3 < 2 ?" + tresMenorQueDois);
		
		Boolean tresMaiorQueTres = 3 > 3;
		System.out.println("3 > 3 ?" + tresMaiorQueTres);
		
		Boolean tresMaiorOuIgualTres = 3 >= 3;
		System.out.println("3 >= 3 ?" + tresMaiorOuIgualTres);
		
		Boolean tresMenorOuIgualTres = 3 <= 3;
		System.out.println("3 <= 3 ?" + tresMenorOuIgualTres);
		
		Boolean doisIgualADois = 2 == 2;
		System.out.println("2 == 2?" + doisIgualADois);
		
		Boolean doisDiferenteDeDois = 2 != 2;
		System.out.println("2 != 2? "  + doisDiferenteDeDois);
		
		Integer centoEVinteOito = 128;
		Integer centoEVinteOito02 = 128;
		Boolean centoEVinteOitoIgualCentoEVinteOito = centoEVinteOito.equals(centoEVinteOito02);
		System.out.println("centoEVinteOito.equals(centoEVinteOito02)? " + centoEVinteOitoIgualCentoEVinteOito);
		
		Boolean centoEVinteOitoIgualCentoEVinteOito02 = centoEVinteOito == centoEVinteOito02;  // só funcionana nos tipos "normais" ate o numero 127 para funcionar utilizar a funcionalidade .equal()
		System.out.println("centoEVinteOito == centoEVinteOito02? " + centoEVinteOitoIgualCentoEVinteOito02);  
		
		
		
		
	}
}

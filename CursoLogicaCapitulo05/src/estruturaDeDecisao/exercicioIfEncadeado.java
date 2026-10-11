package estruturaDeDecisao;

import java.util.Scanner;

public class exercicioIfEncadeado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Meta de faturamento anual do ano que passou: ");
		Double metaFatuaramentoAnual = scanner.nextDouble();
		
		System.out.print("Faturamento real do ultimo ano: ");
		Double faturamentoReal = scanner.nextDouble();
		
		System.out.print("Média salarial do funcionário do ultimo ano: ");
		Double mediaSalarialFuncionario = scanner.nextDouble();
		
		Double bonus = null;
		
		if ((faturamentoReal >= metaFatuaramentoAnual)) {
			System.out.println("O seu premio sera de: " + mediaSalarialFuncionario);
			
		} else if (faturamentoReal < metaFatuaramentoAnual) {
			bonus = mediaSalarialFuncionario * 0.8;
			System.out.println("O seu premio sera de: " + bonus);
		} 
		scanner.close();
	}

}

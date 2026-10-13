package vetores;

import java.util.Scanner;



public class exerciciosVetores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
	
		
		String[] tarefasDiarias = new String[5];
		
		for(int i = 0; i < tarefasDiarias.length; i++) {
			System.out.print("Digite suas tarefa " + i + ": ");
			tarefasDiarias[i] = scanner.nextLine();
		}
		
		System.out.println("sua lista ficou assim: ");
		
		for(int i = 0; i < tarefasDiarias.length; i++) {
			System.out.println(tarefasDiarias[i]);
		}
		
		scanner.close();
	}

}

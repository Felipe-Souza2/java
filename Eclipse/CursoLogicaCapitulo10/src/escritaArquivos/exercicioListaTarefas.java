package escritaArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class exercicioListaTarefas {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		String tarefas;
		
		int i = 0;
		while (true) {
			System.out.print("Tarefa " + i + ": ");
			tarefas = scanner.nextLine();
			
			if ("x".equals(tarefas)) {
				break;
			}
			linhas.add(tarefas);
			i++;
		}
		
		escrevendoLista("/Users/felipe/www/backend/estudos_java/java/aulaEExercicio/exercicio.txt\"", linhas);
		
		scanner.close();
		
	

	}
	static void  escrevendoLista (String lista,  ArrayList<String> linhas) throws IOException {
		Path path = Paths.get(lista);
		Files.write(path, linhas);
	}

}

package bibliotecaEmail;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.mail2.core.EmailException;

public class exercicioListaEmail {

	public static void main(String[] args) throws IOException, EmailException {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		String tarefa;
		
		int i = 0;
		while (true) {
			System.out.print("Tarefa " + i + ": ");
			tarefa = scanner.nextLine();
			
			if ("x".equals(tarefa)) {
				break;
			}
			
			linhas.add(tarefa);
			i++;
		}
		String tarefas = " ";
		
		for (int inte = 0; inte < linhas.size(); inte++) {
			 tarefas += linhas.get(inte) + "\n";
			 
		}
		
		String mensagem = "Suas tarefas " + tarefas;
		System.out.print("Digite seu Email: ");
		String para = scanner.next();
		
		Postman.listaTarefas(para, "Sua lista de tarefas", mensagem);
		
		System.out.println("fim..");
		scanner.close();
		
		
	}
	

}

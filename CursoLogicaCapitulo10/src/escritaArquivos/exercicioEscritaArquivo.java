package escritaArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class exercicioEscritaArquivo {

	public static void main(String[] args) throws IOException {
		Path arquivo = Paths.get("/Users/felipe/www/backend/estudos_java/java/aulaEExercicio/exercicio.txt\"");
		List<String> linhas =Files.readAllLines(arquivo);
		
		for (int i = 0; i< linhas.size(); i++) {
			String tarefas = linhas.get(i);
			System.out.println("Jogador " + i + ": " + tarefas);
		}
	}

}

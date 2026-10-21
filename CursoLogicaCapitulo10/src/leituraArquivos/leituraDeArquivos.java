package leituraArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class leituraDeArquivos {

	public static void main(String[] args) throws IOException {
		Path arquivo = Paths.get("/Users/felipe/www/backend/estudos_java/java/aulaEExercicio/arquivo.txt\"");
		List<String> linhas =Files.readAllLines(arquivo);
		
		for (int i = 0; i< linhas.size(); i++) {
			String nome = linhas.get(i);
			System.out.println("Jogador " + i + ": " + nome);
		}

	}

}

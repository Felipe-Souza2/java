package encapsulamento;

public class encapsulamentoMain {

	public static void main(String[] args) {
		
//		Cliente cliente = new Cliente();
//		cliente.nome = "Felipesouza";
//		cliente.telefone = "353123456789";
//		
//		System.out.println("Nome cliente:  " + cliente.nome);
		
		
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Felipe Souza");
		cliente.setTelefone("353123456789");
		
		System.out.println("Nome cliente:  " + cliente.getNome());
		System.out.println("Primeiro nome cliente:  " + cliente.getPrimeiroNome());
		System.out.println("Nome cliente:  " + cliente.getUltimoNome());
		
		
		
	}

}

package metodoIntancia;

public class metodoInstanciaMain {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.primeiroNome = "Felipe";
		cliente.ultimoNome = "Souza";
		cliente.telefone = "3538000000";
		cliente.email = "felipe@email.com";
		
		Cliente cliente2 = new Cliente();
		cliente2.primeiroNome = "Cheslem";
		cliente2.ultimoNome = "Sandim";
		cliente2.telefone = "3538000000";
		cliente2.email = "Ches@email.com";
	
//		System.out.println("nome Cliente: " + Cliente.obterNomeCompleto(cliente)); //Esse é o método estático.
		
		System.out.println("nome Cliente: " + cliente.obterNomeCompleto() + ", DDD: " + cliente.obterDDD());
		System.out.println("nome Cliente: " + cliente2.obterNomeCompleto() + ", DDD: " + cliente2.obterDDD());
}
}

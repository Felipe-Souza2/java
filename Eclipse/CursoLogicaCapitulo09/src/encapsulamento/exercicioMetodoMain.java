package encapsulamento;

public class exercicioMetodoMain {

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		
		pedido.setCodigo("a12xt43"); 
		pedido.setSubtotal(10.0);
//		pedido.setTotal(15.0);  
		pedido.setDesconto(0.5); 
		
		System.out.println("Código: " + pedido.getCodigo()+ ", " + "subtotal: " + pedido.getSubtotal() + ", " + "total: " + pedido.getTotal() + ", " + "desconto: " + pedido.getDesconto());
		
		
	}

}

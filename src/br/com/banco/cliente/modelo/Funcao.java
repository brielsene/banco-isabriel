package br.com.banco.cliente.modelo;

public enum Funcao {
	DEBITO{
		
		public void cartaoDebito() {
			System.out.println("Cartão de débito");
		}
		
	}, CREDITO{
		public void cartaoCredito(Cartao cartao) {	
			cartao.setTipo("Crédito");
		}
	}
	

}

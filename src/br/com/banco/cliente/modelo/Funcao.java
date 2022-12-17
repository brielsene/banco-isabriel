package br.com.banco.cliente.modelo;

public enum Funcao {
	DEBITO{
		
		public void cartaoDebito(Cartao cartao) {
			cartao.setTipo("Débito");
		}
		
	}, CREDITO{
		public void cartaoCredito(Cartao cartao) {	
			cartao.setTipo("Crédito");
		}
	}
	

}

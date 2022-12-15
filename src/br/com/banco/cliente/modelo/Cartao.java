package br.com.banco.cliente.modelo;

public class Cartao {
	private Conta conta;
	private String tipo;

	public Cartao(Conta conta) {
		this.conta = conta;

	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Conta getConta() {
		return conta;
	}
	
	public String getTipo() {
		return tipo;
	}

}

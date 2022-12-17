package br.com.banco.cliente.modelo;

public class Cartao {
	private Conta conta;
	private String tipo;

	public Cartao(Conta conta, Cartoes tipo) {
		this.conta = conta;
		this.tipo = tipo.name();

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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Cartão de "+this.tipo+", Conta: "+this.conta+"]";
	}

}

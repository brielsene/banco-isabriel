package br.com.banco.modelo;

public class Banco {
	private String unidade, endereco;
	private int numeroAgencia;
	
	
	public Banco(String unidade, String endereco, int numeroAgencia) {
		
		this.unidade = unidade;
		this.endereco = endereco;
		this.numeroAgencia = numeroAgencia;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public int getNumeroAgencia() {
		return numeroAgencia;
	}
	
	public String getUnidade() {
		return unidade;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Unidade: "+this.unidade+", Endereço: "+this.endereco+", Numero de agência: "+this.numeroAgencia+"]" ;
	}
	
	

}

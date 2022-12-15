package br.com.banco.cliente.modelo;

import java.time.LocalDate;

public class Cliente {
	private String nome;
	private int cpf;
	private LocalDate dataNascimento;
	private String endereco;
	private Conta conta;
	
	public Cliente(String nome, int cpf, LocalDate dataNascimento, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void atrelarConta(Conta conta) {
		this.conta = conta;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Nome: "+this.nome+", Cpf: "+this.cpf+", Data de Nascimento: "+this.dataNascimento+", endereço: "+this.endereco+
				", [Conta:"+this.conta+ "]";
		
	}
	
	
	
	

}

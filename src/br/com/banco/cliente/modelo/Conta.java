package br.com.banco.cliente.modelo;

import java.math.BigDecimal;

public abstract class Conta {
	private int numeroConta;
	private int agencia;
	private BigDecimal saldo;
	private Cliente cliente;
	
	
	
	
	public Conta(int numeroConta, int agencia, BigDecimal saldo, Cliente cliente) {
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
		
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	
	
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public BigDecimal getSaldo() {
		return saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Agência: "+this.agencia+", Numero da Conta: "+this.numeroConta+"]";
	}
	
	
	
	
	

}

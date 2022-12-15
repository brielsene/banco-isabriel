package br.com.banco.cliente.modelo;

import java.math.BigDecimal;

public abstract class Conta {
	private int numeroConta;
	private int agencia;
	private BigDecimal saldo;
	
	
	
	public Conta(int numeroConta, int agencia, BigDecimal saldo) {
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldo = saldo;
		
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Agência: "+this.agencia+", Numero da Conta: "+this.numeroConta+"]";
	}
	
	
	
	
	

}

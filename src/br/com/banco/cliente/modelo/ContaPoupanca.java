package br.com.banco.cliente.modelo;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int numeroConta, int agencia, BigDecimal saldo, Cliente cliente) {
		super(numeroConta, agencia, saldo, cliente);
		// TODO Auto-generated constructor stub
	}
	
	public void rendimento() {
		super.getSaldo().add(super.getSaldo().multiply(new BigDecimal("0.1")));
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "Poupanca"+", Agência: "+super.getAgencia()+", Numero da Conta: "+this.getNumeroConta()+", Nome Completo: "+this.getCliente().getNome()+"]";
	}

}

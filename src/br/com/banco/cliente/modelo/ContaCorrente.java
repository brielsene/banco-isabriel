package br.com.banco.cliente.modelo;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numeroConta, int agencia, BigDecimal saldo, Cliente cliente) {
		super(numeroConta, agencia, saldo, cliente);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Corrente"+", Agência: "+super.getAgencia()+", Numero da Conta: "+this.getNumeroConta()+"]";
	}

}

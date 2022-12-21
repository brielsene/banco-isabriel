package br.com.banco.teste;
import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.banco.cliente.modelo.*;

public class TesteConta {

	public static void main(String[] args) {
		Cliente gabriel = new Cliente("Gabriel de Sene Costa", 518701208, LocalDate.of(2002, 03, 30), "Rua Otaviano piza");
		Conta conta1 = new ContaPoupanca(125448, 1222, new BigDecimal("0.0"), gabriel);
		Cartao cartao = new Cartao(conta1, Cartoes.DEBITO);
		gabriel.atrelarConta(conta1);
		
		System.out.println(conta1);
		
		
//		System.out.println(cartao);
		
		
		
		
//		System.out.println(gabriel);

	}

}

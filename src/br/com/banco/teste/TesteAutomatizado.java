package br.com.banco.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import br.com.banco.funcionario.modelo.Escrituario;
import br.com.banco.funcionario.modelo.Funcionario;

public class TesteAutomatizado {
	
	@Test
	public void teste() {
		Funcionario gabriel = new Escrituario("Gabriel de Sene", 459883459, LocalDate.of(2002, 03, 30), "Escrituario", 3254);
		gabriel.ajustaSalario(new BigDecimal("1500.00"));
		gabriel.setDataContratacao(LocalDate.of(2021, 10, 25));
		List<Funcionario>listaFuncionario = new ArrayList<>();
		listaFuncionario.add(gabriel);
		
		assertEquals("Gabriel de Sene", gabriel.getNome() );
		
	}

}

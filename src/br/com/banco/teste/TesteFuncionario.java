package br.com.banco.teste;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.chrono.Chronology;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.banco.funcionario.modelo.Developer;
import br.com.banco.funcionario.modelo.Escrituario;
import br.com.banco.funcionario.modelo.Funcionario;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		List<Funcionario>listaFuncionario = new ArrayList<>();
		
		//Adição de novo funcionário
		Funcionario gabriel = new Escrituario("Gabriel de Sene", 459883459, LocalDate.of(2002, 03, 30), "Escrituario", 3254);
		gabriel.ajustaSalario(new BigDecimal("1500.00"));
		gabriel.setDataContratacao(LocalDate.of(2021, 10, 25));
		
		//Adição de novo funcionário
				Funcionario isadora = new Developer("Isadora Oliveira", 4636574, LocalDate.of(2003, 04, 14), "Dev Java", 3254);
				//Ajuste de salário
				isadora.ajustaSalario(new BigDecimal("3500.00"));
				isadora.setDataContratacao(LocalDate.now());
				
				//Adição de novo funcionário
				Funcionario rauena = new Developer("Rauena", 224223433, LocalDate.of(1995, 12, 15), "QA", 3254);
				//Ajuste de salário
				rauena.ajustaSalario(new BigDecimal("3500.00"));
				rauena.setDataContratacao(LocalDate.of(2020, 12, 20));
				
		
		//Lista de Funcionario
		
		listaFuncionario.add(gabriel);
		listaFuncionario.add(isadora);
		listaFuncionario.add(rauena);
		
		listaFuncionario.sort((l1, l2)->l1.getDt_nascimento().compareTo(l2.getDt_nascimento()));
		
		//Ordenar por data de contratação
		listaFuncionario.sort((l1, l2)->l1.getDataContratacao().compareTo(l2.getDataContratacao()));
		
		listaFuncionario.forEach(System.out::println);
		
		//Quantidade de funcionários pela lista, ou contador estático
		System.out.println(listaFuncionario.size());
		System.out.println(isadora.getContadorFuncionarios());
		
		//Streams
		listaFuncionario.stream().collect(Collectors.toMap(l -> l.getNome(),l ->l.getCargo())).forEach((nome, cargo)->System.out.println("[Nome: "+nome+", Cargo: "+cargo+"]"));;
		
		
		
		
		
		
	}

}

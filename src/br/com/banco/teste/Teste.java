package br.com.banco.teste;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import br.com.banco.modelo.Banco;
import br.com.banco.modelo.BancoIsabriel;

public class Teste {
	public static void main(String[] args) {
		Banco b1 = new Banco("Engenho Novo", "Rua Otaviano Piza", 3214);
		Banco b2 = new Banco("Osasco", "Rua Helena Maria", 3254);
		
		BancoIsabriel banco = new BancoIsabriel();
		banco.adicionaBanco(b1);
		banco.adicionaBanco(b2);
		
		banco.getListaDeBanco().sort((banco1, banco2)->banco1.getUnidade().compareTo(banco2.getUnidade()));
		
		banco.getListaDeBanco().sort(( ba1, ba2) -> ba1.getUnidade().compareTo(ba2.getUnidade()));
				
				
		
		
//		banco.getListaDeBanco().stream()
//		.collect(Collectors.toMap(b -> b.getNumeroAgencia(), b -> b.getUnidade())).forEach((numero, unidade)->System.out.println("Numero: "+numero+", Unidade: "+unidade));;
//		
		banco.getListaDeBanco().forEach(System.out::println);
		System.out.println(banco.getListaDeBanco());
		
//		System.out.println(banco.getListaDeBanco());
		
	}
	

}

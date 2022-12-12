package br.com.banco.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BancoIsabriel {
	List<Banco>listaDeBanco = new ArrayList<>();
	
	
	public void adicionaBanco(Banco banco) {
		this.listaDeBanco.add(banco);

	}
	
	public List<Banco> getListaDeBanco() {
		return listaDeBanco;
	}
	

	

}

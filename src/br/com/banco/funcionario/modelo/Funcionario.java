package br.com.banco.funcionario.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Funcionario {
	private String nome;
	private int cpf;
	private LocalDate dt_nascimento;
	private BigDecimal salario;
	private String cargo;
	private static int contadorFuncionarios = 0;
	private int agencia;
	private LocalDate dataContratacao;
	
	public Funcionario(String nome, int cpf, LocalDate dt_nascimento, String cargo, int agencia) {
		this.nome = nome;
		this.cpf = cpf;
		this.dt_nascimento = dt_nascimento;
		this.cargo = cargo;
		this.contadorFuncionarios += 1;
		this.agencia = agencia;
		
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public LocalDate getDt_nascimento() {
		return dt_nascimento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public BigDecimal getSalario() {
		return salario;
	}
	
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void ajustaSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	public void setDataContratacao(LocalDate dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	
	public LocalDate getDataContratacao() {
		return dataContratacao;
	}
	
	public static int getContadorFuncionarios() {
		return contadorFuncionarios;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Nome: "+this.nome+", Data de Nascimento: "+this.dt_nascimento+", Cargo: "+this.cargo+", Data de Contratação: "+this.dataContratacao+"]";
	}
	
	
	
	
	

}

package com.cast.desafio.DTO;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.lang.NonNull;

@Entity
public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	@NonNull
	private String nome;
	@NonNull
	private float salario;
	@NonNull
	@ManyToOne
	private Unidade unidade;
	
	public Pessoa() {
		
	}
	
	public Pessoa(long codigo, String nome, float salario) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.salario = salario;
	}
	
	public Pessoa(long codigo, String nome, float salario, Unidade unidade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.salario = salario;
		this.unidade = unidade;
	}
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public Unidade getUnidade() {
		return unidade;
	}
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
	@Override
	public String toString() {
		return "Pessoa [codigo=" + codigo + ", nome=" + nome + ", salario=" + salario + ", unidade=" + unidade + "]";
	}
	
	
	
	
}

package com.cast.desafio.DTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.lang.NonNull;

@Entity
public class Unidade implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	@NonNull
	private String nome;
	@OneToMany
	private List<Pessoa> pessoas;
	
	public Unidade() {
		
	}
	
	public Unidade(long codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public Unidade(long codigo, String nome, List<Pessoa> pessoas) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.pessoas = pessoas;
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

	public List<Pessoa> getPessoas() {
		if (pessoas == null) {
			pessoas = new ArrayList<Pessoa>();	
		}
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public String nomeUnidadeQtdPessoas() {
		
		return "Unidade [Nome Unidade=" + nome + ", Quantidade Pessoas=" + pessoas + "]";
	}
	
	@Override
	public String toString() {
		return "Unidade [codigo=" + codigo + ", nome=" + nome + ", pessoas=" + pessoas + "]";
	}
	
	
}

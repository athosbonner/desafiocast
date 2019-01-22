package com.cast.desafio.service;

import java.util.List;

import com.cast.desafio.DTO.Pessoa;


public interface PessoaService {
	
	List<Pessoa> listarTudo();
	Pessoa listarPorNome(String nome);
	Pessoa salvar(Pessoa pessoa);
	
}

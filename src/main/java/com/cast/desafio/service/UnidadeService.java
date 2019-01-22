package com.cast.desafio.service;

import java.util.List;

import com.cast.desafio.DTO.Unidade;

public interface UnidadeService {
	
	Unidade salvar(Unidade unidade);
	List<Unidade> listarRelatorioQtdPessoa();
	List<Unidade> listarRelatorioTotalSalario();
	
}

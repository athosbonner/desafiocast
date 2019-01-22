package com.cast.desafio.serviceImpl;

import java.util.List;

import com.cast.desafio.DTO.Unidade;
import com.cast.desafio.repository.UnidadeRepositoryImpl;
import com.cast.desafio.service.UnidadeService;

public class UnidadeServiceImpl implements UnidadeService{
	
	private UnidadeRepositoryImpl unidadeRep;
	
	@Override
	public Unidade salvar(Unidade unidade) {
		return unidadeRep.save(unidade);
	}

	@Override
	public List<Unidade> listarRelatorioQtdPessoa() {
		return unidadeRep.findAll();
	}

	@Override
	public List<Unidade> listarRelatorioTotalSalario() {
		return unidadeRep.findAll();
	}
	
}

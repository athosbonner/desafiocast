package com.cast.desafio.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cast.desafio.DTO.Pessoa;
import com.cast.desafio.repository.PessoaRepositoryImpl;
import com.cast.desafio.service.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService {

	@Autowired
	private PessoaRepositoryImpl pessoaRep;
	
	@Override
	public List<Pessoa> listarTudo() {
		return pessoaRep.findAll();
	}

	@Override
	public Pessoa listarPorNome(String nome) {
		return pessoaRep.findByNomeIn(nome);
	}

	@Override
	public Pessoa salvar(Pessoa pessoa) {
		return pessoaRep.save(pessoa);
	}
	
}

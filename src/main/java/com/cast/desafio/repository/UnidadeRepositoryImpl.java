package com.cast.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cast.desafio.DTO.Unidade;

@Repository
public interface UnidadeRepositoryImpl extends JpaRepository<Unidade, Long>{

	//trazer quantidade de pessoas atrelada a essa unidade
	public long countByPessoasIn();	
	
}

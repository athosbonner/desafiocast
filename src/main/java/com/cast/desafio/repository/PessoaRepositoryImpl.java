package com.cast.desafio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cast.desafio.DTO.Pessoa;

@Repository
public interface PessoaRepositoryImpl extends JpaRepository<Pessoa, Long> {

	@Override
	default <S extends Pessoa> S save(S entity) {
		System.out.println("salvou");
		return null;
	}

	@Override
	default List<Pessoa> findAll() {
		System.out.println("Listou");
		return null;
	}
	
	Pessoa findByNomeIn(String pessoa);
		
}

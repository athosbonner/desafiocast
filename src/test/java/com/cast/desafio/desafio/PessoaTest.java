package com.cast.desafio.desafio;

import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;

import com.cast.desafio.DTO.Pessoa;
import com.cast.desafio.DTO.Unidade;
import com.cast.desafio.service.PessoaService;

public class PessoaTest {
	
	Pessoa pessoa;
	PessoaService pessoaService;
	
	public static void main(String[] args) {
		PessoaTest testePessoa = new PessoaTest();
		testePessoa.setUp();
		
		testePessoa.testMockPessoa();
		
	}
	
	public void setUp() {
		pessoa = new Pessoa(); 
		//Criando o objeto "Mockado"
		pessoaService = EasyMock.createMock(PessoaService.class);
		
	}
	
	public boolean testMockPessoa() {
		
		List<Pessoa> listaDePessoas = new ArrayList<>();
		Pessoa pessoa1 = new Pessoa(1, "Mario", new Float(7000.00), new Unidade(1, "Alfandega"));
		Pessoa pessoa2 = new Pessoa(2, "Marcio", new Float(6000.00), new Unidade(2, "Porto"));
		Pessoa pessoa3 = new Pessoa(3, "Athos", new Float(8000.00), new Unidade(3, "Digital"));
		
		listaDePessoas.add(pessoa1);
		listaDePessoas.add(pessoa2);
	    
	    EasyMock.expect(pessoaService.listarTudo()).andReturn(listaDePessoas);
	    EasyMock.expect(pessoaService.listarPorNome("Mario")).andReturn(pessoa1);
	    EasyMock.expect(pessoaService.salvar(pessoa3)).andReturn(pessoa3);
	    
	    EasyMock.replay(pessoaService);
	    
//	    System.out.println(pessoaService.listarTudo());
//	    System.out.println(pessoaService.listarPorNome("Mario"));
	    System.out.println(pessoaService.salvar(pessoa3));
	    
		return true;
	}
}






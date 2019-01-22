package com.cast.desafio.desafio;

import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;

import com.cast.desafio.DTO.Pessoa;
import com.cast.desafio.DTO.Unidade;
import com.cast.desafio.service.UnidadeService;

public class UnidadeTest {
	private Unidade unidade;
	private UnidadeService unidadeService;
	
	public static void main(String[] args) {
		UnidadeTest unidadeTest = new UnidadeTest();
		unidadeTest.setRun();
		unidadeTest.testMockUnidade();
	}
	
	public void setRun() {
		unidade = new Unidade();
		unidadeService = EasyMock.createMock(UnidadeService.class);
	}
	
	public boolean testMockUnidade() {
		Pessoa pessoa1 = new Pessoa(1, "Mario", new Float(7000.00));
		Pessoa pessoa2 = new Pessoa(2, "Marcio", new Float(6000.00));
		Pessoa pessoa3 = new Pessoa(3, "Athos", new Float(8000.00));
		
		List<Pessoa> listaDePessoasAlfandega = getListaPessoaAlfandega(pessoa1, pessoa2, pessoa3);
		List<Pessoa> listaDePessoasPortoDigital = getListaPessoaPortoDigital(pessoa1, pessoa2, pessoa3);
		List<Pessoa> listaDePessoasArmazem = getPessoaListaArmazem(pessoa1, pessoa2, pessoa3);
		
		List<Unidade> listaDeUnidadeAlfandega = new ArrayList<Unidade>();
		List<Unidade> listaDeUnidadePortoDigital = new ArrayList<Unidade>();
		
		Unidade unidadeAlfandega = new Unidade(1, "Alfandega", listaDePessoasAlfandega);
		Unidade unidadePortoDigital = new Unidade(2, "Porto", listaDePessoasPortoDigital);
		Unidade novaUnidadeArmazem = new Unidade(4, "Armazem", listaDePessoasArmazem);
		
		listaDeUnidadeAlfandega.add(unidadeAlfandega);
		listaDeUnidadePortoDigital.add(unidadePortoDigital);
		
		EasyMock.expect(unidadeService.listarRelatorioQtdPessoa()).andReturn(listaDeUnidadeAlfandega);
		EasyMock.expect(unidadeService.listarRelatorioTotalSalario()).andReturn(listaDeUnidadePortoDigital);
		EasyMock.expect(unidadeService.salvar(novaUnidadeArmazem)).andReturn(novaUnidadeArmazem);
		
		EasyMock.replay(unidadeService);
		
//		System.out.println(unidadeService.salvar(novaUnidadeArmazem));
//		System.out.println(unidadeService.listarRelatorioQtdPessoa());
		System.out.println(unidadeService.listarRelatorioTotalSalario());
		
		return true;
	}

	private List<Pessoa> getPessoaListaArmazem(Pessoa pessoa1, Pessoa pessoa2, Pessoa pessoa3) {
		List<Pessoa> listaDePessoas4 = new ArrayList<Pessoa>();
		listaDePessoas4.add(pessoa1);
		listaDePessoas4.add(pessoa2);
		listaDePessoas4.add(pessoa3);
		return listaDePessoas4;
	}

	private List<Pessoa> getListaPessoaPortoDigital(Pessoa pessoa1, Pessoa pessoa2, Pessoa pessoa3) {
		List<Pessoa> listaDePessoas2 = new ArrayList<Pessoa>();
		listaDePessoas2.add(pessoa1);
		listaDePessoas2.add(pessoa2);
		listaDePessoas2.add(pessoa3);
		return listaDePessoas2;
	}

	private List<Pessoa> getListaPessoaAlfandega(Pessoa pessoa1, Pessoa pessoa2, Pessoa pessoa3) {
		List<Pessoa> listaDePessoas1 = new ArrayList<Pessoa>();
		listaDePessoas1.add(pessoa1);
		listaDePessoas1.add(pessoa2);
		listaDePessoas1.add(pessoa3);
		return listaDePessoas1;
	}
	
	
}

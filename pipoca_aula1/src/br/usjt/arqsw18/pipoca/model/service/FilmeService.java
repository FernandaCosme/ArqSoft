package br.usjt.arqsw18.pipoca.model.service;

import java.io.IOException;
import java.util.List;

import br.usjt.arqsw18.pipoca.model.entity.Filme;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class FilmeService {
	@PersistenceContext
	EntityManager manager;
	
	public int inserirFilme(Filme filme) {
		System.out.println(Filme.toString());
		manager.persist(filme);
		return filme.getId();
	}
	public List<Filme> listarFiilme() throws IOException{
		return manager.createQuery("select filme from tb_filme filme").getResultList();
	}
	

}

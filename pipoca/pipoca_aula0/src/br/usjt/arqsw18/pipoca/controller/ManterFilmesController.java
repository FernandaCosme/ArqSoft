package br.usjt.arqsw18.pipoca.controller;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.usjt.arqsw18.pipoca.model.entity.Filme;
import br.usjt.arqsw18.pipoca.model.service.FilmeService;

@Controller
public class ManterFilmesController {
	private FilmeService filmeService;
	
	public ManterFilmesController() {
		filmeService = new FilmeService();
	}
	
	@RequestMapping("/novo")
	public String novoFilme(){
		return "NovoFilme";
	}
	
	@RequestMapping("/inserir")
	public String inserirFilme(Filme filme, Model model) {
		int id = filmeService.inserirFilme(filme);
		filme.setId(id);
		model.addAttribute("filme", filme);
		return "Resultado";
	}

	@RequestMapping("/listar_filmes")
	public String listarFuncionarios(Filme filme, Model model) {
		try {
			
			List<Filme> lista;
			lista = filmeService.listarFiilme();
			
			filme.setAttribute("lista", lista);
			return "Filmes";
			
		} catch (IOException e) {
			e.printStackTrace();
			model.addAttribute("erro", e);
			return "Erro";
		}		
	}
}

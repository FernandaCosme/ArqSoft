package br.usjt.arqsw18.pipoca.model.entity;

import java.util.Date;

public class Filme {
	private int id;
	private String nome;
	private String diretor;
	private String descricao;
	private Genero genero;
	private Date dataLancamento;
	private String posterPath;
	private int popularidade;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public Date getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public String getPosterPath() {
		return posterPath;
	}
	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}
	public int getPopularidade() {
		return popularidade;
	}
	public void setPopularidade(int popularidade) {
		this.popularidade = popularidade;
	}
	public String toString() {
		return "Filme [id=" + id + ", nome=" + nome + ", diretor=" + diretor + ", descricao=" + descricao + ", genero="
				+ genero + ", dataLancamento=" + dataLancamento + ", posterPath=" + posterPath + ", popularidade="
				+ popularidade + "]";
	}
	
	

}

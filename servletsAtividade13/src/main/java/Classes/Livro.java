package main.java.Classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Livro implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String tituloLivro;
	private List<String> nomeAutor = new ArrayList<String>();
	private Integer dataPublicacao;
	public Livro(){};
	public Livro(String tituloLivro, String nomeAutor, Integer dataPublicacao){
		super();
		this.tituloLivro = tituloLivro;
		this.nomeAutor.add(nomeAutor);
		this.dataPublicacao = dataPublicacao;
	}
	
	public List<String> getNomeAutor() {
		return nomeAutor;
	}
	public void setNomeAutor(String nomeAutor) {
		 this.nomeAutor.add(nomeAutor);
	}
	public String getTituloLivro() {
		return tituloLivro;
	}
	public void setTituloLivro(String tituloLivro) {
		this.tituloLivro = tituloLivro;
	}
	public Integer getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(Integer dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	@Override
	public String toString() {
		return "Autor: " + nomeAutor +"<br>Título: " + tituloLivro  + " <br>Data de Publicação: " + dataPublicacao;
	}
}
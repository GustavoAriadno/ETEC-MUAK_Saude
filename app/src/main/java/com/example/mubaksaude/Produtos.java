package com.example.mubaksaude;

public class Produtos {

	private int imagem;
	private String nome;
	private String endereco;

	public Produtos(String nome, String endereco, int imagem){
		this.nome = nome;
		this.imagem = imagem;
		this.endereco = endereco;

	}

	public String getNome() { return this.nome; }
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getImagem() { return this.imagem; }
	public void setImagem(int imagem) {
		this.imagem = imagem;
	}

	public String getEndereco() { return this.endereco;	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}

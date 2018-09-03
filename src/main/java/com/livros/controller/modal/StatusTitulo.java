package com.livros.controller.modal;

public enum StatusTitulo {
	
	EMPRESTIMO ("Emprestimo"),
	CANCELADO ("Cancelado"),
	RECEBIDO ("Recebido");
	
private String nome;
	
	StatusTitulo(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
}
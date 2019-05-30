package br.com.fiap.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {

	@Id
	private int id;
	private String nome;

	public Produto() {

	}

	public Produto(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Produto (id: " + id + ", nome: " + nome + ")";
	}

}

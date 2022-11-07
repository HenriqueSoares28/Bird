package com.web.bird.SpringWeb.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "usuarios")

public class Administrador 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column (name= "id")
	private int id;
	
	@Column(name = "nome_completo", length = 255, nullable = false)
	private String nome_completo;
	
	@Column(name= "email", length = 255, nullable = false)
	private String email;

	@Column(name="cpf", length = 12, nullable = false)
	private String cpf;

	@Column(name="cep", length = 9, nullable = false)
	private String cep;

	@Column(name="endereco", length = 200, nullable = false)
	private String endereco;

	@Column(name="num_casa", nullable = false)
	private int num_casa;

	@Column(name="complemento", length = 200, nullable = true)
	private String complemento;

	@Column(name= "senha", length = 20, nullable = false)
	private String senha;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome_completo() {
		return nome_completo;
	}

	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNum_casa() {
		return num_casa;
	}

	public void setNum_casa(int num_casa) {
		this.num_casa = num_casa;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}

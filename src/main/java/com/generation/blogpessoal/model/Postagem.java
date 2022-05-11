package com.generation.blogpessoal.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // Entidade = tabela banco de dados
@Table(name = "tb_postagens") 

public class Postagem {
	
	@Id // Primary key - chave primaria da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // GeneratedValue = chave sera gerada automaticamente pelo banco de dados, strategy = como PK sera gerada, GenerationType.IDENTITY = autoincrement
 	private Long id;
	
	@NotBlank(message = "O atributo titulo é obrigatório!") // Atributo nao pode ser nulo e nao pode ser em branco
	@Size(min = 5, max = 100, message = "O atributo titulo deve conter no minimo 5 e no maximo 100 caracteres!") 
	private String titulo ;
	
	@NotNull(message = "O atributo texto é obrigatório!") // Atributo nao pode ser nulo
	@Size(min = 10, max = 1000, message = "O atributo texto deve conter no minimo 10 e no maximo 1000 caracteres!") 
	private String texto;
	
	@UpdateTimestamp // Ira receber data e hora do sistema
	private LocalDateTime data;
	
	@ManyToOne // Classe Postagem tera um relacionamento muitos para um com a classe Tema
	@JsonIgnoreProperties("postagem") // Quebra a recursividade (loop) durante a execucao JSON
	private Tema tema; // Tambem criar gets and sets
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}	
}
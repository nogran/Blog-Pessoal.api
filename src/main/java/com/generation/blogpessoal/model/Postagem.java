package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tb_postagens")

public class Postagem {
	
	@Id //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
 	private Long id;
	
	@NotBlank(message = "O atributo titulo e obrigatorio!")
	@Size(min = 5, max = 100, message = "O atributo titulo deve conter no minimo 5 e no maximo 100 caracteres!") 
	private String titulo ;
	
	@NotNull(message = "O atributo texto e obrigatorio!")
	@Size(min = 10, max = 1000, message = "O atributo texto deve conter no minimo 10 e no maximo 1000 caracteres!") 
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime data;

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
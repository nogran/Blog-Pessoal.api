package com.generation.blogpessoal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_temas")
public class Tema{
    
    @Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo Descrição é obrigatório e não pode conter espaços em branco")
	private String descricao;
	
	@OneToMany(mappedBy = "tema", cascade = CascadeType.REMOVE) // @OneToMany(mappedBy(FK) = "tema", cascade = CascadeType.ALL): indica que a Classe Tema terá um relacionamento do tipo One To Many (Um para Muitos) com a Classe Postagem 
	@JsonIgnoreProperties("tema") // .Remove = acao apagar um Objeto da Classe Tema sera todos os associados ao tema apagado
	private List<Postagem> postagem; // Listar todos as postagens associadas com os respectivos temas
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 *  Métodos Get e Set para a Collection postagem
	 */
	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}
	
}
package upe.br.verdinhas.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Verdinha {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;			//Nome proprio da planta
	private Integer qntPlantas;		//Quantidade de plantas
	private String categoria;       //As plantas possuem as categorias: briófitas, pteridófitas, gimnospermas ou angiospermas.
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQntPlantas() {
		return qntPlantas;
	}

	public void setQntPlantas(Integer qntPlantas) {
		this.qntPlantas = qntPlantas;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}

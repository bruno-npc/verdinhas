package upe.br.verdinhas.dao;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Verdinha {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "id_verdinha")
	private Long id;
	
	
	@ManyToOne
	@JoinColumn (name = "id_usuario")
	private Usuario usuario;
	
	
	
	
	
	private String nomePlanta;			
	private Integer qntPlantas;		
	private String categoria;       //As plantas possuem as categorias: briófitas, pteridófitas, gimnospermas ou angiospermas.
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomePlanta() {
		return nomePlanta;
	}

	public void setNomePlanta(String nomePlanta) {
		this.nomePlanta = nomePlanta;
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



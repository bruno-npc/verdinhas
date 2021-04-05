package upe.br.verdinhas.catalogo.modelos;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.hibernate.mapping.List;


@Entity
public class Verdinha {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "id_verdinha")
	private Long id;
	
	
	private String nome;				
	private String especie;    
	private String genero;
	
	@Column(name = "nome_popular")
	private String nomePopular;
	
	@Transient
	private LocalDate dataAquisicao = LocalDate.now();
	private boolean visivel;
	private byte[] fotos;
	
	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "id_necessidades")
	private Necessidades necessidades;
	
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "id_local")
	private Local local;
	
	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "id_caracteristicas")
	private Caracteristicas caracteristicas;
	
	
	public Necessidades getNecessidades() {
		return necessidades;
	}
	public void setNecessidades(Necessidades necessidades) {
		this.necessidades = necessidades;
	}
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
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getNomePopular() {
		return nomePopular;
	}
	public void setNomePopular(String nomePopular) {
		this.nomePopular = nomePopular;
	}
	public LocalDate getDataAquisicao() {
		return dataAquisicao;
	}
	public void setDataAquisicao(LocalDate dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}
	
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public boolean isVisivel() {
		return visivel;
	}
	public void setVisivel(boolean visivel) {
		this.visivel = visivel;
	}

	public Caracteristicas getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(Caracteristicas caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	public byte[] getFotos() {
		return fotos;
	}
	public void setFotos(byte[] fotos) {
		this.fotos = fotos;
	}

	
}



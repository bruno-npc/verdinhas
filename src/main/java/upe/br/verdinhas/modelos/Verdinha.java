package upe.br.verdinhas.modelos;

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

import org.hibernate.mapping.List;


@Entity
public class Verdinha {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "id_verdinha")
	private Long id;
	
	
	@OneToOne
	@JoinColumn (name = "id_caracteristicas")
	
	@OneToMany (mappedBy = "id_necessidades")
	private List necessidades;
	
	@OneToOne
	@JoinColumn (name = "id_local")
	
	
	private String nome;				
	private String especie;    
	private String genero;
	private String nomePopular;
	private LocalDate dataAquisicao = LocalDate.now();
	private Integer qntPlantas;	
	private String local;
	private boolean visivel;
	private String caracteristicas;
	private ArrayList<byte[]> fotos = new ArrayList<byte[]>();
	
	
	
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
	public Integer getQntPlantas() {
		return qntPlantas;
	}
	public void setQntPlantas(Integer qntPlantas) {
		this.qntPlantas = qntPlantas;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public boolean isVisivel() {
		return visivel;
	}
	public void setVisivel(boolean visivel) {
		this.visivel = visivel;
	}
	public String getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	public ArrayList<byte[]> getFotos() {
		return fotos;
	}
	public void setFotos(ArrayList<byte[]> fotos) {
		this.fotos = fotos;
	}
	
}



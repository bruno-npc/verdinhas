package upe.br.verdinhas.insumos.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import upe.br.verdinhas.manutencao.modelo.Manutencao;

@Entity
public class Adubo {

	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "id_adubo")
	private Long id;
	
	
	private String nome;
	private String composicao;
	private byte[] fotos;
	private Integer quantidade;
	private String observacao;

	@OneToMany (mappedBy = "adubacao")
	private List<Manutencao> manutencoes;
	
	
	@Transient
	private String tipo;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public byte[] getFotos() {
		return fotos;
	}
	public void setFotos(byte[] fotos) {
		this.fotos = fotos;
	}
	public List<Manutencao> getManutencoes() {
		return manutencoes;
	}
	public void setManutencoes(List<Manutencao> manutencoes) {
		this.manutencoes = manutencoes;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getComposicao() {
		return composicao;
	}
	public void setComposicao(String composicao) {
		this.composicao = composicao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
	
}

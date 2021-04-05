package upe.br.verdinhas.modelos;

import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Local {

	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "id_local")
	private Long id;
	
	
	@OneToOne(mappedBy = "id_verdinha")
	
	
	
	LocalDateTime dataInclusao = LocalDateTime.now();
	LocalDateTime dataUltimaAlteracao = LocalDateTime.now();
	
	private String nome;
	private String descricao;
	private boolean cobertura;
	private String umidade;
	private String incidenciaSolar;
	private String exposicaoSolar;
	private String vento;
	private ArrayList<byte[]> fotos = new ArrayList<byte[]>();
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getDataInclusao() {
		return dataInclusao;
	}
	public void setDataInclusao(LocalDateTime dataInclusao) {
		this.dataInclusao = dataInclusao;
	}
	public LocalDateTime getDataUltimaAlteracao() {
		return dataUltimaAlteracao;
	}
	public void setDataUltimaAlteracao(LocalDateTime dataUltimaAlteracao) {
		this.dataUltimaAlteracao = dataUltimaAlteracao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isCobertura() {
		return cobertura;
	}
	public void setCobertura(boolean cobertura) {
		this.cobertura = cobertura;
	}
	public String getUmidade() {
		return umidade;
	}
	public void setUmidade(String umidade) {
		this.umidade = umidade;
	}
	public String getIncidenciaSolar() {
		return incidenciaSolar;
	}
	public void setIncidenciaSolar(String incidenciaSolar) {
		this.incidenciaSolar = incidenciaSolar;
	}
	public String getExposicaoSolar() {
		return exposicaoSolar;
	}
	public void setExposicaoSolar(String exposicaoSolar) {
		this.exposicaoSolar = exposicaoSolar;
	}
	public String getVento() {
		return vento;
	}
	public void setVento(String vento) {
		this.vento = vento;
	}
	public ArrayList<byte[]> getFotos() {
		return fotos;
	}
	public void setFotos(ArrayList<byte[]> fotos) {
		this.fotos = fotos;
	}
	
	
	
}

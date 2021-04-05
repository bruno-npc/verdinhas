package upe.br.verdinhas.modelos;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ocorrencia {

	
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "id_ocorrencia")
	private Long id;
	
	
	@OneToMany
	
	
	
	
	LocalDateTime dataInclusao = LocalDateTime.now();
	LocalDateTime dataUltimaAlteracao = LocalDateTime.now();
	
	private String tipo;
	private String floracao;
	private String frutificacao;
	private String enraizamento;
	private String brotacao;
	private String observacao;
	
	
	
	
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFloracao() {
		return floracao;
	}
	public void setFloracao(String floracao) {
		this.floracao = floracao;
	}
	public String getFrutificacao() {
		return frutificacao;
	}
	public void setFrutificacao(String frutificacao) {
		this.frutificacao = frutificacao;
	}
	public String getEnraizamento() {
		return enraizamento;
	}
	public void setEnraizamento(String enraizamento) {
		this.enraizamento = enraizamento;
	}
	public String getBrotacao() {
		return brotacao;
	}
	public void setBrotacao(String brotacao) {
		this.brotacao = brotacao;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
}

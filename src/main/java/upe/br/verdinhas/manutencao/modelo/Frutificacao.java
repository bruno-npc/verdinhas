package upe.br.verdinhas.manutencao.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Frutificacao {

	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "id_frutificacao")
	private Long id;
	

	private LocalDate data;
	private String observacao;
	private byte[] fotos;
	
	
	@OneToOne(mappedBy = "frutificacao")
	private Ocorrencia ocorrencia;
	
	private String intensidade;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getIntensidade() {
		return intensidade;
	}
	public void setIntensidade(String intensidade) {
		this.intensidade = intensidade;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public byte[] getFotos() {
		return fotos;
	}
	public void setFotos(byte[] fotos) {
		this.fotos = fotos;
	}
	public Ocorrencia getOcorrencia() {
		return ocorrencia;
	}
	public void setOcorrencia(Ocorrencia ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

}

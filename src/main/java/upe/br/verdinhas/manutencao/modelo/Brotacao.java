package upe.br.verdinhas.manutencao.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Brotacao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_brotacao")
	private Long id;

	private String observacao;
	private byte[] fotos;

	@OneToOne(mappedBy = "brotacao")
	private Ocorrencia ocorrencia;

	@Enumerated(EnumType.STRING)
	private TipoBrotacao tipo;

	@Enumerated(EnumType.STRING)
	private TipoIntensidade intensidade;

	public Ocorrencia getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(Ocorrencia ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoBrotacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoBrotacao tipo) {
		this.tipo = tipo;
	}

	public TipoIntensidade getIntensidade() {
		return intensidade;
	}

	public void setIntensidade(TipoIntensidade intensidade) {
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

}

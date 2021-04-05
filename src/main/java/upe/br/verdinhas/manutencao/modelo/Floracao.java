package upe.br.verdinhas.manutencao.modelo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Floracao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_Floracao")
	private Long id;

	private LocalDate data;
	private boolean haste;
	private String obsercao;
	private byte[] fotos;

	@OneToOne(mappedBy = "floracao")
	private Ocorrencia ocorrencia;

	@Transient
	private String intensidade;

	public Ocorrencia getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(Ocorrencia ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public void setFotos(byte[] fotos) {
		this.fotos = fotos;
	}

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

	public boolean isHaste() {
		return haste;
	}

	public void setHaste(boolean haste) {
		this.haste = haste;
	}

	public String getObsercao() {
		return obsercao;
	}

	public void setObsercao(String obsercao) {
		this.obsercao = obsercao;
	}

}

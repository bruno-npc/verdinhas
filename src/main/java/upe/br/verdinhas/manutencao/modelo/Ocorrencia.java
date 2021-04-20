package upe.br.verdinhas.manutencao.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Ocorrencia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_ocorrencia")
	private Long id;

	private String observacao;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_patologia")
	private Patologia patologias;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_floracao", referencedColumnName = "id_floracao")
	private Floracao floracao;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_frutificacao", referencedColumnName = "id_frutificacao")
	private Frutificacao frutificacao;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_enraizamento", referencedColumnName = "id_enraizamento")
	private Enraizamento enraizamento;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_brotacao", referencedColumnName = "id_brotacao")
	private Brotacao brotacao;

	@Enumerated(EnumType.STRING)
	private TipoOcorrencia tipo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoOcorrencia getTipo() {
		return tipo;
	}

	public void setTipo(TipoOcorrencia tipo) {
		this.tipo = tipo;
	}

	public Floracao getFloracao() {
		return floracao;
	}

	public void setFloracao(Floracao floracao) {
		this.floracao = floracao;
	}

	public Frutificacao getFrutificacao() {
		return frutificacao;
	}

	public void setFrutificacao(Frutificacao frutificacao) {
		this.frutificacao = frutificacao;
	}

	public Enraizamento getEnraizamento() {
		return enraizamento;
	}

	public void setEnraizamento(Enraizamento enraizamento) {
		this.enraizamento = enraizamento;
	}

	public Patologia getPatologias() {
		return patologias;
	}

	public void setPatologias(Patologia patologias) {
		this.patologias = patologias;
	}

	public Brotacao getBrotacao() {
		return brotacao;
	}

	public void setBrotacao(Brotacao brotacao) {
		this.brotacao = brotacao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}

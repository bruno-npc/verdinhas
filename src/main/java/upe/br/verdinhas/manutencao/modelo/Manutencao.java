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
import javax.persistence.Transient;

import upe.br.verdinhas.insumos.modelo.Adubo;
import upe.br.verdinhas.insumos.modelo.Substrato;
import upe.br.verdinhas.insumos.modelo.Tratamento;
import upe.br.verdinhas.insumos.modelo.Vaso;

@Entity
public class Manutencao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_manutencao")
	private Long id;

	private String observacao;
	private byte[] fotos;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_adubacao")
	private Adubo adubacao;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_tratamento")
	private Tratamento tratamento;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_substrato")
	private Substrato substrato;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_vaso")
	private Vaso vaso;

	@Transient
	private String poda;

	@Enumerated(EnumType.STRING)
	private TipoManutencao tipoManutencao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoManutencao getTipoManutencao() {
		return tipoManutencao;
	}

	public void setTipoManutencao(TipoManutencao tipoManutencao) {
		this.tipoManutencao = tipoManutencao;
	}

	public String getPoda() {
		return poda;
	}

	public void setPoda(String poda) {
		this.poda = poda;
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

	public Adubo getAdubacao() {
		return adubacao;
	}

	public void setAdubacao(Adubo adubacao) {
		this.adubacao = adubacao;
	}

	public Tratamento getTratamento() {
		return tratamento;
	}

	public void setTratamento(Tratamento tratamento) {
		this.tratamento = tratamento;
	}

	public Substrato getSubstrato() {
		return substrato;
	}

	public void setSubstrato(Substrato substrato) {
		this.substrato = substrato;
	}

	public Vaso getVaso() {
		return vaso;
	}

	public void setVaso(Vaso vaso) {
		this.vaso = vaso;
	}

}

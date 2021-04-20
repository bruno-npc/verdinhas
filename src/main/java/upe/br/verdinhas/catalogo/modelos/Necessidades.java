package upe.br.verdinhas.catalogo.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Necessidades {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_necessidades")
	private Long id;

	@OneToOne(mappedBy = "necessidades")
	private Verdinha verdinha;

	@Enumerated(EnumType.STRING)
	private TipoRega rega;

	@Enumerated(EnumType.STRING)
	private TipoIncidenciaSolar incidenciaSolar;

	@Enumerated(EnumType.STRING)
	private TipoExposicaoSolar exposicaoSolar;

	@Enumerated(EnumType.STRING)
	private TipoFrequencia frequenciaRega;

	@Enumerated(EnumType.STRING)
	private TipoVento tipoVento;

	@Enumerated(EnumType.STRING)
	private TipoVaso vaso;

	@Enumerated(EnumType.STRING)
	private TipoPodaLimpeza podaLimpeza;

	@Enumerated(EnumType.STRING)
	private TipoFrequencia frequenciaPoda;

	public Verdinha getVerdinha() {
		return verdinha;
	}

	public void setVerdinha(Verdinha verdinha) {
		this.verdinha = verdinha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoRega getRega() {
		return rega;
	}

	public void setRega(TipoRega rega) {
		this.rega = rega;
	}

	public TipoIncidenciaSolar getIncidenciaSolar() {
		return incidenciaSolar;
	}

	public void setIncidenciaSolar(TipoIncidenciaSolar incidenciaSolar) {
		this.incidenciaSolar = incidenciaSolar;
	}

	public TipoExposicaoSolar getExposicaoSolar() {
		return exposicaoSolar;
	}

	public void setExposicaoSolar(TipoExposicaoSolar exposicaoSolar) {
		this.exposicaoSolar = exposicaoSolar;
	}

	public TipoFrequencia getFrequenciaRega() {
		return frequenciaRega;
	}

	public void setFrequenciaRega(TipoFrequencia frequenciaRega) {
		this.frequenciaRega = frequenciaRega;
	}

	public TipoVento getTipoVento() {
		return tipoVento;
	}

	public void setTipoVento(TipoVento tipoVento) {
		this.tipoVento = tipoVento;
	}

	public TipoVaso getVaso() {
		return vaso;
	}

	public void setVaso(TipoVaso vaso) {
		this.vaso = vaso;
	}

	public TipoPodaLimpeza getPodaLimpeza() {
		return podaLimpeza;
	}

	public void setPodaLimpeza(TipoPodaLimpeza podaLimpeza) {
		this.podaLimpeza = podaLimpeza;
	}

	public TipoFrequencia getFrequenciaPoda() {
		return frequenciaPoda;
	}

	public void setFrequenciaPoda(TipoFrequencia frequenciaPoda) {
		this.frequenciaPoda = frequenciaPoda;
	}

}

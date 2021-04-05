package upe.br.verdinhas.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Necessidades {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "id_necessidades")
	private Long id;
	
	
	@OneToOne(mappedBy = "id_verdinha")
	
	
	private String incidenciaSolar;
	private String exposicaoSolar;
	private String rega;
	private String frequenciaRega;
	private String tipoVento;
	private String vaso;
	private String podaLimpeza;
	private String frequenciaPoda;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getRega() {
		return rega;
	}
	public void setRega(String rega) {
		this.rega = rega;
	}
	public String getFrequenciaRega() {
		return frequenciaRega;
	}
	public void setFrequenciaRega(String frequenciaRega) {
		this.frequenciaRega = frequenciaRega;
	}
	public String getTipoVento() {
		return tipoVento;
	}
	public void setTipoVento(String tipoVento) {
		this.tipoVento = tipoVento;
	}
	public String getVaso() {
		return vaso;
	}
	public void setVaso(String vaso) {
		this.vaso = vaso;
	}
	public String getPodaLimpeza() {
		return podaLimpeza;
	}
	public void setPodaLimpeza(String podaLimpeza) {
		this.podaLimpeza = podaLimpeza;
	}
	public String getFrequenciaPoda() {
		return frequenciaPoda;
	}
	public void setFrequenciaPoda(String frequenciaPoda) {
		this.frequenciaPoda = frequenciaPoda;
	}
	
}

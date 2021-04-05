package upe.br.verdinhas.modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Manutencao {

	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "id_manutencao")
	private Long id;
	
	
	
	@OneToMany
	
	
	
	LocalDateTime dataInclusao = LocalDateTime.now();
	LocalDateTime dataUltimaAlteracao = LocalDateTime.now();
	
	private LocalDate data = LocalDate.now();
	private String tipoManutencao;
	private String poda;
	private String adubacao;
	private String tratamento;
	private String substrato;
	private String vaso;
	private String observacao;
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
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getTipoManutencao() {
		return tipoManutencao;
	}
	public void setTipoManutencao(String tipoManutencao) {
		this.tipoManutencao = tipoManutencao;
	}
	public String getPoda() {
		return poda;
	}
	public void setPoda(String poda) {
		this.poda = poda;
	}
	public String getAdubacao() {
		return adubacao;
	}
	public void setAdubacao(String adubacao) {
		this.adubacao = adubacao;
	}
	public String getTratamento() {
		return tratamento;
	}
	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}
	public String getSubstrato() {
		return substrato;
	}
	public void setSubstrato(String substrato) {
		this.substrato = substrato;
	}
	public String getVaso() {
		return vaso;
	}
	public void setVaso(String vaso) {
		this.vaso = vaso;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public ArrayList<byte[]> getFotos() {
		return fotos;
	}
	public void setFotos(ArrayList<byte[]> fotos) {
		this.fotos = fotos;
	}

	
	
}

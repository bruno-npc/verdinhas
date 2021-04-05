package upe.br.verdinhas.modelos;

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
	
	
	@OneToOne(mappedBy = "id_ocorrencia")
	
	
	
	
	LocalDateTime dataInclusao = LocalDateTime.now();
	LocalDateTime dataUltimaAlteracao = LocalDateTime.now();
	
	private LocalDate data = LocalDate.now();
	private String intensidade;
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
	public ArrayList<byte[]> getFotos() {
		return fotos;
	}
	public void setFotos(ArrayList<byte[]> fotos) {
		this.fotos = fotos;
	}


}

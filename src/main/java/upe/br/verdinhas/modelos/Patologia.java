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
public class Patologia {

	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "id_patologia")
	private Long id;
	
	
	
	@OneToOne(mappedBy = "id_ocorrencia")
	
	
	
	
	
	LocalDateTime dataInclusao = LocalDateTime.now();
	LocalDateTime dataUltimaAlteracao = LocalDateTime.now();
	
	private LocalDate data = LocalDate.now();
	private String intensidade;
	private String tipo;
	private String observacao;
	private String aparenciaFolhagem;
	private String aparenciaRaizes;
	private String aparenciaFrutos;
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getAparenciaFolhagem() {
		return aparenciaFolhagem;
	}
	public void setAparenciaFolhagem(String aparenciaFolhagem) {
		this.aparenciaFolhagem = aparenciaFolhagem;
	}
	public String getAparenciaRaizes() {
		return aparenciaRaizes;
	}
	public void setAparenciaRaizes(String aparenciaRaizes) {
		this.aparenciaRaizes = aparenciaRaizes;
	}
	public String getAparenciaFrutos() {
		return aparenciaFrutos;
	}
	public void setAparenciaFrutos(String aparenciaFrutos) {
		this.aparenciaFrutos = aparenciaFrutos;
	}
	public ArrayList<byte[]> getFotos() {
		return fotos;
	}
	public void setFotos(ArrayList<byte[]> fotos) {
		this.fotos = fotos;
	}

}

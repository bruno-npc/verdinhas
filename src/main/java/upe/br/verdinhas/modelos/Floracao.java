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
public class Floracao {

	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "id_Floracao")
	private Long id;
	
	
	
	@OneToOne(mappedBy = "id_ocorrencia")
	
	
	
	LocalDateTime dataInclusao = LocalDateTime.now();
	LocalDateTime dataUltimaAlteracao = LocalDateTime.now();
	
	private LocalDate data = LocalDate.now();
	private String intensidade;
	private boolean haste;
	private String obsercao;
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
	public ArrayList<byte[]> getFotos() {
		return fotos;
	}
	public void setFotos(ArrayList<byte[]> fotos) {
		this.fotos = fotos;
	}
	
}

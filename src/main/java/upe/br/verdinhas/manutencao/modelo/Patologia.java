package upe.br.verdinhas.manutencao.modelo;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Patologia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_patologia")
	private Long id;

	private LocalDate data;
	private String observacao;
	private String aparenciaFolhagem;
	private String aparenciaRaizes;
	private String aparenciaFrutos;
	private byte[] fotos;

	@OneToMany (mappedBy = "patologias")
	private List<Ocorrencia> ocorrencias;

	private String intensidade;
	private String tipo;

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

	public byte[] getFotos() {
		return fotos;
	}

	public void setFotos(byte[] fotos) {
		this.fotos = fotos;
	}

	public List<Ocorrencia> getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(List<Ocorrencia> ocorrencias) {
		this.ocorrencias = ocorrencias;
	}


}

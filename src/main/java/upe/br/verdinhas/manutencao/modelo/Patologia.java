package upe.br.verdinhas.manutencao.modelo;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Patologia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_patologia")
	private Long id;

	private LocalDate data;
	private String observacao;
	private byte[] fotos;

	@OneToMany(mappedBy = "patologias")
	private List<Ocorrencia> ocorrencias;

	@Enumerated(EnumType.STRING)
	private TipoPatologia intensidade;

	@Enumerated(EnumType.STRING)
	private TipoPatologia tipo;

	@Enumerated(EnumType.STRING)
	private TipoAparencia aparenciaFolhagem;

	@Enumerated(EnumType.STRING)
	private TipoAparencia aparenciaRaizes;

	@Enumerated(EnumType.STRING)
	private TipoAparencia aparenciaFrutos;

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

	public TipoPatologia getIntensidade() {
		return intensidade;
	}

	public void setIntensidade(TipoPatologia intensidade) {
		this.intensidade = intensidade;
	}

	public TipoPatologia getTipo() {
		return tipo;
	}

	public void setTipo(TipoPatologia tipo) {
		this.tipo = tipo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public TipoAparencia getAparenciaFolhagem() {
		return aparenciaFolhagem;
	}

	public void setAparenciaFolhagem(TipoAparencia aparenciaFolhagem) {
		this.aparenciaFolhagem = aparenciaFolhagem;
	}

	public TipoAparencia getAparenciaRaizes() {
		return aparenciaRaizes;
	}

	public void setAparenciaRaizes(TipoAparencia aparenciaRaizes) {
		this.aparenciaRaizes = aparenciaRaizes;
	}

	public TipoAparencia getAparenciaFrutos() {
		return aparenciaFrutos;
	}

	public void setAparenciaFrutos(TipoAparencia aparenciaFrutos) {
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

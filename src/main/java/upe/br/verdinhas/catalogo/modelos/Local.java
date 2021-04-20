package upe.br.verdinhas.catalogo.modelos;

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
public class Local {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_local")
	private Long id;

	private String nome;
	private String descricao;
	private boolean cobertura;
	private String umidade;

	private byte[] fotos;

	@OneToMany(mappedBy = "local")
	private List<Verdinha> verdinhas;

	@Enumerated(EnumType.STRING)
	private TipoIncidenciaSolar incidenciaSolar;

	@Enumerated(EnumType.STRING)
	private TipoExposicaoSolar exposicaoSolar;

	@Enumerated(EnumType.STRING)
	private TipoVento vento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isCobertura() {
		return cobertura;
	}

	public void setCobertura(boolean cobertura) {
		this.cobertura = cobertura;
	}

	public String getUmidade() {
		return umidade;
	}

	public void setUmidade(String umidade) {
		this.umidade = umidade;
	}

	public List<Verdinha> getVerdinhas() {
		return verdinhas;
	}

	public void setVerdinhas(List<Verdinha> verdinhas) {
		this.verdinhas = verdinhas;
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

	public TipoVento getVento() {
		return vento;
	}

	public void setVento(TipoVento vento) {
		this.vento = vento;
	}

	public byte[] getFotos() {
		return fotos;
	}

	public void setFotos(byte[] fotos) {
		this.fotos = fotos;
	}

}

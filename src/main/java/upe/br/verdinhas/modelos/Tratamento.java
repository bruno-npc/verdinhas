package upe.br.verdinhas.modelos;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class Tratamento {

	
	private String nome;
	private String composicao;
	private String tipoPatologia;
	private ArrayList<byte[]> fotos = new ArrayList<byte[]>();
	private Integer quantidade;
	private String observacao;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getComposicao() {
		return composicao;
	}
	public void setComposicao(String composicao) {
		this.composicao = composicao;
	}
	public String getTipoPatologia() {
		return tipoPatologia;
	}
	public void setTipoPatologia(String tipoPatologia) {
		this.tipoPatologia = tipoPatologia;
	}
	public ArrayList<byte[]> getFotos() {
		return fotos;
	}
	public void setFotos(ArrayList<byte[]> fotos) {
		this.fotos = fotos;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}

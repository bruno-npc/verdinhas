package upe.br.verdinhas.modelos;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Lembrete {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "id_lembrete")
	private Long id;
	
	
	@ManyToMany
	
	
	LocalDateTime dataInclusao = LocalDateTime.now();
	LocalDateTime dataUltimaAlteracao = LocalDateTime.now();
	
	private String descricao;
	private String tipo;
	private LocalDateTime agendamento = LocalDateTime.now();
	
	
	
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public LocalDateTime getAgendamento() {
		return agendamento;
	}
	public void setAgendamento(LocalDateTime agendamento) {
		this.agendamento = agendamento;
	}
	
}

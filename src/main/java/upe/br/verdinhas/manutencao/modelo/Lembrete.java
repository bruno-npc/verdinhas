package upe.br.verdinhas.manutencao.modelo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
	
	private String descricao;
	private LocalDateTime agendamento;
	
	
	@Enumerated(EnumType.STRING)
	private TipoManutencao tipo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDateTime getAgendamento() {
		return agendamento;
	}
	public void setAgendamento(LocalDateTime agendamento) {
		this.agendamento = agendamento;
	}
	
}

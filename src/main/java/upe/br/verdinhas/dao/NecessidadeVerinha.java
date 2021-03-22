package upe.br.verdinhas.dao;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class NecessidadeVerinha {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "id_necessidadeVerdinha")
	private Long id;
}

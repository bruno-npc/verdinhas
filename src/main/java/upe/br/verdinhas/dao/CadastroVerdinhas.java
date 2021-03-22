package upe.br.verdinhas.dao;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CadastroVerdinhas {

	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "id_cadastroVerdinhas")
	private Long id;
	
}

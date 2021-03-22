package upe.br.verdinhas.dao;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "id_usuario")
	private Long id;
	
	
	@OneToMany(mappedBy = "usuario")
	private List<Verdinha> verdinhas;
}


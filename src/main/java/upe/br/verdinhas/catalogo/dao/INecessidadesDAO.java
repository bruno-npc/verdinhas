package upe.br.verdinhas.catalogo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import upe.br.verdinhas.catalogo.modelo.Necessidades;

public interface INecessidadesDAO extends CrudRepository<Necessidades, Long>
{

	List<Necessidades> findByExposicaoSolar(String exposicaoSolar);
	
}

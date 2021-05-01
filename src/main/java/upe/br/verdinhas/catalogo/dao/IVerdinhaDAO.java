package upe.br.verdinhas.catalogo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import upe.br.verdinhas.catalogo.modelos.Verdinha;

@Repository
public interface IVerdinhaDAO extends CrudRepository<Verdinha, Long>
{
	
}

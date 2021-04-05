package upe.br.verdinhas.dao;

import org.springframework.data.repository.CrudRepository;

import upe.br.verdinhas.modelos.Verdinha;

public interface IVerdinhaDAO extends CrudRepository<Verdinha, Long>
{

}

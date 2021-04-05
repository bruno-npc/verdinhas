package upe.br.verdinhas.catalogo.dao;

import org.springframework.data.repository.CrudRepository;

import upe.br.verdinhas.catalogo.modelos.Verdinha;

public interface IVerdinhaDAO extends CrudRepository<Verdinha, Long>
{

}

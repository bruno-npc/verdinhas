package upe.br.verdinhas.catalogo.dao;

import org.springframework.data.repository.CrudRepository;

import upe.br.verdinhas.manutencao.modelo.Patologia;

public interface IPatologiaDAO extends CrudRepository<Patologia, Long>{

}

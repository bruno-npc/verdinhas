package upe.br.verdinhas.manutencao.dao;

import org.springframework.data.repository.CrudRepository;

import upe.br.verdinhas.manutencao.modelo.Manutencao;


public interface IManutencaoDAO extends CrudRepository<Manutencao, Long>{

}

package upe.br.verdinhas.manutencao.dao;

import org.springframework.data.repository.CrudRepository;

import upe.br.verdinhas.manutencao.modelo.Ocorrencia;


public interface IOcorrenciaDAO extends CrudRepository<Ocorrencia, Long>{

}

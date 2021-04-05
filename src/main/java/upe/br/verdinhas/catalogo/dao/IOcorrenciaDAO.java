package upe.br.verdinhas.catalogo.dao;

import org.springframework.data.repository.CrudRepository;

import upe.br.verdinhas.manutencao.modelo.Ocorrencia;


public interface IOcorrenciaDAO extends CrudRepository<Ocorrencia, Long>{

}

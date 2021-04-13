package upe.br.verdinhas.manutencao.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import upe.br.verdinhas.manutencao.modelo.Floracao;

@Repository
public interface IFloracaoDAO extends CrudRepository<Floracao, Long>{

}

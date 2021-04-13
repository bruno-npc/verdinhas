package upe.br.verdinhas.manutencao.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import upe.br.verdinhas.manutencao.modelo.Frutificacao;

@Repository
public interface IFrutificacaoDAO extends CrudRepository<Frutificacao, Long>{

}

package upe.br.verdinhas.manutencao.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import upe.br.verdinhas.manutencao.modelo.Lembrete;

@Repository
public interface ILembreteDAO extends CrudRepository<Lembrete, Long>{

}

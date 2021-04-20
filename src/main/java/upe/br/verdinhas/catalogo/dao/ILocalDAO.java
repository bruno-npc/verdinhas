package upe.br.verdinhas.catalogo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import upe.br.verdinhas.catalogo.modelos.Local;

@Repository
public interface ILocalDAO extends CrudRepository<Local, Long> {
	
	List<Local> findByNome(String nome);

	List<Local> findByDescricao(String descrição);

	List<Local> findByUmidade(String umidade);

	List<Local> findByCobertura(boolean cobertura);
}

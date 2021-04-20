package upe.br.verdinhas.catalogo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import upe.br.verdinhas.catalogo.modelos.Caracteristicas;

@Repository
public interface ICaracteristicasDAO extends CrudRepository<Caracteristicas, Long> {

	List<Caracteristicas> findByCorFlores(String corFlores);

	List<Caracteristicas> findByArbustos(String arbustos);

	List<Caracteristicas> findByCorFolhagem(String corFolhagem);

	List<Caracteristicas> findByFlores(String flores);

	List<Caracteristicas> findByFolhagem(String folhagem);

	List<Caracteristicas> findByFrutos(String frutos);

	List<Caracteristicas> findByRaizes(String raizes);

}

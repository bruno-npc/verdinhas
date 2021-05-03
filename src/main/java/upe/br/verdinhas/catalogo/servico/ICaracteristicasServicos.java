package upe.br.verdinhas.catalogo.servico;

import java.util.List;
import java.util.Optional;

import upe.br.verdinhas.catalogo.modelo.Caracteristicas;
import upe.br.verdinhas.catalogo.modelo.Verdinha;

public interface ICaracteristicasServicos {

	void incluir (Caracteristicas caracteristicas); 
	
	void alterar (Caracteristicas caracteristicas);
	void deletar (Caracteristicas caracteristica);
	List<Caracteristicas> listar();
}

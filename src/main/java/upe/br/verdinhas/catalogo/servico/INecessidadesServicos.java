package upe.br.verdinhas.catalogo.servico;

import java.util.List;

import upe.br.verdinhas.catalogo.modelo.Necessidades;

public interface INecessidadesServicos {

	void incluir(Necessidades necessidades);

	void alterar(Necessidades necessidades);

	List<Necessidades> listar();
	
}

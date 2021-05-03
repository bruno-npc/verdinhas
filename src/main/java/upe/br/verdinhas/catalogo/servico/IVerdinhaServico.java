package upe.br.verdinhas.catalogo.servico;

import java.util.List;

import upe.br.verdinhas.catalogo.modelos.Verdinha;

public interface IVerdinhaServico {

	void incluir (Verdinha verdinha);

	List<Verdinha> listar();
	
}

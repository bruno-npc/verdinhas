package upe.br.verdinhas.catalogo.servicos;

import java.util.List;

import upe.br.verdinhas.catalogo.modelos.Verdinha;

public interface IVerdinhaServicos {

	void incluir (Verdinha verdinha);

	List<Verdinha> listar();
	
	void deletar (Verdinha verdinha);
}

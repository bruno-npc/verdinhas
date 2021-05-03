package upe.br.verdinhas.catalogo.servico;

import java.util.List;

import upe.br.verdinhas.catalogo.modelo.Verdinha;

public interface IVerdinhaServicos {

	void incluir (Verdinha verdinha);

	List<Verdinha> listar();
	
	void deletar (Verdinha verdinha);
}

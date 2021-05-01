package upe.br.verdinhas.catalogo.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upe.br.verdinhas.catalogo.dao.IVerdinhaDAO;
import upe.br.verdinhas.catalogo.modelos.Verdinha;

@Service
public class VerdinhaServico implements IVerdinhaServicos {

	@Autowired
	private IVerdinhaDAO dao;

	@Override
	public void incluir(Verdinha verdinha) {

		if (verdinha == null) {
			throw new RuntimeException("Verdinha deve ser preenchida.");
		}
		if (verdinha.getNome() == null || verdinha.getNome().isBlank()) {
			throw new RuntimeException("Nome de verdinha deve ser preenchido.");
		}
		if (verdinha.getEspecie() == null || verdinha.getEspecie().isBlank()) {
			throw new RuntimeException("Especie de verdinha deve ser preenchida.");
		}
		if (verdinha.getGenero() == null || verdinha.getGenero().isBlank()) {
			throw new RuntimeException("Genero de verdinha deve ser preenchido.");
		}

		dao.save(verdinha);

	}

	@Override
	public List<Verdinha> listar() {
		return (List<Verdinha>) dao.findAll();
		
	}

	@Override
	public void deletar(Verdinha verdinha) {
		if (verdinha == null) {
			throw new RuntimeException("Verdinha nula não pode ser deletada");
		}
		dao.delete(verdinha);
	}

}

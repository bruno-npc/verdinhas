package upe.br.verdinhas.catalogo.servicos;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import upe.br.verdinhas.catalogo.dao.ILocalDAO;
import upe.br.verdinhas.catalogo.dao.IVerdinhaDAO;
import upe.br.verdinhas.catalogo.modelos.Local;
import upe.br.verdinhas.catalogo.modelos.Verdinha;

public class LocalServico implements ILocalServicos {

	@Autowired
	private ILocalDAO dao;

	@Autowired
	private IVerdinhaDAO verdinhaDAO;

	@Override
	public void incluir(Local local) {
		validarAtributosObrigatorios(local);

		dao.save(local);
	}

	@Override
	public void alterar(Local local) {
		validarAtributosObrigatorios(local);
		// Resolver:
		Optional<Verdinha> verdinha = verdinhaDAO.findById(local.getVerdinhas().get(0).getId());
		if (verdinha.isEmpty()) {
			throw new RuntimeException("Os dados da verdinha não estão preenchidos. (Não localizado)");
		}
		dao.save(local);
	}

	private void validarAtributosObrigatorios(Local local) {
		if (local == null) {
			throw new RuntimeException("Local deve ser preenchida.");
		}
		if (local.getNome() == null) {
			throw new RuntimeException("O nome de local deve ser preenchido");
		}
		if (local.getDescricao() == null) {
			throw new RuntimeException("Descrição do local deve ser preenchido.");
		}
	}

}

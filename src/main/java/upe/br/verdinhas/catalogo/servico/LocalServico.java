package upe.br.verdinhas.catalogo.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upe.br.verdinhas.catalogo.dao.ILocalDAO;
import upe.br.verdinhas.catalogo.modelo.Local;
import upe.br.verdinhas.catalogo.servico.ILocalServico;

@Service // Serviço
public class LocalServico implements ILocalServico {

	@Autowired
	private ILocalDAO dao;

	@Override
	public void incluir(Local local) {
		validarAtributosObrigatorios(local);

		dao.save(local);
	}

	@Override
	public void alterar(Local local) {
		validarAtributosObrigatorios(local);

		if (local.getId() == null) {
			throw new RuntimeException("O identificador do local deve ser preenchido");
		}

		if (dao.findById(local.getId()).isEmpty()) {
			throw new RuntimeException("Os dados do local não estão preenchidos. (Não localizado)");
		}

		dao.save(local);
	}

	private void validarAtributosObrigatorios(Local local) {
		if (local == null) {
			throw new RuntimeException("Local deve ser preenchida.");
		}
		if (local.getNome() == null) {
			throw new RuntimeException("O nome do local deve ser preenchido");
		}
		if (local.getDescricao() == null) {
			throw new RuntimeException("Descrição do local deve ser preenchido.");
		}
		if (local.getUmidade() == null) {
			throw new RuntimeException("A umidade do local deve ser preenchido.");
		}
		if (local.isCobertura() == true || local.isCobertura() == false) { //Observar se esta certo
			throw new RuntimeException("Identifique se está coberto ou não");
		}
	}

}

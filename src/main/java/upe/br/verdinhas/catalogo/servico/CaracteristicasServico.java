package upe.br.verdinhas.catalogo.servico;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upe.br.verdinhas.catalogo.dao.ICaracteristicasDAO;
import upe.br.verdinhas.catalogo.dao.IVerdinhaDAO;
import upe.br.verdinhas.catalogo.modelo.Caracteristicas;
import upe.br.verdinhas.catalogo.modelo.Verdinha;

@Service
public class CaracteristicasServico implements ICaracteristicasServicos {

	@Autowired
	private ICaracteristicasDAO dao;

	@Autowired
	private IVerdinhaDAO verdinhaDAO;

	@Override
	public void incluir(Caracteristicas caracteristicas) {

		validarAtributosObrigatorios(caracteristicas);

		dao.save(caracteristicas);
	}

	
	@Override
	public void alterar(Caracteristicas caracteristicas) {

		validarAtributosObrigatorios(caracteristicas);

		Optional<Verdinha> verdinha = verdinhaDAO.findById(caracteristicas.getVerdinha().getId());
		if (verdinha.isEmpty()) {
			throw new RuntimeException("Os dados da verdinha não estão preenchidos. (Não localizado)");
		}
		dao.save(caracteristicas);
	}

	private void validarAtributosObrigatorios(Caracteristicas caracteristicas) {
		if (caracteristicas == null) {
			throw new RuntimeException("Caracteristica deve ser preenchida.");
		}
		if (caracteristicas.getVerdinha() == null || caracteristicas.getVerdinha().getId() == null) {
			throw new RuntimeException("Os dados da verdinha devem ser preenchidos.");
		}
		if (caracteristicas.getFolhagem() == null) {
			throw new RuntimeException("Os dados de folhagem devem ser preenchidos.");
		}
		if (caracteristicas.getArbustos() == null) {
			throw new RuntimeException("Os dados de arbusto devem ser preenchidos.");
		}
		if (caracteristicas.getFlores() == null) {
			throw new RuntimeException("Os dados de Flores devem ser preenchidos.");
		}
	}

	@Override
	public void deletar(Caracteristicas caracteristicas) {
		if (caracteristicas == null) {
			throw new RuntimeException("Caracteristica nula, não pode ser excluida");
		}
		dao.delete(caracteristicas);
	}

	@Override
	public List<Caracteristicas> listar() {
		return (List<Caracteristicas>) dao.findAll();
	}

}
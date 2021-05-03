package upe.br.verdinhas.catalogo.servico;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upe.br.verdinhas.catalogo.dao.INecessidadesDAO;
import upe.br.verdinhas.catalogo.dao.IVerdinhaDAO;
import upe.br.verdinhas.catalogo.modelo.Necessidades;
import upe.br.verdinhas.catalogo.modelo.Verdinha;

@Service
public class NecessidadesServico implements INecessidadesServicos {

	@Autowired
	private INecessidadesDAO dao;

	@Autowired
	private IVerdinhaDAO verdinhaDAO;

	@Override
	public void incluir(Necessidades necessidades) {

		validarAtributosObrigatorios(necessidades);

		dao.save(necessidades);
	}

	@Override
	public void alterar(Necessidades necessidades) {

		validarAtributosObrigatorios(necessidades);

		Optional<Verdinha> verdinha = verdinhaDAO.findById(necessidades.getVerdinha().getId());
		if (verdinha.isEmpty()) {
			throw new RuntimeException("Os dados da verdinha não estão preenchidos. (Não localizado)");
		}
		dao.save(necessidades);
	}

	private void validarAtributosObrigatorios(Necessidades necessidades) {
		if (necessidades == null) {
			throw new RuntimeException("Necessidades deve ser preenchida.");
		}
		if (necessidades.getVerdinha() == null || necessidades.getVerdinha().getId() == null) {
			throw new RuntimeException("Os dados da verdinha devem ser preenchidos.");
		}
		if (necessidades.getExposicaoSolar() == null) {
			throw new RuntimeException("Os dados de necessidades/exposição solar devem ser preenchidos.");
		}
		if (necessidades.getFrequenciaPoda() == null) {
			throw new RuntimeException("Os dados de necessidades/frequencia poda devem ser preenchidos.");
		}
		if (necessidades.getFrequenciaRega() == null) {
			throw new RuntimeException("Os dados de necessidades/frequencia regar devem ser preenchidos.");
		}
		if (necessidades.getIncidenciaSolar() == null) {
			throw new RuntimeException("Os dados de necessidades/incidencia solar devem ser preenchidos.");
		}
		if (necessidades.getPodaLimpeza() == null) {
			throw new RuntimeException("Os dados de necessidades/poda limpeza devem ser preenchidos.");
		}
		if (necessidades.getRega() == null) {
			throw new RuntimeException("Os dados de necessidades/regar devem ser preenchidos.");
		}
		if (necessidades.getTipoVento() == null) {
			throw new RuntimeException("Os dados de necessidades/tipo de vento devem ser preenchidos.");
		}
		if (necessidades.getVaso() == null) {
			throw new RuntimeException("Os dados de necessidades/vaso devem ser preenchidos.");
		}
	}

	@Override
	public List<Necessidades> listar() {
		return (List<Necessidades>) dao.findAll();
	}

}

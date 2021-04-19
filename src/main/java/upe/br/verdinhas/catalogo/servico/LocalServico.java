package upe.br.verdinhas.catalogo.servico;

import org.springframework.beans.factory.annotation.Autowired;

import upe.br.verdinhas.catalogo.dao.ILocalDAO;
import upe.br.verdinhas.catalogo.modelos.Local;

public class LocalServico implements ILocalServico {
	private ILocalDAO dao;

	@Autowired

	@Override
	public void incluir(Local local) {
	
	
		
		if (local == null  ) {
			throw new RuntimeException("O local deve ser informado"); //Implementa regra na camada de negocio
				
		}
		if (local.getNome() == null || local.getNome().isEmpty() ) {
			throw new RuntimeException("O Nome deve ser informado");
	}
		if (local.getIncidenciaSolar() == null   ) {
			throw new RuntimeException("O Nome deve ser informado");
		
		}
		
		dao.save(local); // camada de serviço valida e salva
		
   }
}
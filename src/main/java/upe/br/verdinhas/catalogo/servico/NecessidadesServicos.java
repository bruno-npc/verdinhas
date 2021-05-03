package upe.br.verdinhas.catalogo.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upe.br.verdinhas.catalogo.dao.INecessidadesDAO;
import upe.br.verdinhas.catalogo.modelos.Necessidades;


@Service
public class NecessidadesServicos implements INecessidadesServico {
	
	@Autowired
	private INecessidadesDAO dao;
	
	
	
	@Override 																					//Inclui na classe INecessidades
	public void incluir (Necessidades necessidades) {
		
// como incluir a classe enum

	
		
	}

}

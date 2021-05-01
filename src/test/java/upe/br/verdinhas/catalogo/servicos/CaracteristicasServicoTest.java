package upe.br.verdinhas.catalogo.servicos;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import upe.br.verdinhas.catalogo.dao.ICaracteristicasDAO;
import upe.br.verdinhas.catalogo.modelos.Caracteristicas;
import upe.br.verdinhas.catalogo.modelos.Verdinha;
import upe.br.verdinhas.catalogo.servicos.*;

@RunWith(MockitoJUnitRunner.class)
public class CaracteristicasServicoTest {

	@InjectMocks
	private CaracteristicasServico servico;
	
	@Mock
	private ICaracteristicasDAO dao;
	
	@Test
	public void testeIncluirCaracteristicasSucesso ()
	{
		Caracteristicas carateristicas = new Caracteristicas();
		Verdinha verdinha = new Verdinha();
		
		carateristicas.setVerdinha(verdinha);
		
		carateristicas.setFolhagem("FolhagemTeste");
		
		servico.incluir(carateristicas);
		
		verify(dao, times(1)).save(carateristicas);
	}
	
}

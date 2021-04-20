package upe.br.verdinhas.catalogo.dao;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import upe.br.verdinhas.catalogo.modelos.Local;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class ILocalDAOTest {

	@Autowired
	private ILocalDAO dao;
	
	@Test
	public void testeIncluirLocalSucesso ()
	{
		long existentes = dao.count();
		
		Local sala = new Local();
		sala.setNome("Sala");
		dao.save(sala);
		
		long existentesApos = dao.count();
		
		assertThat(existentesApos, is(equalTo(existentes + 1)));
	}
}

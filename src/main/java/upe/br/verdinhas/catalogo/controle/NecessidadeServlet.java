package upe.br.verdinhas.catalogo.controle;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;

import upe.br.verdinhas.catalogo.servicos.INecessidadesServicos;

@WebServlet(urlPatterns = { "/necessidades" })
public class NecessidadeServlet extends HttpServlet {

		private static final long serialVersionUID = 1L;
		@Autowired
		private INecessidadesServicos servico;
		
		
	
}

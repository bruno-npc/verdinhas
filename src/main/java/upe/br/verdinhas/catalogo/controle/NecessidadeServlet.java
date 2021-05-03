package upe.br.verdinhas.catalogo.controle;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import upe.br.verdinhas.catalogo.dao.INecessidadesDAO;
import upe.br.verdinhas.catalogo.modelo.Necessidades;
import upe.br.verdinhas.catalogo.servico.INecessidadesServicos;

@WebServlet(urlPatterns = { "/necessidades" })
public class NecessidadeServlet extends HttpServlet {

		private static final long serialVersionUID = 1L;
		@Autowired
		private INecessidadesServicos servico;
		
		@Autowired
		private INecessidadesDAO dao;
		
		//incluir
		protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

			Necessidades necessidades = preencherNecessidades(req);

			String mensagem = "Necessidades incluidas com sucesso";
			try {
				servico.incluir(necessidades);
			} catch (Exception e) {
				mensagem = e.getMessage();
			}
			res.getOutputStream().print(mensagem);
		}
		
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			List<Necessidades> necessidades = servico.listar();
			resp.getOutputStream().print(necessidades.toString());
		}
		
		
		private Necessidades preencherNecessidades (HttpServletRequest req)
		{
			
			
			
			Necessidades necessidades = new Necessidades();
			
			return necessidades;
		}

	
}

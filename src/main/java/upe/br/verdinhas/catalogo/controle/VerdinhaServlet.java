package upe.br.verdinhas.catalogo.controle;


import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import upe.br.verdinhas.catalogo.dao.IVerdinhaDAO;
import upe.br.verdinhas.catalogo.modelo.Caracteristicas;
import upe.br.verdinhas.catalogo.modelo.Verdinha;
import upe.br.verdinhas.catalogo.servico.IVerdinhaServicos;
import upe.br.verdinhas.catalogo.servico.IVerdinhaServicos;


@WebServlet(urlPatterns = { "/verdinha" })
public class VerdinhaServlet extends HttpServlet {

	@Autowired
	private IVerdinhaServicos servico;
	
	@Autowired
	private IVerdinhaDAO dao;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String nome = req.getParameter("nome");
		String especie = req.getParameter("especie");
		String genero = req.getParameter("genero");

		Verdinha verdinha = new Verdinha(nome, especie, genero);
		
		String mensagem = "Verdinha incluida com sucesso";
		try {
			servico.incluir(verdinha);
		} catch (Exception e) {
			mensagem = e.getMessage();
		}
		res.getOutputStream().print(mensagem);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Verdinha> verdinhas = servico.listar();
		/*String resultado = "";
		for (Verdinha verdinha : verdinhas) {
			resultado += verdinha.toString();
		}*/
		resp.getOutputStream().print(verdinhas.toString());
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String mensagem = "Verdinha deletada com sucesso";
		
		Verdinha verdinha = preencherVerdinha(req);
		
		dao.findById(verdinha.getId());

		try {
			servico.deletar(verdinha);
		} catch (Exception e) {
			mensagem = e.getMessage();
		}
		resp.getOutputStream().print(mensagem);
		
	}
	
	private Verdinha preencherVerdinha(HttpServletRequest req) {
		
		return null;
	}
	
}

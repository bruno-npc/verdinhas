package upe.br.verdinhas.catalogo.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import upe.br.verdinhas.catalogo.modelo.Local;
import upe.br.verdinhas.catalogo.servico.ILocalServico;

@WebServlet // Anotação para servlet
(urlPatterns = { "/local" })
public class LocalServlet extends HttpServlet {

	@Autowired
	private ILocalServico servico;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Local local = new Local();
		local.setNome(req.getParameter("nome"));
		local.setDescricao(req.getParameter("descricao"));
		
		servico.incluir(local);
	}
}

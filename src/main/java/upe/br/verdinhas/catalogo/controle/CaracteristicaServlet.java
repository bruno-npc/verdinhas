package upe.br.verdinhas.catalogo.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import upe.br.verdinhas.catalogo.modelos.Caracteristicas;
import upe.br.verdinhas.catalogo.modelos.Verdinha;
import upe.br.verdinhas.catalogo.servicos.ICaracteristicasServicos;

@WebServlet(urlPatterns = { "/caracteristica" })
public class CaracteristicaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Autowired
	private ICaracteristicasServicos servico;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		Caracteristicas caracteristicas = preecherCaracteristicas(req);

		String mensagem = "Caracteristica incluida com sucesso";
		try {
			servico.incluir(caracteristicas);
		} catch (Exception e) {
			mensagem = e.getMessage();
		}
		res.getOutputStream().print(mensagem);
	}

	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Caracteristicas caracteristicas = preecherCaracteristicas(req);

		String mensagem = "Caracteristica alterada com sucesso";
		try {
			servico.alterar(caracteristicas);
		} catch (Exception e) {
			mensagem = e.getMessage();
		}
		resp.getOutputStream().print(mensagem);
	}

	private Caracteristicas preecherCaracteristicas(HttpServletRequest req) {
		String folhagem = req.getParameter("folhagem");
		String arbustos = req.getParameter("arbustos");
		String flores = req.getParameter("flores");
		String id = req.getParameter("id");

		String idVerdinha = req.getParameter("id_verdinha");

		Caracteristicas caracteristicas = new Caracteristicas();

		caracteristicas.setFolhagem(folhagem);
		caracteristicas.setArbustos(arbustos);
		caracteristicas.setFlores(flores);

		if (id != null) {
			caracteristicas.setId(Long.valueOf(id));
		}

		if (idVerdinha != null) {
			Verdinha verdinha = new Verdinha(Long.valueOf(idVerdinha));
			caracteristicas.setVerdinha(verdinha);
		}

		return caracteristicas;
	}

}

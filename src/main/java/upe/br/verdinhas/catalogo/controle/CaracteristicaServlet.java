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
import org.springframework.web.bind.annotation.PathVariable;

import upe.br.verdinhas.catalogo.dao.ICaracteristicasDAO;
import upe.br.verdinhas.catalogo.modelo.Caracteristicas;
import upe.br.verdinhas.catalogo.modelo.Verdinha;
import upe.br.verdinhas.catalogo.servico.ICaracteristicasServicos;

@WebServlet(urlPatterns = { "/caracteristica" })
public class CaracteristicaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Autowired
	private ICaracteristicasServicos servico;

	@Autowired
	private ICaracteristicasDAO dao;
	
	//incluir
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		Caracteristicas caracteristicas = preencherCaracteristicas(req);

		String mensagem = "Caracteristica incluida com sucesso";
		try {
			servico.incluir(caracteristicas);
		} catch (Exception e) {
			mensagem = e.getMessage();
		}
		res.getOutputStream().print(mensagem);
	}

	
	
	//listar
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Caracteristicas> caracteristica = servico.listar();
		resp.getOutputStream().print(caracteristica.toString());
	}

	//alterar
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Caracteristicas caracteristicas = preencherCaracteristicas(req);

		String message = "change made successfully.";
		try {
			servico.alterar(caracteristicas);
		} catch (Exception e) {
			message = e.getMessage();
		}
		resp.getOutputStream().print(message);
	}
	
	//deletar
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String mensagem = "Caracteristica deletada com sucesso";

		Caracteristicas caracteristica = deletarCaracteristica(req);
		
		
		dao.findById(caracteristica.getId());

		try {
			servico.deletar(caracteristica);
		} catch (Exception e) {
			mensagem = e.getMessage();
		}
		resp.getOutputStream().print(mensagem);
	}

	
	
	private Caracteristicas preencherCaracteristicas(HttpServletRequest req) {
		String folhagem = req.getParameter("folhagem");
		String arbustos = req.getParameter("arbustos");
		String flores = req.getParameter("flores");
		String CorFlores = req.getParameter("corflores");
		String CorFolhagem = req.getParameter("corfolhagem");
		String Frutos = req.getParameter("frutos");
		String Raizes = req.getParameter("Raizes");
		
		String id = req.getParameter("id");

		String idVerdinha = req.getParameter("id_verdinha");

		Caracteristicas caracteristicas = new Caracteristicas();

		caracteristicas.setFolhagem(folhagem);
		caracteristicas.setArbustos(arbustos);
		caracteristicas.setFlores(flores);
		caracteristicas.setCorFlores(CorFlores);
		caracteristicas.setCorFolhagem(CorFolhagem);
		caracteristicas.setFrutos(Frutos);
		caracteristicas.setRaizes(Raizes);

		if (id != null) {
			caracteristicas.setId(Long.valueOf(id));
		}

		if (idVerdinha != null) {
			Verdinha verdinha = new Verdinha(Long.valueOf(idVerdinha));
			caracteristicas.setVerdinha(verdinha);
		}

		return caracteristicas;
	}
	
	
	private Caracteristicas deletarCaracteristica (HttpServletRequest req)
	{
		Caracteristicas caracteristicaDeletar = new Caracteristicas();
		List<Caracteristicas> caracteristica = servico.listar();
		
		if (caracteristica.contains(req))
		{
			caracteristicaDeletar.getId();
		}
		
		return caracteristicaDeletar;
	}
	
}

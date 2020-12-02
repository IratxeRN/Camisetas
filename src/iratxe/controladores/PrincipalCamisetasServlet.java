package iratxe.controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import iratxe.accesodatos.CamisetaDaoTreeMap;
import iratxe.accesodatos.Dao;
import iratxe.modelo.Camiseta;

/**
 * Servlet implementation class PrincipalServlet
 */
@WebServlet("/principal")
public class PrincipalCamisetasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// necesito un DAO de Camiseta que lo consigo gracias a CamisetaDaoTreeMap.get
		Dao<Camiseta> dao = CamisetaDaoTreeMap.getInstancia();
		// de ese Dao voy a pedir un conjunto de camisetas
		Iterable<Camiseta> camisetas = dao.listarTodos();
		// una vez obtenido las camisetas creamos un atributo dnd se van a guardar
		request.setAttribute("camisetas", camisetas);
		// y se le pasa a un dispatcher
		request.getRequestDispatcher("/WEB-INF/vistas/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}

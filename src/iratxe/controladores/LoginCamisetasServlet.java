package iratxe.controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import iratxe.accesodatos.UsuarioDao;
import iratxe.accesodatos.UsuarioDaoTreeMap;
import iratxe.modelo.Usuario;

/**
 * Servlet implementation class LoginCamisetasServlet
 */
@WebServlet("/login")
public class LoginCamisetasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/vistas/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		UsuarioDao<Usuario> userdao = UsuarioDaoTreeMap.getInstancia();
		Usuario usuario = userdao.buscarPorEmail(email);

		if (usuario != null && usuario.getPassword().equals(password)) {

			request.getSession().setAttribute("usuario", usuario);
			request.getRequestDispatcher("/principal").forward(request, response);

		} else {

			request.getRequestDispatcher("/WEB-INF/vistas/login.jsp").forward(request, response);
		}

	}

}

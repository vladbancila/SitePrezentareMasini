package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Service;

/**
 * Servlet implementation class produse
 */
public class produse extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//Setam un atribut care este un key-value pentru a fi folosit in produse.jsp
		request.setAttribute("produse", Service.getProduse());
		RequestDispatcher dispacher = request.getRequestDispatcher("/WEB-INF/Produse.jsp");
		dispacher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}

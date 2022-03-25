package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import Entities.Deltager;

/**
 * Servlet implementation class Admin
 */
@WebServlet("/Admin")
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Tilpass dette til prosjektet
		// Må få fiksa problemet med Tomcat serveren og
		
		//	HttpSession sesjon = request.getSession(false);

		//	if (sesjon == null || (Deltager) sesjon.getAttribute("deltager") == null) {
		//	response.sendRedirect("LoginServlet" + "?requiresLogin");
		//	} else {

			//List<Deltager> liste = expoEAO.hentAlleDeltagere();

			//sesjon.setAttribute("liste", liste);

			request.getRequestDispatcher("WEB-INF/jsp/Admin.jsp").forward(request, response);

		}
		
	}

	



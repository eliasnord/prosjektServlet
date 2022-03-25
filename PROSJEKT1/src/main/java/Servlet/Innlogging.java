package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Innlogging
 */
@WebServlet("/Innlogging")
public class Innlogging extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	String correctEmail;
	String correctPass;
	 
	
	@Override
	public void init() throws ServletException {
		correctEmail = getServletConfig().getInitParameter("email");
		correctPass = getServletConfig().getInitParameter("pass");
	}
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	
		
		String loginmessage = "";

		if (request.getParameter("invalidinput") != null) {
			loginmessage = "E-mail og/eller passordet mangler eller er feil";

		} else if (request.getParameter("requiresLogin") != null) {
			loginmessage = "Du må logge inn for å se denne siden (du kan ha vært inaktiv for lenge)";
		}

		request.setAttribute("loginmessage", loginmessage);
		
		request.getRequestDispatcher("WEB-INF/jsp/Innlogg.jsp").forward(request, response);
	
    	
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String emial = request.getParameter("email");
		String passord = request.getParameter("passord");
		
		response.sendRedirect("Stand");
		
		
	
	}

}

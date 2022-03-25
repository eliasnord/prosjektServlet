package Servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;







/**
 * Servlet implementation class Registrer
 */
@WebServlet("/Registrer")
public class Registrer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//@EJB
	//DeltagerEAO deltagerEAO;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String loginmessage = "";

		if (request.getParameter("invalidinput") != null) {
			loginmessage = "Email og/eller passordet mangler eller er feil";

		} else if (request.getParameter("requiresLogin") != null) {
			loginmessage = "Du må logge inn for å se denne siden (du kan ha vært inaktiv for lenge)";
		}

		request.setAttribute("loginmessage", loginmessage);

		request.getRequestDispatcher("WEB-INF/jsp/registrer.jsp").forward(request, response);
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String passord = request.getParameter("passord");
		
		//Deltager deltager = deltagerEAO.getDeltager(email);
		
		
		// Validator valid = new Validator(request);

		// if (!valid.isEmailValid() || !valid.isPasswordValid()) {
		//	response.sendRedirect("LoginServlet" + "?invalidinput");
		// }

		//else if (deltager == null || !PassordUtil.validerMedSalt(passord, salt, hashetpass)) {

		//	response.sendRedirect("LoginServlet" + "?invalidinput");

		//	} else {
		//	HttpSession sesjon = request.getSession(false);
		//	if (sesjon != null) {
		//		sesjon.invalidate();
		//	}
		//	sesjon = request.getSession(true);
		//	sesjon.setMaxInactiveInterval(10);

		//	sesjon.setAttribute("deltager", deltager);
		//	sesjon.setAttribute("email", email);

		//	sesjon.setAttribute("navn", deltager.getEmail());

			response.sendRedirect("Innlogging");
		}
		
	
	}



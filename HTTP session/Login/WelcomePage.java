package Login;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WelcomePage
 */
@WebServlet("/welcome")

public class WelcomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		PrintWriter print = response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);  
		
		response.setContentType("text/html");
		
		HttpSession ses = request.getSession(false);
		String namee = (String) ses.getAttribute("username");
		
		print.println(" ");
		print.println("Successfully logged in..!");
		print.println("Welcome " + namee + "!");
		 
		
		System.out.println("welcome called");
		
		 
		//response.sendRedirect("logout");
		
		print.close();
	}

}

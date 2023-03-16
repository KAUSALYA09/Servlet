package Login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogOut
 */
@WebServlet("/LogOut")
public class LogOut extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);  
		  
        response.setContentType("text/html");      
        System.out.println("Session before invalidate: "+ request.getSession(false));
        request.getSession(false).invalidate();
        System.out.println("Session after invalidate: "+ request.getSession(false));
        out.println("Thank you! You are successfully logged out.");
        System.out.println("logout called");
        out.close();
	}

}

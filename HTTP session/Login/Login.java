package Login;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet
{
    private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        PrintWriter pw = response.getWriter();
        
        request.getRequestDispatcher("link.html").include(request, response);  

        response.setContentType("text/html");
         
        String name = "Kausalya";
        String password = "kausi";
        
        String user=request.getParameter("userName");
        String pass=request.getParameter("userPassword");
        
        HttpSession session = request.getSession(true);
        session.setAttribute("username",user);
        
        if(user.equals(name) && pass.equals(password)) {
            //pw.println("Login Success");
        	response.sendRedirect("welcome");
            
        }else {
        	
            pw.println("Login Failed...! Check your username or password. It is incorrect!");
        	
        }
        
        pw.close();
        
    }
}


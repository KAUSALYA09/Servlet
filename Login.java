package Login;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login extends HttpServlet
{
    private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");
        String user=req.getParameter("userName");
        String pass=req.getParameter("userPassword");
        pw.println("Login Page...!");
        if(user.equals("Kausalya") && pass.equals("kausi"))
            pw.println("\n Login Success...!");
        else
            pw.println("\n Login Failed...!");
        pw.close();
    }
}


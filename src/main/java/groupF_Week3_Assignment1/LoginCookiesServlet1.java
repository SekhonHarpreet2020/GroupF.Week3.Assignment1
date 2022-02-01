package groupF_Week3_Assignment1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* Faruk Batur C0808880 26/01/2022 */

/**
 * Servlet implementation class LoginCookiesServlet1
 */
@WebServlet("/LoginCookiesServlet1")
public class LoginCookiesServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCookiesServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			response.setContentType("text/html");	
			PrintWriter out = response.getWriter();
			
			//fetching values from form and storing in variables
			String username, password;
			username = request.getParameter("username");
			password = request.getParameter("password");
			
			
			// Validation of username and password entered by the user
			if(password.equals("groupF") && username.equalsIgnoreCase("shilpy"))
			{
				// Creating cooking object and storing username value in the variable username
				Cookie cookieObj = new Cookie("username",username);
				response.addCookie(cookieObj);
				//out.println("Cookie " + cookieObj.getValue());
				
				//out.print("Hey " + username);
				// A button created to send the link to next servlet cookies page
				out.print("<form action='LoginCookiesServlet2' method='post'>");
				out.print("<input type='submit' value='Click me to view the cookies'>");
				out.print("</form>");
				
				out.close();
				
			}
			else
			{
				// If validation fails, print message and redirect to Login.jsp page
				out.print("Invalid username or password!");
				out.print("<br/><a href='Login.jsp' >Try Again</a>");
				
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		doGet(request, response);
	}

}

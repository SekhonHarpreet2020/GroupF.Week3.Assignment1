package groupF_Week3_Assignment1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginRequestDispatcherServlet1
 */
@WebServlet("/LoginRequestDispatcherServlet1")
public class LoginRequestDispatcherServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginRequestDispatcherServlet1() {
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
			
			String username, password;
			username = request.getParameter("username");
			password = request.getParameter("password");
			
			if(password.equals("groupF") && username.equalsIgnoreCase("shilpy")) {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("LoginRequestDispatcherServlet2");
				requestDispatcher.forward(request, response);
			}
			else {
				out.print("Invalid username or password!");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Login.jsp");
				requestDispatcher.include(request,response);
			}
		}
		catch(Exception e){
			System.out.println(e);
			}

		doGet(request, response);
	}

}

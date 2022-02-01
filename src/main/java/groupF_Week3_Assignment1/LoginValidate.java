package groupF_Week3_Assignment1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginValidate
 */
@WebServlet("/LoginValidate")
public class LoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginValidate() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String buttonValue;
			buttonValue = request.getParameter("buttonValue");

			out.print(buttonValue);
			if (buttonValue.equals("Login Request Dispacther")) {
				LoginRequestDispatcherServlet1 object = new LoginRequestDispatcherServlet1();
				object.doPost(request, response);
			} else if (buttonValue.equals("Login Cookies")) {
				LoginCookiesServlet1 object = new LoginCookiesServlet1();
				object.doPost(request, response);
			} else {
				LoginSessionServlet object = new LoginSessionServlet();
				object.doPost(request, response);
			}
		} catch (Exception e) {
			System.out.print(e);
		}

		doGet(request, response);
	}

}

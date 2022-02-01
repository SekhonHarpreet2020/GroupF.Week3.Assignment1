package groupF_Week3_Assignment1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* Faruk Batur C0808880 26/01/2022 */


/**
 * Servlet implementation class LoginCookiesServlet2
 */
@WebServlet("/LoginCookiesServlet2")
public class LoginCookiesServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCookiesServlet2() {
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

			// Creating array for cookies
			Cookie ck[] = request.getCookies();
			
			// Printing cookie value
			out.print("Hey "+ ck[0].getValue());
			
			//  Link to redirect to scoreCalculator.jsp file
			out.print("<br/><a href='ScoreCalculator.jsp' >Click to calculate score</a>");
			out.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		doGet(request, response);
	}

}

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
 * Servlet implementation class ScoreCalculator
 */
@WebServlet("/ScoreCalculator")
public class ScoreCalculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScoreCalculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//declaration of variables
				/*int subject1, subject2, subject3, subject4, subject5, average;
				String name, grade;
				
				//
				response.setContentType("text/html");
				
				PrintWriter out = response.getWriter();
				
				
				try{
					//getting the data from the form
					name = request.getParameter("studentName");
					subject1 = Integer.parseInt(request.getParameter("english"));
					subject2 = Integer.parseInt(request.getParameter("math"));
					subject3 = Integer.parseInt(request.getParameter("science"));
					subject4 = Integer.parseInt(request.getParameter("drawing"));
					subject5 = Integer.parseInt(request.getParameter("geography"));
					
					//calculating the average
					average = (subject1 + subject2 + subject3 + subject4 + subject5)/5;
					
					out.print("Hi \t" + name);
					out.print("\n Average Score : " + average);
					out.print("Grade Scheme");
					
					//condition for grading
					if(average>=94)
					{
						grade = " A+";	
					}
					else if(average>=87)
					{
						grade = " A";		
					}
					else if(average>=80)
					{
						grade = " A-";		
					}
					else if(average>=77)
					{
						grade = " B+";		
					}
					else if(average>=73)
					{
						grade = " B";		
					}
					else if(average>=70)
					{
						grade = " B-";		
					}
					else if(average>=67)
					{
						grade = " C+";		
					}
					else if(average>=63)
					{
						grade = " C";		
					}
					else if(average>=60)
					{
						grade = " C-";		
					}
					else if(average>=50)
					{
						grade = " D";		
					}
					
					else
					{
						grade = " F";	
					}
					out.println(grade);
					
					request.getSession().setAttribute("name", name);
					
					/*
					 * redirecting to final.jsp file
					 * getContextPath() : gets the path of the project folder
					 * */
					//response.sendRedirect(request.getContextPath() + "/final.jsp");

			 // 	}
			  //  catch (NumberFormatException ex){
			//    	ex.printStackTrace();
			   //	}
				
		//doGet(request, response);  
		// it sends request to final.jsp 
		RequestDispatcher rd= request.getRequestDispatcher("final.jsp");
		rd.forward(request, response);
	    
	} 

}

package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("/register.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out= response.getWriter();
		
		String myName=request.getParameter("name");
		String myEmail=request.getParameter("email");
		String myContact=request.getParameter("contact");
		String myPassword=request.getParameter("password");
		String myGender=request.getParameter("gender");
		String myCity=request.getParameter("city");
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String DB_URL = "jdbc:mysql://localhost:3306/iss_practice";
			String USER = "root";
			String PASS = "Maanu1107%";
			 
			Connection connection=DriverManager.getConnection(DB_URL,USER,PASS);
			
			PreparedStatement ps=connection.prepareStatement("insert into register values(?,?,?,?,?,?);");
			
			ps.setString(1, myName);
			ps.setString(2, myEmail);
			ps.setString(3, myContact);
			ps.setString(4, myPassword);
			ps.setString(5, myGender);
			ps.setString(6, myCity);
			
			
			int count=ps.executeUpdate();
			
			if(count>0)
			{
				response.setContentType("text/html");
				out.print("<h3 style='color:green'> User registerd successfully</h3>");
				RequestDispatcher rd= request.getRequestDispatcher("/login.jsp");
				rd.include(request, response);
			}
			else 
			{
				response.setContentType("text/html");
				out.print("<h3 style='color:red'> User not registerd successfully</h3>");
				RequestDispatcher rd= request.getRequestDispatcher("/register.jsp");
				rd.include(request, response);
			}
			
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	}

}

package controller;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Staff;
@WebServlet("/AddController")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
		{
			   StaffController controller = new StaffController();
			
			   int id= Integer.parseInt(request.getParameter("id"));
			   String name = request.getParameter("name");
		     Double d=Double.parseDouble(request.getParameter("contact"));
		        long contact =d.longValue();
		        Double s=Double.parseDouble(request.getParameter("salary"));
		        long salary =s.longValue();
		        controller.addStaff(id, name, contact, salary);
		          
		     response.sendRedirect("Login");
			   
		}
	}



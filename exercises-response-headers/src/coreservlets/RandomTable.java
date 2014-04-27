package coreservlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RandomTable
 */
@WebServlet("/random-table")
public class RandomTable extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	      response.setContentType("text/csv");
	      PrintWriter out = response.getWriter();
	      for (int i=0; i<10; i++) {
	    	  String line = "";
	    	  for (int j=0; j<5; j++) {
	    		  line += Math.random();
	    		  line += (j == 4) ? ";" : ",";
	    	  }
    		  out.println(line);
	      }
	}

}

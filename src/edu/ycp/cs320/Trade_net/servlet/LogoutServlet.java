package edu.ycp.cs320.Trade_net.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ycp.cs320.Trade_net.model.User;

public class LogoutServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//remove the user
		User user = new User();
		req.setAttribute("user", user);
		
		//return to index
		req.getRequestDispatcher("_view/index.jsp").forward(req, resp);
	}

}
package com.ajinz;

import java.io.IOException;

import org.apache.catalina.connector.Response;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class login extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		boolean can_login;
		HttpSession session;
		if(username.equals("admin") && password.equals("admin")) {
			can_login = true;
			session = req.getSession();
			session.setAttribute("can_login", can_login);

			res.sendRedirect("/login");
		}
		else {
			can_login = false;
			session = req.getSession();
			session.setAttribute("can_login", can_login);
			res.sendRedirect("/login");
		}
	}
}

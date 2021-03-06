package com.ajinz;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/logout")
public class Logout extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out;
		out = res.getWriter();
		out.println("<html><body bgcolor='pink'>");
		out.println("</body></html>");

		HttpSession session = req.getSession();

		if (session.getAttribute("can_login") != null) {  
		    session.invalidate();
		    res.sendRedirect("/login");
		    return; // <--- Here.
		}
	}
}

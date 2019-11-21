package com.ust.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.html")
public class LoginPageServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();

		String id = "";
		Cookie[] cookies = req.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("alwaysRemember")) {
					id = cookie.getValue();
				}
			}
		}
		out.println("<html>");

		out.println("<fieldset align='center'>");
		out.println("<legend>LOGIN</legend>");
		out.println("<form action='./login' method='post'>");
		out.println("<table align='center'>");

		out.println("<tr>");
		out.println("<td>ID:</td>");
		out.println("<td><input name='id' type='number' value='"+id+"'></td>");//dynamic
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>PASSWORD:</td>");
		out.println("<td><input name='password' type='password'></td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td></td>");
		out.println("<td><input name='login' type='submit'></td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>REMEMBER</td>");
		out.println("<td><input name='rememberme' type='checkbox' value='checked'></td>");
		out.println("</tr>");

		out.println("</table>");
		out.println("</form>");
		out.println("<a href='register.html'>REGISTER</a>");
		out.println("</fieldset>");

		out.println("</html>");

	}
}

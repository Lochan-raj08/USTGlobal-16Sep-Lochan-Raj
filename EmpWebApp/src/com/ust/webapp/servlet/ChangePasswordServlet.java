package com.ust.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ust.webapp.dao.EmployeeDao;
import com.ust.webapp.dto.EmployeeInfo;
import com.ust.webapp.util.EmployeeDaoManager;

@WebServlet("/ChangePassword")
public class ChangePasswordServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);
		if (session != null) {

			String pass = req.getParameter("password");
			String confirmPass = req.getParameter("confirmpassword");
			if (pass.equals(confirmPass)) {
				
				EmployeeInfo info = (EmployeeInfo)session.getAttribute("info");
				EmployeeDao dao = EmployeeDaoManager.getEmployeeDao();
				dao.changePassword(info.getId(), pass);
				
				RequestDispatcher dispatcher = req.getRequestDispatcher("/home");
				dispatcher.forward(req, resp);
				
			}else {
				String msg = "PASSWORD NOT MATCHING";
				req.setAttribute("msg", msg);
				
				
//				PrintWriter out = resp.getWriter();
//				out.println("<html>");
//				out.println("<h4>PASSWORD NOT MATCHING</h4>");
//				out.println("</html>");
				
				RequestDispatcher dispatcher = req.getRequestDispatcher("/ChangePassword.jsp");
				dispatcher.forward(req, resp);
				
			}

		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
		}

	}
}

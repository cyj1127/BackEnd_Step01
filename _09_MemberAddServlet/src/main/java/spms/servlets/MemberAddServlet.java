package spms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;

@WebServlet("/member/list")
@SuppressWarnings("serial")
public class MemberAddServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<html><head><title>회원등록</title></head>");
		out.println("<body><h1>회원등록</h1>");
		out.println("<form action='add' method='post'");
		out.println("이름: <input type='text' name='name'><br>");
		out.println("이메일 : <input type='text' name='email'><br>");
		out.println("암호: <input type='text' name='password'><br>");
		out.println("<input type='submit' value'추가'");
		out.println("<input type='submit' value'취소'");
		super.doGet(req, resp);
	}
		

}

package study01.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/* tomcat이 실행될 때 자동으로 서비스에 참여하는 '서블릿 객체'가 되기 위해서는
 * 1)Servlet 인터페이스를 상속 받아야 한다.
 * 2)@WebServlet 에노테이션이나
 * 		web.xml에 서블릿 객체로 등록해야 한다.
 */
public class HelloWorld implements Servlet {

	ServletConfig config;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy() 호");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		System.out.println("getServletConfig() 호");
		return this.config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("getServletInfo() 호");
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init() 호");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service() 호");

	}

}

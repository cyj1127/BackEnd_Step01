package study01.servlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/* GenericServlet은 1개의 추상메서드를 가진 추상 클래스이다.
 * servlet 인터페이스가 상속시켜준 나머지 메서드는 defalut
 */
public class HelloWorld extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	System.out.println("service() 호출");
	}

}
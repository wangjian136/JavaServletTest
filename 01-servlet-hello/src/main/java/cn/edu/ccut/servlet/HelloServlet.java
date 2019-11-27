package cn.edu.ccut.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * µÚÒ»¸öservlet
 * @author jwang
 *
 */
public class HelloServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.write("<html>");
		out.write("<head><title>hello servlet</title></head>");
		out.write("<body><h1>Hello Servlet!</h1></body>");
		out.write("</html>");
		out.close();
	}
	
}

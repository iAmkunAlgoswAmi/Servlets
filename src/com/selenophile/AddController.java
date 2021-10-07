/**
 * 
 */
package com.selenophile;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ALGOSWAMI
 *
 */
public class AddController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int number1 = Integer.parseInt(request.getParameter("num1"));
		int number2 = Integer.parseInt(request.getParameter("num2"));
		int sum = number1 + number2;
		System.out.println(number1 + " " + number2 + " = " + sum);
		PrintWriter out = response.getWriter();
		out.println(sum);
	}
	

}

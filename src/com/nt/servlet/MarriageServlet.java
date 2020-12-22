package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
	
		PrintWriter pw=null;
		String name=null,gender=null;
		int age=0;
		//get PrintWriter
		pw=res.getWriter();
		//set Response ContentType
		res.setContentType("text/html");
		//read data from request param value
		name=req.getParameter("pname");
		age=Integer.parseInt(req.getParameter("page"));
		gender=req.getParameter("gender");
		//write bussnenss logic or request processing logic
		
		if(gender.equalsIgnoreCase("M")) {
			if(age>=21) {
				pw.println("<h1 style='color:green;text-align:center'>Mr."+name+"u r elgible for the marriage</h1>");
			}//if
			else {
				pw.println("<h1 style='color:red;text-align:center'>Mr."+name+"u r not elgible for the marriage</h1>");
			}//else
		}//if
		else if(gender.equalsIgnoreCase("F")) {
			if(age>=18) {
				pw.println("<h1 style='color:green;text-align:center'>Mss."+name+"u r elgible for the marriage</h1>");
			}//if
			else {
				pw.println("<h1 style='color:green;text-align:center'>Mss."+name+"u r not elgible for the marriage</h1>");
			}//else
		}//else if
		else {
			pw.println("<h1 style='color:red;text-align:center'>Unknown Gender</h1>");
		}
		//add graphical hyperlink
		pw.println("<br> <a href='http://localhost:3030/MarriageApp/input.html'><img src='aaanchal.jpg' width='50'height='50'/></a>");
		
		//close stream
		pw.close();
		
	}//doGet(-,-)
}//class

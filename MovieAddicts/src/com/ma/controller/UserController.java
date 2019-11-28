package com.ma.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ma.dao.UserDAO;
import com.ma.dao.UserDAOImplementation;
import com.ma.model.User;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 2L;
    private UserDAO dao;
    public static String INDEX = "/index.jsp";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
        dao = new UserDAOImplementation();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String action = request.getParameter("action");

		if (action.equalsIgnoreCase("logout")) {
	    	HttpSession session = request.getSession();

	        session.invalidate();
	        response.sendRedirect("index.jsp");
	        System.out.println(12121323);
			
		}	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String action = request.getParameter("action");



	     if (action.equalsIgnoreCase("register")){
        User user = new User();
        String userid = request.getParameter("userid");
        user.setUserid( request.getParameter( "userid" ) );
        user.setUserpassword( request.getParameter( "userpassword" ) );

        boolean addUserSuccess = dao.addUser(user);
        
        if (addUserSuccess) {
        	HttpSession session = request.getSession();
        	session.setAttribute("userid", userid);
        	PrintWriter out = response.getWriter();  
        	response.setContentType("text/html");  
        	out.println("<script type=\"text/javascript\">");  
        	out.println("alert('Account successfully created.');");  
        	out.write("setTimeout(function(){window.location.href='index.jsp'},1000);");
        	out.println("</script>");
        } else {
        	PrintWriter out = response.getWriter();  
        	response.setContentType("text/html");  
        	out.println("<script type=\"text/javascript\">");  
        	out.println("alert('Email has been used. Try other account.');");  
        	out.write("setTimeout(function(){window.location.href='login.jsp'},1000);");
        	out.println("</script>");
        	//request.getRequestDispatcher("login.jsp").forward(request, response);
        } 


	} else if (action.equalsIgnoreCase("login")){
		String userid = request.getParameter("userid");
		String userpassword = request.getParameter("userpassword");
		User user = dao.getUserByID(userid, userpassword);
	
        if(userid.equals(user.getUserid()) && userpassword.equals(user.getUserpassword())) {
        	HttpSession session = request.getSession();
    	session.setAttribute("userid", userid);
    	response.sendRedirect("index.jsp");	
        } else {
	
 
	
	
    	PrintWriter out = response.getWriter();  
    	response.setContentType("text/html");  
    	out.println("<script type=\"text/javascript\">");  
    	out.println("alert('Wrong email or password');");  
    	out.write("setTimeout(function(){window.location.href='login.jsp'},1000);");
    	out.println("</script>");

	
	
	
        }	
	} 
	}

}

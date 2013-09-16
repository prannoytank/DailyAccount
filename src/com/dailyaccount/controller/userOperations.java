package com.dailyaccount.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dailyaccount.util.HibernateUtil;
import com.dailyaccount.util.user;

/**
 * Servlet implementation class userOperations
 */
@WebServlet("/userOperations")
public class userOperations extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userOperations() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
        
      
		
		
		
        
		
		
		
	}

	
    public static user save(user employee) {
    	try
    	{
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
 
        int id = (Integer) session.save(employee);
        employee.setUserid(id);
        
        
        session.beginTransaction();
 
       
         
        session.getTransaction().commit();
         
        session.close();
    	}
    	catch(Exception e)
    	{
    		System.out.print(e.getMessage());
    	}
        return employee;
        
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username=request.getParameter("_username");
		int age=Integer.parseInt(request.getParameter("_age"));
		
		
		user empl = new user(username,age);
        empl = save(empl);
	}

}

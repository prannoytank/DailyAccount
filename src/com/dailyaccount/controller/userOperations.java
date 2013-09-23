package com.dailyaccount.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dailyaccount.beans.user;
import com.dailyaccount.model.UserActivityModel;
import com.dailyaccount.util.HibernateUtil;

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
		
		
		String action=request.getParameter("_action");
		
		if(action.equalsIgnoreCase("login"))
		{
			String nickname=request.getParameter("_nickname");
			String password=request.getParameter("_password");
			
			UserActivityModel u=new UserActivityModel ();
			boolean result=u.loginCheck(nickname, password);
			if(result==true)
			getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
			else
				getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
		}
		else
		{
		
		
		
		
		
		String username=request.getParameter("_fullname");
		String nickname=request.getParameter("_nickname");
		String password=request.getParameter("_password");
		String address=request.getParameter("_address");
		String birthdate=request.getParameter("_birthdate");
		String contact=request.getParameter("_cnumber");
		String permanent=request.getParameter("_pnumber");
		String g=request.getParameter("_gender");
		char gender=g.charAt(0);
		
		
		user empl = new user(username,nickname,password,gender,birthdate,contact,permanent,address);
        empl = save(empl);
		}
	}

}

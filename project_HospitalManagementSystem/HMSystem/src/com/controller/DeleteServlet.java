package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Patient;
import com.utils.HBUtils;

/**
 * Servlet implementation class DeleteServlet
 */
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Patient p=new Patient();
		
	 Session s= HBUtils.getSessionFactory().openSession();
	 Transaction tx=s.beginTransaction();
	 p.setPid(Integer.parseInt(request.getParameter("patientId")));
	 s.delete(p);
	 tx.commit();
	 s.close();
	 response.sendRedirect("all_patient.jsp");
	}

}

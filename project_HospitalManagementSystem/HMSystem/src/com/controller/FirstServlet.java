package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.model.Patient;
import com.utils.HBUtils;

public class FirstServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Patient p=new Patient();

		p.setPname(req.getParameter("pname"));
		p.setPcity(req.getParameter("pcity"));
		p.setPdescrption(req.getParameter("pdescrption"));
		Session session=HBUtils.getSessionFactory().openSession(); 
		Transaction tx=session.beginTransaction();		
		session.save(p); 
		tx.commit();
		session.close();
		resp.sendRedirect("new_patient.jsp");
		
	}

}
;

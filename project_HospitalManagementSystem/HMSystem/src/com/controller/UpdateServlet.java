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
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int patientId = Integer.parseInt(request.getParameter("patientId"));
		String pname = request.getParameter("pname");
		String pcity = request.getParameter("pcity");

		Session session = HBUtils.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			Patient patient = session.get(Patient.class, patientId);
			if (patient != null) {
				patient.setPname(pname);
				patient.setPcity(pcity);
				session.update(patient);
				transaction.commit();
				response.sendRedirect("all_patient.jsp"); // Redirect to a success page after the update
			} else {
				// Handle case when patient with given ID is not found
				response.sendRedirect("error.jsp"); // Redirect to an error page
			}
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
			response.sendRedirect("error.jsp"); // Redirect to an error page if an exception occurs
		} finally {
			session.close();
		}
	}

}

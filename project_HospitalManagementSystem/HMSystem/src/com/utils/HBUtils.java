package com.utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Patient;

public class HBUtils {
	public static Properties setProperties() {
		Properties p = new Properties();
		p.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		p.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/db1");
		p.put("hibernate.connection.username", "root");
		p.put("hibernate.connection.password", "Root@123");
		p.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		p.put("hibernate.hbm2ddl.auto", "update");
		p.put("hibernate.show_sql", "true");
		p.put("hibernate.format_sql", "true");
		return p;
	
	}
	public static SessionFactory getSessionFactory() {
		SessionFactory sf= null;
		Configuration con = new Configuration().setProperties(setProperties()).addAnnotatedClass(Patient.class);
		sf= con.buildSessionFactory();
		return sf;
	}

}

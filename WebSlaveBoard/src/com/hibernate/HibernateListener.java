package com.hibernate;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HibernateListener implements ServletContextListener {
	ServletContext context;

	@Override
	public void contextDestroyed(ServletContextEvent contextEvent) {
		System.out.println("Context Destroyed");
		context = contextEvent.getServletContext();
		Hibernateutil.getSessionFactory().close();

	}

	@Override
	public void contextInitialized(ServletContextEvent contextEvent) {
		System.out.println("Context Created");
		Hibernateutil.getSessionFactory();
		context = contextEvent.getServletContext();
	}

}

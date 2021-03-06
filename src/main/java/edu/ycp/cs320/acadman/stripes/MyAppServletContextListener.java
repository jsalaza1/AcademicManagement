package edu.ycp.cs320.acadman.stripes;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import edu.ycp.cs320.acadman.controller.Controller;
import edu.ycp.cs320.acadman.persist.DatabaseProvider;
import edu.ycp.cs320.acadman.persist.FakeDatabase;
import edu.ycp.cs320.acadman.persist.SQLiteDatabase;

public class MyAppServletContextListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("ServletContextListener destroyed");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("ServletContextListener started");
		DatabaseProvider.setInstance(new SQLiteDatabase());
		Controller.Setup();
	}

}

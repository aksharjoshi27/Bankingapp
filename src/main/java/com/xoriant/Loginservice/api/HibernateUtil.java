package com.xoriant.Loginservice.api;
 
import org.hibernate.SessionFactory;

//below configuration import is not there in sirs example
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
private static SessionFactory factory;
	
	public static SessionFactory getSessionFactory() {
		 Configuration config = new Configuration();
		  config.configure();
		  // local SessionFactory bean created
		  factory = config.buildSessionFactory();
		return factory;
	}
	
	public static void main(String[] args) {
		getSessionFactory();
	}
}
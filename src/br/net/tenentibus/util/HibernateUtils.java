package br.net.tenentibus.util;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;




public class HibernateUtils {
	

	    private static final SessionFactory sessionFactory = buildSessionFactory();

	    private static SessionFactory buildSessionFactory() {
	        try {
	            
	        	Configuration configuration = new Configuration();
	        	configuration.configure();
	        	
	        	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
	        			.applySettings(configuration.getProperties()).build();
	        	SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	        	// Create the SessionFactory from hibernate.cfg.xml
	          return sessionFactory;
	        }
	        catch (Throwable ex) {
	            // Make sure you log the exception, as it might be swallowed
	            System.err.println("Initial SessionFactory creation failed." + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
			
	    }

	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }

	}



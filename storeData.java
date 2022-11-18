package myfirsthibernatemaven._hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

//import myfirsthibernatemaven._hibernate.persistentclass;

public class storeData {

	public static void main(String[] args) {
		//it will load all configurations from the configuration file , it fetches the information from configuration file
				//Object relation mapping --> we don't need to worry about back working . 
				StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build() ; //Step 1 
				
		//Metadata -->data about data  (we have to access the data inside a table , say all the tables inside schema makes meta data )
				
				Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build(); //Step 2
				
				
				SessionFactory factory = meta.getSessionFactoryBuilder().build() ; //Step 3 
				//SessionFactory s = HibernateUtilities ;
				//to identify one session form the session factory 
				Session session = factory.openSession() ;
				
				//Transaction begins !! 
				
				Transaction t = session.beginTransaction( ) ;  
				
				
				
				
				persistentclass obj = new persistentclass () ;
				obj.setName("ssadasdasfgrsgg");
				obj.setId(232);
				obj.setPrice(234);
				session.save(obj) ;
				t.commit();
				factory.close() ;
				session.close () ;
				

	}

}

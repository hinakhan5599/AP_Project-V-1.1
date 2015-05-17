package model;
import java.util.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import model.boards;
//import model.hibernate_session;

public class MainApp {

	public static void main(String[] args) {

	         boards em1 = new boards();
	 
	         boards em2 = new boards();
	 
	         boards em3 = new boards();
	 
	          
	 
	        System.out.println(" =======CREATE =======");
	 
	        Integer a = create(em1);
	 
	        Integer b = create(em2);
	 
	        Integer c = create(em3);
	 
	         System.out.println(" =======READ =======");
	 
	         List<boards> ems1 = read_database();
	         for(boards e: ems1) {
	 
	             System.out.println(e.toString());
	 
	         }
	         
	         System.exit(0);
	}
	 
	       //System.out.println(" =======UPDATE =======");
	 
	       //  em1.setAge(44);
	 
	       //  em1.setName("Mary Rose");
	 
	       //  update(em1);
	
	        // System.out.println(" =======READ =======");
	
	       //  List<Employee> ems2 = read();
	 
	       //  for(Employee e: ems2) {
	 
	       //      System.out.println(e.toString());
	
	        // }
	 
	       //  System.out.println(" =======DELETE ======= ");
	 
	      //   delete(em2.getId());
	 
	       //  System.out.println(" =======READ =======");
	 //
	     //    List<Employee> ems3 = read();
	//
	    //     for(Employee e: ems3) {
	 
	    //         System.out.println(e.toString());
	 
	     //    }
	 
	      //   System.out.println(" =======DELETE ALL ======= ");
	 
	      //   deleteAll();
	 
	      //   System.out.println(" =======READ =======");
	 
	     //    List<Employee> ems4 = read();
	
	     //    for(Employee e: ems4) {
	 
	      //       System.out.println(e.toString());
	 
	      //   } 
	 //
	         
	 
 
	  
	
	    public static SessionFactory getSessionFactory() {
	 
	         Configuration configuration = new Configuration().configure();
	 
	         StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	 
	         SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
	 
	         return sessionFactory;
	 
	    
	    }
	  
	 
	     public static Integer create(boards e) {
	 
	         Session session = getSessionFactory().openSession();
	 
	         session.beginTransaction();
	 
	 
	         session.getTransaction().commit();
	 
	         session.close();
	 
	         System.out.println("Successfully created " + e.toString());
	 
	         return e.getId();
	 
	  
	 
	     }
	 
	  
	 
	     public static List<boards> read_database() {
	 
	         Session session = getSessionFactory().openSession();
	 
	         @SuppressWarnings("unchecked")
	 
	         List<boards> board = session.createQuery("FROM boards").list();
	 
	         session.close();
	 
	         System.out.println("Found " + board.size() + " Boards");
	 
	         return board;
	 
	  
	 
	     }
	     
	     }
	 
	  
	 
	 /*    public static void update(Employee e) {
	 
	         Session session = getSessionFactory().openSession();
	 
	         session.beginTransaction();
	 
	         Employee em = (Employee) session.load(Employee.class, e.getId());
	 
	 
	         em.setAge(e.getAge());
	 
	         session.getTransaction().commit();
	 
	         session.close();
	 
	         System.out.println("Successfully updated " + e.toString());
	 
	  
	 
	     }
	 
	  
	 
	     public static void delete(Integer id) {
	 
	         Session session = getSessionFactory().openSession();
	
	         session.beginTransaction();
	 
	         Employee e = findByID(id);
	 
	         session.delete(e);
	 
	         session.getTransaction().commit();
	 
	         session.close();
	 
	         System.out.println("Successfully deleted " + e.toString());
	 
	  
	 
	     }
	 
	  
	 
	     public static Employee findByID(Integer id) {
	 
	         Session session = getSessionFactory().openSession();
	 
	         Employee e = (Employee) session.load(Employee.class, id);
	 
	         session.close();
	 
	         return e;
	 
	     }
	 
	      
	 
	     public static void deleteAll() {
	 
	         Session session = getSessionFactory().openSession();
	 
	         session.beginTransaction();
	 
	         Query query = session.createQuery("DELETE FROM Employee ");
	 
	         query.executeUpdate();
	 
	         session.getTransaction().commit();
	 
	         session.close();
	 
	         System.out.println("Successfully deleted all employees.");
	
	  
	 
	     }
	
	      
	 
	 } */
	     



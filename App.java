package com.hibernate.HibApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Info inf = new Info();
        inf.setRollno(112);
        inf.setName("Ujjwal");
        inf.setMarks(753);
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Info.class);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        		
        SessionFactory sf = con.buildSessionFactory(reg);
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
       // session.save(inf);
         inf = (Info)session.get(Info.class,112);
        tx.commit();
         System.out.println(inf);
    }
}

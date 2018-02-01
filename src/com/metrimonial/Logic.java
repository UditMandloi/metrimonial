/*package com.metrimonial;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.hibernate.*;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;


public class Logic {

	public static void main(String[] args) {
		AnnotationConfiguration cfg=(AnnotationConfiguration) new AnnotationConfiguration().configure("Hibernate.cfg.xml");
	    SessionFactory factory = cfg.buildSessionFactory();
	    Session session = factory.openSession();
	    Transaction  tx = session.beginTransaction();
		RegistrationDTO registrationDTO=new RegistrationDTO();
		registrationDTO.setId(108);
		registrationDTO.setName("varsha");
		registrationDTO.setAge(26);
		registrationDTO.setCast("gurjar");
		registrationDTO.setHeight(4.9);
		registrationDTO.setColor("fair");
		registrationDTO.setVeg_nonveg("vegiterian");
		registrationDTO.setEmployment("no");
		registrationDTO.setEmail("neha@gmail.com");
		registrationDTO.setContact("9826012348");
		registrationDTO.setCity("dhar");
		registrationDTO.setState("m.p.");
	//	session.save(registrationDTO);
		tx.commit();
		session.close();
		
		//SandipChoice sc=new SandipChoice("Teli", 19, "fair", 5.2);
		
		Session session1=factory.openSession();
		
		Criteria criteria=session1.createCriteria(RegistrationDTO.class);
		criteria.add(Restrictions.eq("state", "m.p."));
		
		List list=criteria.list();
		Collections.sort(list, new MyComparator());

		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			RegistrationDTO reg=(RegistrationDTO) itr.next();
		//	System.out.println("name="+reg.getName()+", caste="+reg.getCast()+", age="+reg.getAge()+", color="+reg.getColor()+", height="+reg.getHeight());
				if(sc.cast.equals(reg.getCast())) {
				if(sc.age<=reg.getAge()) {
					if(sc.color.equals(reg.getColor())) {
						System.out.println("name="+reg.getName()+", caste="+reg.getCast()+", age="+reg.getAge()+", color="+reg.getColor()+", height="+reg.getHeight());
					}
				}
			}
		//	
		}	
	}
}*/
package controller;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import model.Plant;

public class SeePlantDetails {

	public void viewDetails(String PlantName) {
//
		SessionFactory sessionF = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionF.openSession();

	
	// *****************************	 IT IS NOW DEPRECATED  ******************************
//
//		System.out.println("Display the All Plant Expensive than 20 Rs");
//
//		
//		Criteria criteria = session.createCriteria(Plant.class);
//		
//		criteria.add(Restrictions.eq("name",PlantName));
//
//		
//		List<Plant> plantList = criteria.list ();
//
//		for (Plant p : plantList) {
//			System.out.println(p);
//		}
//	}

//  We USE CRITERIA BUILDER NOW ------------------------------------->

		CriteriaBuilder builder = session.getCriteriaBuilder(); //Interface
		
		CriteriaQuery<Plant> query = builder.createQuery(Plant.class); //use for creating the Query.
		
		Root<Plant> root = query.from(Plant.class);

		query.select(root).where(builder.gt(root.get("price"), 150));

		List<Plant> list = session.createQuery(query).getResultList();

		for (Plant p : list) {
			System.out.println(p);
		}

	}
}

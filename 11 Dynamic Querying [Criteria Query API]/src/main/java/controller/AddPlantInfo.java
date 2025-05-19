package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Plant;

public class AddPlantInfo {
	public void addPlant() {

		SessionFactory sessionfactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();

		Plant p1 = new Plant();
		p1.setName("Bamboo");
		p1.setPrice(200);

		Plant p2 = new Plant();
		p2.setName("Tulsi");
		p2.setPrice(25);

		Plant p3 = new Plant();
		p3.setName("Rose");
		p3.setPrice(100);

		session.save(p1);
		session.save(p2);
		session.save(p3);
		transaction.commit();
		session.close();

		System.out.println("Information Added.");
	}

}

package operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class AddEmployee {

	public void addEmp(Employee emp) {

		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory = config.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(emp);
		transaction.commit();
		session.close();
		System.out.println("Employee Added");

	}

}

package operation;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;
import java.util.List;

public class ViewEmployee {

	public void viewEmp() {

		Configuration configure = new Configuration();
		configure.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory = configure.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();

//		It is use to retrive the Result from Database.

		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> empList = criteria.list();

		for (Employee emp : empList) {
			System.out.println(emp);
		}

//		for (int i = 1; i < empList.size(); i++) {
//			System.out.println(empList.get(i));
//		}

	}
}



// 1.
// Criteria is a class in the Hibernate Core API.
// build and execute queries in a more programmatic and object-oriented way,
//  rather than writing traditional SQL or HQL (Hibernate Query Language) queries.


// 2

// criteria.list() executes the query built using the Criteria API in Hibernate.
// It returns a List of results based on the conditions (filters, ordering) you've defined.
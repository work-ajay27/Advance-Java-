package operation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class SearchEmployee {

	public void searchEmp(int searchEmp) {

		Configuration configure = new Configuration();
		configure.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory = configure.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();

		Employee employee = session.get(Employee.class, searchEmp);

		if (employee !=null) {
			
			System.out.println(employee);
			
		} else {
			System.out.println("No Data Found");
		}

	}
}

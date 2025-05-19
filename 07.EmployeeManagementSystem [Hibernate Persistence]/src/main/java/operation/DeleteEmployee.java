package operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class DeleteEmployee {

	public void deleteEmp(int DelEmp) {

		Configuration configure = new Configuration();
		configure.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory = configure.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();

		Employee employee = session.get(Employee.class, DelEmp);

		if (employee != null) {

			session.delete(employee);
			System.out.println("Employee Deleted Succesfully");
		} else {
			System.out.println("No Employee Found");
		}
		transaction.commit();
		session.close();
	}

}

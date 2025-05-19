package operation;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class UpdateEmployee {
	Scanner sc = new Scanner(System.in);

	public void updateEmp(int updateEmp) {

		Configuration configure = new Configuration();
		configure.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory = configure.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();

		Employee employee = session.get(Employee.class, updateEmp);

		if (employee != null) {
			System.out.println("Enter Employee name to update");
			String empname = sc.next();
			System.out.println("Enter Employee Department to update");
			String empDept = sc.next();
			System.out.println("Enter Employee Salary to Update");
			int empSal = sc.nextInt();

			// This way we update the things
			employee.setEmpName(empname);
			employee.setEmpDept(empDept);
			employee.setEmpSal(empSal);

			System.out.println("Employee Details Updated Succesfully.");

		} else {
			System.out.println("No Employee Found");
		}
		session.getTransaction().commit();
		session.close();

	}

}

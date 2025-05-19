package controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import model.Employee;
//import net.bytebuddy.build.Plugin.Factory;

public class MyMainClass {
	public static void main(String[] args) {
		
		SessionFactory sessionfacory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionfacory.openSession();

		addEmployee(session);

//     ********		USE OF CRITERIA TO FETCH EMPLOYEE FROM DATABASE.    ********
		System.out.println("Displating Required Data");
		System.out.println("Display the All Employee Salary Greater than 50000");
		getEmployeeSalary(session, 56666);
		System.out.println("Success");

		System.out.println("Displating Required Data");
		System.out.println("Employee with specific Department");

		getEmployeesByDesignation(session, "HR");
		System.out.println("Success");

		session.close();
		sessionfacory.close();

	}

	private static void addEmployee(Session session) {
		Transaction transaction = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setEmpName("Priyanka");
		e1.setEmpDept("HR");
		e1.setEmpSal(58975);

		Employee e2 = new Employee();
		e2.setEmpName("Vedant");
		e2.setEmpDept("Finance");
		e2.setEmpSal(56987);

		session.save(e1);
		session.save(e2);
		transaction.commit();
	}

//	We are Using Criteria Here --->
	private static void getEmployeeSalary(Session session, int salary) {

//		This is the 1st way of creating the Criteria.
		// ******  createCriteria() this method is now Deprecated & replace with Criteria Query API. *************
		Criteria criteria = session.createCriteria(Employee.class);

//		Now we need to add the Restriction (filter display the salary >50000)
		criteria.add(Restrictions.gt("empSal", salary)); // gt= greater than. , "Salary" => Column Name , salary=value

//		Now Execute The Query and Get the Result,
		List<Employee> empList = criteria.list();

		for (Employee emp : empList) {
			System.out.println(emp);
		}

	}

	private static void getEmployeesByDesignation(Session session, String department) {
//
//		Criteria criteria = session.createCriteria(Employee.class);
//
//		criteria.add(Restrictions.gt("Salary", salary)); // gt= greater than. , "Salary" => Column Name , salary=value
//
//		List<Employee> empList = criteria.list();
//
//		for (Employee emp : empList) {
//			System.out.println(emp);
//		}
//

		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("empDept", department));

		List<Employee> empDeptList = criteria.list();

		for (Employee emp : empDeptList) {
			System.out.println(emp);
		}

	}

}

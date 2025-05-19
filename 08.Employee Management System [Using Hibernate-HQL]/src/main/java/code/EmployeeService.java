package code;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import code.Employee;

public class EmployeeService {

//		Step 1: Build Session Factory

	private static SessionFactory sessionfactory = new Configuration().configure("hibernate.cfg.xml")
			.buildSessionFactory();

//	Step2 : Create Method To Add Employeee

	public void addEmployee(String name, String department, int salary) {

		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();

//		Create Employee Object

		Employee emp = new Employee();
		emp.setEmpName(name);
		emp.setSalary(salary);
		emp.setEmpDept(department);

		session.save(emp);
		transaction.commit();
		session.close();

	}

//	Step 2 : Fetch Employee Details Using HQL 
//	we receive emp Details in collection
	public List<Employee> getEmpDetails() {

		Session session = sessionfactory.openSession();
		String HQL = "from Employee"; // (it is just like select * from Employee)

		Query<Employee> query = session.createQuery(HQL, Employee.class);

		List<Employee> employees = query.getResultList();

		return employees;
	}

//2.	Delete Employee with Employee Id

	public void deleteEmployee(int id) {
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();

		String HQL = "delete from Employee e where e.id=:id";
		Query query = session.createQuery(HQL);

		query.setParameter("id", id);
		query.executeUpdate();
		transaction.commit();
		session.close();

	}

	public static void main(String[] args) {

		EmployeeService service = new EmployeeService();
		service.addEmployee("John", "IT", 78450);
		service.addEmployee("Striver", "HR", 8550);
		service.addEmployee("Sara", "Marketing", 48550);
		service.addEmployee("Priya", "BPO", 62500);

		System.out.println("\u001B[32mEmployee Information Saved. :)\u001B[0m");

//		we are printing information here without toString method(). 

		for (Employee emp : service.getEmpDetails()) {
			System.out.println("Emp Name :" + emp.getEmpName());
			System.out.println("Emp Salary :" + emp.getSalary());
			System.out.println("Emp Department :" + emp.getEmpDept());

			System.out.println(" *****************");
		}

		service.deleteEmployee(4);
		System.out.println("Employee Deleted");

	}

}

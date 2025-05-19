package controller;

import java.util.Scanner;
import com.model.Employee;
import operation.AddEmployee;
import operation.DeleteEmployee;
import operation.SearchEmployee;
import operation.UpdateEmployee;
import operation.ViewEmployee;

public class MyMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("Welcome to Employee Management System.");
			System.out.println("1.Add Employee");
			System.out.println("2.View Employee");
			System.out.println("3.Search Employee");
			System.out.println("4.Update Employee");
			System.out.println("5.Delete Employee");
			System.out.println("6.Exit From System");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter Emp ID");
				int EmpID = sc.nextInt();
				System.out.println("Enter Emp Name");
				String EmpName = sc.next();
				System.out.println("Enter Emp Salary");
				int EmpSal = sc.nextInt();
				System.out.println("Enter Emp Department");
				String EmpDept = sc.next();

				Employee emp = new Employee();
				emp.setEmpID(EmpID);
				emp.setEmpName(EmpName);
				emp.setEmpSal(EmpSal);
				emp.setEmpDept(EmpDept);

				new AddEmployee().addEmp(emp);
				break;

			case 2:
				System.out.println("***************  Employee Details are ***************");
				new ViewEmployee().viewEmp();
				break;

//					System.out.println("3.Search Employee");
			case 3:
				System.out.println("Enter Employee ID to search Employee");
				int searchEmp = sc.nextInt();
				new SearchEmployee().searchEmp(searchEmp);

				break;

			case 4:
				System.out.println("Enter Id to update Employee Information.");
				int UpdateEmp = sc.nextInt();
				new UpdateEmployee().updateEmp(UpdateEmp);
				break;

			case 5:
				System.out.println("Enter Employee ID to delete Employee");
				int DelEmp = sc.nextInt();

				new DeleteEmployee().deleteEmp(DelEmp);
				break;
			case 6:
				break;

			}
			System.out.println("Do You want to continue ?");
			System.out.println("1.Continue. 0.Close System");
			choice = sc.nextInt();

			if (choice > 6 || choice == 0) {
				System.out.println("Thank You.");
				break;
			}

		} while (choice != 5);

	}
}

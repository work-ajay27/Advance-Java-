package Student;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Operation operation = new Operation();

		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("~ Welcome to Student Management System ~");

		do {

			System.out.println("1.Add Student");
			System.out.println("2.Display Student");
			System.out.println("3.Search Student");
			System.out.println("4.Delete Student");
			System.out.println("5.Exit");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter Your Name");
				String name = sc.next();

				System.out.println("Enter Your Age");
				int age = sc.nextInt();

				System.out.println("Enter Your College");
				String college = sc.next();

				System.out.println("Enter Your ID");
				int ID = sc.nextInt();

				Student obj = new Student(ID, name, age, college);

				operation.addStudent(obj);

				System.out.println("Student Added in the System");
				break;

			case 2:
				operation.displayStudent();
				break;
			case 3:
				System.out.println("Enter ID to Seach Student");
				int StudId = sc.nextInt();
				operation.SearchStudent(StudId);
				break;
			case 4:
				System.out.println("Enter StudentID to Delete Record");
				int deleteID = sc.nextInt();
				operation.deleteStudentInfo(deleteID);
				break;
			case 5:
				System.out.println("Thank You.");
				break;
			}
		} while (choice != 5);
	}
}

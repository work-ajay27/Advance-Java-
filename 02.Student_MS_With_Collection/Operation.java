package Student;

import java.util.ArrayList;

public class Operation {

	ArrayList<Student> Stud;

	Operation() {
		Stud = new ArrayList<Student>();

	}

//	Add into ArrayList
	public void addStudent(Student stud) {
		Stud.add(stud);
	}

//Show Student of ArrayList
	public void displayStudent() {

		if (Stud.isEmpty()) {
			System.out.println("No Student Found");
		} else {

			for (Student e : Stud) {
				System.out.println(e);
			}
		}
	}

//	Search Student
	Student student = new Student();
	int count;

	public void SearchStudent(int StudId) {

		for (Student e : Stud) {
			if (StudId == e.getStudId()) {
				System.out.println(e);
				count++;
			} else if (count > 0) {
				System.out.println("**** No Record Found ****");
			}
		}
	}

//Delete Student Information

	public void deleteStudentInfo(int deleteID) {

		Student removeStud = null;

		for (Student e : Stud) {

			if (e.getStudId() == deleteID) {
				removeStud = e;
				break;
			}
		}

		if (removeStud != null) {
			Stud.remove(removeStud);
			System.out.println("Student with Stud Id :" + deleteID + " is Removed.");
		} else {
			System.out.println("Student with Stud Id :" + deleteID + " is not found");
		}

	}
}
   

   
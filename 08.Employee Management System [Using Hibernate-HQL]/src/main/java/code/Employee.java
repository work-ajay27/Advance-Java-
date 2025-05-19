package code;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int empID;
	String EmpName;
	String EmpDept;
	int Salary;

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getEmpDept() {
		return EmpDept;
	}

	public void setEmpDept(String empDept) {
		EmpDept = empDept;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

//	@Override
//	public String toString() {
//		return "Employee [empID=" + empID + ", EmpName=" + EmpName + ", EmpDept=" + EmpDept + ", Salary=" + Salary
//				+ "]";
//	}

}

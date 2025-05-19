package model;

import javax.persistence.Column;
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
	int id;

	@Column(name = "empName")
	String empName;
	@Column(name = "empDept")
	String empDept;
	@Column(name = "empSal")
	int empSal;

	
//	public Employee(int id, String empName, String empDept, int empSal) {
//		super();
//		this.id = id;
//		this.empName = empName;
//		this.empDept = empDept;
//		this.empSal = empSal;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empDept=" + empDept + ", empSal=" + empSal + "]";
	}

}

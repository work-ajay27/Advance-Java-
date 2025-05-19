package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	int EmpID;
	String EmpName;
	int EmpSal;
	String EmpDept;

	public Employee(int empID, String empName, int empSal, String empDept) {
		super();
		EmpID = empID;
		EmpName = empName;
		EmpSal = empSal;
		EmpDept = empDept;
	}

	public Employee() {

	}

	public int getEmpID() {
		return EmpID;
	}

	public void setEmpID(int empID) {
		EmpID = empID;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public int getEmpSal() {
		return EmpSal;
	}

	public void setEmpSal(int empSal) {
		EmpSal = empSal;
	}

	public String getEmpDept() {
		return EmpDept;
	}

	public void setEmpDept(String empDept) {
		EmpDept = empDept;
	}

	@Override
	public String toString() {
		return "Employee [EmpID=" + EmpID + ", EmpName=" + EmpName + ", EmpSal=" + EmpSal + ", EmpDept=" + EmpDept
				+ "]";
	}

}

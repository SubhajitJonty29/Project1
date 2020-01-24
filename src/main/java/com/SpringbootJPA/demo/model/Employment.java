package com.SpringbootJPA.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employment {

	@Id
	int EmpID;
	String EmpName;
	String EmpEmail;
	String EmpDesignation;
	int EmpRank;
	String EmpGrade;
	
	
	
	@Override
	public String toString() {
		return "Employment [EmpID=" + EmpID + ", EmpName=" + EmpName + ", EmpEmail=" + EmpEmail + ", EmpDesignation="
				+ EmpDesignation + ", EmpRank=" + EmpRank + ", EmpGrade=" + EmpGrade + "]";
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
	public String getEmpEmail() {
		return EmpEmail;
	}
	public void setEmpEmail(String empEmail) {
		EmpEmail = empEmail;
	}
	public String getEmpDesignation() {
		return EmpDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		EmpDesignation = empDesignation;
	}
	public int getEmpRank() {
		return EmpRank;
	}
	public void setEmpRank(int empRank) {
		EmpRank = empRank;
	}
	public String getEmpGrade() {
		return EmpGrade;
	}
	public void setEmpGrade(String empGrade) {
		EmpGrade = empGrade;
	}
	
	
}

package com.RestOp.REST;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rest {
	
	@Id
	@GeneratedValue
	Long EmployeeId;
	
	String EmployeeName;
	String EmployeeLocation;
	String EmployeeEmail;
	public Long getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(Long employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeeLocation() {
		return EmployeeLocation;
	}
	public void setEmployeeLocation(String employeeLocation) {
		EmployeeLocation = employeeLocation;
	}
	public String getEmployeeEmail() {
		return EmployeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		EmployeeEmail = employeeEmail;
	}
	@Override
	public String toString() {
		return "Rest [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeeLocation="
				+ EmployeeLocation + ", EmployeeEmail=" + EmployeeEmail + "]";
	}
	
	
	

}

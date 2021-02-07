package com.empmgt.entities;

public class Department {

	private String departmentId;
	private String departmentName;

	public Department(String id, String name) {
		this.departmentId = id;
		this.departmentName = name;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String courseId) {
		this.departmentId = courseId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String name) {
		this.departmentName = name;
	}
}

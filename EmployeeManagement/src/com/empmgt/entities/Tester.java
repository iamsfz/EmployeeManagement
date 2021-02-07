package com.empmgt.entities;

public class Tester extends Employee {

	private String tool;

	public Tester(int id, String name, Department department, String tools) {
		super(id, name, department);
		this.tool = tools;
	}

	public String getTool() {
		return tool;
	}

	public void setTool(String tools) {
		this.tool = tools;
	}

}

package com.empmgt.entities;

public class Developer extends Employee {

	private String language;

	public Developer(int id, String name, Department department, String languages) {
		super(id, name, department);
		this.language = languages;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String languages) {
		this.language = languages;
	}

}

package com.samanecorp.struts1.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.samanecorp.struts1.dto.EmployeesDto;

public class EmployeesAction extends ActionSupport {

	private List<EmployeesDto> employeesList;
	HttpServletRequest request = ServletActionContext.getRequest();
	
	public String getAll () {
		
		employeesList = new ArrayList<>();
		employeesList.add(new EmployeesDto("test 1", "test1@test.com", "passer"));
		employeesList.add(new EmployeesDto("test 1", "test2@test.com", "passer12"));
		employeesList.add(new EmployeesDto("test 1", "test3@test.com", "passer43"));
		
		return "employees";
	}
	
	public String edit () {
		
		System.out.println(request.getParameter("emailEdit"));
		
		return this.getAll();
	}
	
	public String delete () {
		
		System.out.println(request.getParameter("emailDelete"));
		return this.getAll();
	}

	public List<EmployeesDto> getEmployeesList() {
		return employeesList;
	}

	public void setEmployeesList(List<EmployeesDto> employeesList) {
		this.employeesList = employeesList;
	}

}

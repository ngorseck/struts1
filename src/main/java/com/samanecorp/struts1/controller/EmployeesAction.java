package com.samanecorp.struts1.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.samanecorp.struts1.dto.EmployeesDto;

public class EmployeesAction extends ActionSupport {

	private Logger logger = LoggerFactory.getLogger(EmployeesAction.class);
	private List<EmployeesDto> employeesList;
	HttpServletRequest request = ServletActionContext.getRequest();
	private String emailEdit;
	private String emailDelete;
	public String getAll () {
		
		employeesList = new ArrayList<>();
		employeesList.add(new EmployeesDto("test 1", "test1@test.com", "passer"));
		employeesList.add(new EmployeesDto("test 1", "test2@test.com", "passer12"));
		employeesList.add(new EmployeesDto("test 1", "test3@test.com", "passer43"));
		
		return "employees";
	}
	
	public String edit () {
		
		logger.info("Email edit : {}", emailEdit);
		
		employeesList = new ArrayList<>();
		employeesList.add(new EmployeesDto("test 1", "test1@test.com", "passer"));
		employeesList.add(new EmployeesDto("test 1", "test2@test.com", "passer12"));
		employeesList.add(new EmployeesDto("test 1", "test3@test.com", "passer43"));
		
		return "employees";
	}
	
	public String delete () {
		
		logger.info("Email delete : {}", emailDelete);
		
		employeesList = new ArrayList<>();
		employeesList.add(new EmployeesDto("test 1", "test1@test.com", "passer"));
		employeesList.add(new EmployeesDto("test 1", "test2@test.com", "passer12"));
		employeesList.add(new EmployeesDto("test 1", "test3@test.com", "passer43"));
		
		return "employees";
	}

	public List<EmployeesDto> getEmployeesList() {
		return employeesList;
	}

	public void setEmployeesList(List<EmployeesDto> employeesList) {
		this.employeesList = employeesList;
	}

	public String getEmailEdit() {
		return emailEdit;
	}

	public void setEmailEdit(String emailEdit) {
		this.emailEdit = emailEdit;
	}

	public String getEmailDelete() {
		return emailDelete;
	}

	public void setEmailDelete(String emailDelete) {
		this.emailDelete = emailDelete;
	}

	
}

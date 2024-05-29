package com.samanecorp.struts1.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String email;
	private String password;
	
	
	public String login () {
		if (email.equals("test@test.com") && password.equals("passer")) {
			HttpServletRequest request = ServletActionContext.getRequest();
			request.getSession().setAttribute("username", email);
			
			return "welcome";
		} else {
			
			return "login";
		}
	}
	
	public String logout () {
		
		return "logout";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

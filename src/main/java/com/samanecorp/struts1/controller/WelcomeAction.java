package com.samanecorp.struts1.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction extends ActionSupport {

	public String welcome () {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		if (request.getParameter("message") != null) {
			String message = request.getParameter("message");
			System.out.println(message);
		}
		return "welcome";
	}
}

package com.samanecorp.struts1.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction extends ActionSupport {

	private Logger logger = LoggerFactory.getLogger(WelcomeAction.class);
	
	public String welcome () {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		if (request.getParameter("message") != null) {
			String message = request.getParameter("message");
			logger.info("{}", message);
		}
		return "welcome";
	}
}

package com.samanecorp.struts1.dto;

import java.io.Serializable;

public class EmployeesDto implements Serializable {

    private String fullName;
    private String email;
    private String password;

    
    public EmployeesDto() {
		super();
	}

	public EmployeesDto(String fullName, String mail, String passer) {
    	this.fullName = fullName;
        this.email = mail;
        this.password = passer;
    }

    
    
    public String getFullName() {
		return fullName;
	}



	public void setFullName(String fullName) {
		this.fullName = fullName;
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

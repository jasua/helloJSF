package com.bhel;

import javax.annotation.ManagedBean;

//author: nagaraju
//change A
//change B
//change C
//change XY
//another change
//version 2

@ManagedBean
public class FirstManagedBean {
	
	//Fix Bug
	private String firstName;
	private String lastName;
	
	public FirstManagedBean(){}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	//Change D
}

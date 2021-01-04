package com.myshop.app.vo;

import java.util.Objects;

public class Email {

	private String emailAddr;
	public Email(String email) {
		this.emailAddr = email;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null || !(obj instanceof Email)) {
			return false;
		}
		Email insertedEmail = (Email)obj;
		return Objects.equals(emailAddr,insertedEmail);
	}
	@Override
	public int hashCode() {
		return Objects.hash(emailAddr);
	}
	
	
}

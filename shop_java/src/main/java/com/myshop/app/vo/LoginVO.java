package com.myshop.app.vo;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import lombok.Getter;

@Getter
public class LoginVO {
	
	@NotNull
	private final Long seq;
	@NotNull
	private String id;
	@NotNull
	private Email email;
	@NotNull
	private String passwd;
	@NotNull
	private int loginCount;
	@NotNull
	private LocalDateTime lastLoginAt;
	@NotNull
	private final LocalDateTime createAt;
	
	public LoginVO(Long seq, String id, Email email, String passwd, int loginCount, LocalDateTime lastLoginAt,
			LocalDateTime createAt) {
		super();
		this.seq = seq;
		this.id = id;
		this.email = email;
		this.passwd = passwd;
		this.loginCount = loginCount;
		this.lastLoginAt = lastLoginAt;
		this.createAt = createAt;
	}


	private LoginVO(UserBuilder userBuilder) {
		this.seq= userBuilder.seq;
		this.email=userBuilder.email;
		this.passwd=userBuilder.passwd;
		this.loginCount=userBuilder.loginCount;
		this.lastLoginAt=userBuilder.lastLoginAt;
		this.createAt=userBuilder.createAt;
	}

	
	public static class UserBuilder{
		private Long seq;
		private Email email;
		private String passwd;
		private int loginCount;
		private LocalDateTime lastLoginAt;
		private LocalDateTime createAt;
		
		public UserBuilder userSeq(Long seq) {
			this.seq=seq;
			return this;
		}
		public UserBuilder userEmail(Email email) {
			this.email=email;
			return this;
		}
		public UserBuilder userPassWd(String passwd) {
			this.passwd=passwd;
			return this;
		}
		public UserBuilder userLoginCountAt(int logincountat) {
			this.loginCount=logincountat;
			return this;
		}
		public UserBuilder userLastLoginAt(LocalDateTime lastloginat) {
			this.lastLoginAt=lastloginat;
			return this;
		}
		public UserBuilder userCreateAt(LocalDateTime createat) {
			this.createAt=createat;
			return this;
		}
		public LoginVO build() {
			return new LoginVO(this);
		}
	}

}

package com.myshop.app.vo;

import java.time.LocalDateTime;

import lombok.Setter;

@Setter
public class LoginVO {
	
	private String id;
	private String pwd;
	private LocalDateTime lasttime;
	private LocalDateTime createtime;
	private String name;
	private String age;
	private long seq;

}

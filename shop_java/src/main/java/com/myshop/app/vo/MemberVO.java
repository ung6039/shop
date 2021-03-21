package com.myshop.app.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberVO {
	
	String memberID;
	String pwd;
	String name;
	String info;
	Date regate;
	Date birthday;
	String addr;
	String img;
	
}

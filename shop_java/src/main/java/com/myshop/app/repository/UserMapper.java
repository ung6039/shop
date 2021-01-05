package com.myshop.app.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.myshop.app.vo.LoginVO;

public interface UserMapper {

	@Insert("Insert into users(seq,passwd,logincount,lastdatetime,createat,email) "
			+ "values ( #{seq},#{passwd},#{logincount},#{lastdatetime},#{createat},#{email} )")
	public void user(LoginVO vo);
	@Select("")
	public String member();
}

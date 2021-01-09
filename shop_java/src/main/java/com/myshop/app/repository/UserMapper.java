package com.myshop.app.repository;

import java.util.Optional;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.myshop.app.vo.LoginVO;

public interface UserMapper {

	@Insert("Insert into users(seq,passwd,logincount,lastdatetime,createat,email) "
			+ "values ( #{seq},#{passwd},#{logincount},#{lastdatetime},#{createat},#{email} )")
	public void user(LoginVO vo);
	@Select("select email from users "
			+ "where email == #{email}")
	public Optional<LoginVO> member(String email);
}

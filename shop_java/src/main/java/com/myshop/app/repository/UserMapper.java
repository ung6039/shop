package com.myshop.app.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

	@Insert("")
	public void user();
	@Select("")
	public String member();
}

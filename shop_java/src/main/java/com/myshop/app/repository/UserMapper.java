package com.myshop.app.repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.myshop.app.vo.LoginVO;
import com.myshop.app.vo.MemberVO;

public interface UserMapper {
//
//	@Insert("Insert into users(seq,passwd,logincount,lastdatetime,createat,email) "
//			+ "values ( #{seq},#{passwd},#{logincount},#{lastdatetime},#{createat},#{email} )")
	public void user(LoginVO vo);
	@Select("select email from users "
			+ "where email == #{email}")
	public Optional<LoginVO> member(String email);
	
	@Insert("Insert into member(memberid,pwd,name,info,regdate,birthday,addr,img)"+
			" values(#{memberid},#{pwd},#{name},#{info},sysdate,#{birthday},#{addr},#{img} )")
	public void member_join(Map map);
	
	@Select("select * from member "+
			"where memberid = #{id} AND pwd = #{pwd}")
	public Optional<MemberVO> findId_member(Map map);
}

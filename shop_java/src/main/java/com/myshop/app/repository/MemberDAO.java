package com.myshop.app.repository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myshop.app.vo.MemberVO;

@Repository
public class MemberDAO {
	
	@Autowired
	UserMapper userMapper;
	
	public boolean save(Map map) {
		boolean success = false;
		System.out.println(map);
		try {
		userMapper.member_join(map);
		return success;
		}catch(Exception ex) {
			ex.printStackTrace();
			return success;
		}
	}

}

package com.myshop.app.repository;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

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
	
	public Optional<MemberVO> findId(Map map) {
		System.out.println(map.get("id")+" "+map.get("pwd"));
		Optional<MemberVO> vo = userMapper.findId_member(map);
		boolean state = true;
		String s = "";
		if(state) {
			System.out.println("1");
			return Optional.ofNullable(vo.get());
		}else {
			System.out.println("2");
			return Optional.empty();
		}
	}

}

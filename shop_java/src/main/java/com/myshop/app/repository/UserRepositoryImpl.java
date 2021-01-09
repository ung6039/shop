package com.myshop.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myshop.app.vo.LoginVO;
import com.myshop.app.vo.LoginVO.UserBuilder;

@Repository
public class UserRepositoryImpl implements UserRepository{
	
	@Autowired
	UserMapper usermapper;
	
	@Override
	public int save(LoginVO vo) {
		usermapper.user(vo);
		return 0;
	}

	@Override
	public Optional<LoginVO> findById(String email) {
		Optional<LoginVO> vo = usermapper.member(email);
		return vo;
	}

	@Override
	public List<LoginVO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}

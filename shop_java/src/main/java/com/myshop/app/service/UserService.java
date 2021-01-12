package com.myshop.app.service;

import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.myshop.app.repository.UserRepository;
import com.myshop.app.vo.LoginVO;


public class UserService {
	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	public int save(LoginVO vo) {
		int sucess=0;
		try {
			sucess = userRepository.save(vo);
		}catch(Exception ex) {
			sucess =1;
		}
		return sucess;
	};
	
	public boolean findId(String email){
		Optional<LoginVO> vo = userRepository.findById(email);
//		boolean bq = ;
		return false;
	}
}

package com.myshop.app.service;

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
}

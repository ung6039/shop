package com.myshop.app.repository;

import java.util.List;
import java.util.Optional;

import com.myshop.app.vo.LoginVO;

public interface UserRepository {
	int save(LoginVO vo);
	Optional<LoginVO> findById(String email);
	List<LoginVO> findAll();
}

package com.ds.gw.user.service;

import java.util.List;

import com.ds.gw.user.UserDto;

public interface UserService {
	List<UserDto> getList(UserDto dto); 
	void insertUser(UserDto dto);
	UserDto getView(UserDto dto);
	void updateUser(UserDto dto);
	void deleteUser(UserDto dto);
}

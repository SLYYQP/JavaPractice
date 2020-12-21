package com.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.test.entity.Page;
import com.test.entity.Score;
import com.test.entity.UserInfo;

public interface UserInfoMapper {
	UserInfo login(@Param("username") String username,@Param("password") String password);
	List<UserInfo> allinfo(Page page);
	int countuser(Page page);
	List<Score> score();
	UserInfo getUserById(@Param("userid") int id);
	
	int add(UserInfo user);
	int del(@Param("userid") int userid);
    int upperson(UserInfo user);
}

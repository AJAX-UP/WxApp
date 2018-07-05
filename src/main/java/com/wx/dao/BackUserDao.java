package com.wx.dao;
import com.wx.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;


@Repository
public interface BackUserDao {
	
	// 添加后台用户
	int insertUser(User user);
	
	// 查询所有用户
	List<User> selectAll();
	
	// 修改用户密码
	int updatePassword(User user);
}

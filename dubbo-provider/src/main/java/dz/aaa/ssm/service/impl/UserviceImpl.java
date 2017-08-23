package dz.aaa.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import dz.aaa.ssm.mapper.UserMapper;
import dz.aaa.ssm.po.User;
import dz.aaa.ssm.service.UserService;
@Service
public class UserviceImpl implements UserService {
    
	@Autowired
	UserMapper userMaper;
	
	
	@Override
	public List<User> selectAll() {
		PageHelper.startPage(1, 10);
		
		List<User> users = userMaper.selectList();
		PageInfo<User> pageInfo = new PageInfo<User>(users);
		pageInfo.getTotal();
		return users;
	}

}

package dz.aaa.ssm.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dz.aaa.ssm.po.User;
import dz.aaa.ssm.service.UserService;

@RestController
public class UserController extends BaseController<User>{
	
	@Autowired
	UserService userService;
	@RequestMapping("/demo.action")
	public Map<String,Object> getlist(){
	    return getReturnMessage(userService.selectAll());
	}	
}

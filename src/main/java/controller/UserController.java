package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import model.UserParam;
import service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService uservice;
	
	@RequestMapping(value="/test.do",method=RequestMethod.GET)
	public String requestUser(@RequestParam(required = true) Object Id){
		
		int id = Integer.valueOf(Id.toString());
		
		return uservice.queryUser(id).toString();
	}
	
	@RequestMapping(value="/add.do",method=RequestMethod.GET)
	public void addUser(@RequestParam(required = true) String id,
				@RequestParam(required = false) String name,
				@RequestParam(required = false) String age){
		
		UserParam user = new UserParam();
		user.setId(Integer.valueOf(id));
		user.setName(name);
		user.setAge(age);
		
		uservice.addUser(user);
	}
	
}

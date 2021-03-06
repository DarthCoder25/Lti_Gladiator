package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.UserDetail;
import com.lti.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService service;
	
	@RequestMapping(value="/addUser", method=RequestMethod.POST)
	public ModelAndView addUser(@RequestParam String userId, @RequestParam String firstName, @RequestParam String middleName, @RequestParam String lastName, @RequestParam String emailId, @RequestParam String password, @RequestParam String phoneno, @RequestParam String dob, @RequestParam String gender, @RequestParam String residentType, @RequestParam int aadharNumber, @RequestParam String panNumber)
	{
		
		UserDetail u1= new UserDetail();
		u1.setUserId(userId);
		u1.setFirstName(firstName);
		u1.setMiddleName(middleName);
		u1.setLastName(lastName);
		u1.setEmailId(emailId);
		u1.setPassword(password);
		u1.setPhoneno(phoneno);
		u1.setDob(dob);
		u1.setGender(gender);
		u1.setResidentType(residentType);
		u1.setAadharNumber(aadharNumber);
		u1.setPanNumber(panNumber);
		
		
		UserDetail u2 = service.addUser(u1);
		
		ModelAndView model = null;
		if(u2==null)
		{
			model= new ModelAndView("UserNotAdded");
		}
		else
		{
			model= new ModelAndView("UserAdded");
			model.addObject("user",u2);
		}
		return model;
		
	}
	
	public UserController() 
	{
		// TODO Auto-generated constructor stub
	}

}

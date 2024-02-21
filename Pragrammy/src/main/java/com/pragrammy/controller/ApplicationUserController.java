package com.pragrammy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pragrammy.model.ApplicationUser;
import com.pragrammy.service.ApplicationUserService;

@RestController
@RequestMapping("/user")
public class ApplicationUserController {
	
	@Autowired
	ApplicationUserService appService;
	
	
	@PostMapping("/register")
	 public String register(@RequestBody ApplicationUser user) {
		return appService.register(user);	
	}
	
	@PostMapping("/sigin")
	public String signin(@RequestParam("email") String email, @RequestParam("password") String password)
	{
		return appService.sigin(email, password);
	}
	
	@GetMapping("/viewprofile/{userId}")
	public ApplicationUser viewprofile(@RequestParam String userId)
	{
		return appService.viewProfile(userId);
	}
	
	@GetMapping("/editprofile/{userId}")
	public void editProfile(@RequestParam String userId)
	{
		appService.editProfile(userId);
	}
	
}

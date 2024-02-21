package com.pragrammy.service;




import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pragrammy.model.ApplicationUser;
import com.pragrammy.repository.AppUserRepo;
import com.pragrammy.security.JwtUtil;


@Service
public class ApplicationUserService {
	
	@Autowired
	AppUserRepo userRepo;
	
	@SuppressWarnings("unchecked")
	public String register(ApplicationUser user) {
		
		JSONObject json = new JSONObject();
		try
		{
			userRepo.save(user);
			json.put("message", "Registration Successful");
		}
		catch(Exception e)
		{
			json.put("message", "Password or username policy failed");
		}
		
		return json.toJSONString();
	}

	@SuppressWarnings("unchecked")
	public String sigin(String email, String password) {
		JSONObject json = new JSONObject();
		ApplicationUser appuser = userRepo.findByUserEmail(email);
		if(appuser.password.equals(password))
		{
			String token = JwtUtil.generateToken(appuser.user_email);
			json.put("message", "Authentcation Successful");
			json.put("token", token);
			json.put("id", appuser.user_name);
		}
		else
		{
			json.put("message", "Username or Password is Incorrect");
		}
		return json.toJSONString();
	}
	public ApplicationUser viewProfile(String userId) {
		
		return userRepo.findById(userId).get();
	}

	public void editProfile(String userId) {
		ApplicationUser user = userRepo.findById(userId).get();
		userRepo.save(user);
	}

}

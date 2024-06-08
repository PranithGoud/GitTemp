package com.pragrammy.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.pragrammy.service.HomeService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping("/")
	public String home()
	{
		return "Hello Home";
	}
	
	@Autowired
	HomeService homeService;
	
	@PostMapping("/add")
	public String add(@RequestParam int a, @RequestParam int b, @RequestBody JSONPObject ab )
	{
		return "addition :" +homeService.addition(a,b);
	}
	
	public void testForJava8()
	{
		List<Integer> list = Arrays.asList(2,4,5,7,9);
		Stream<Integer> strlist = list.stream();
		strlist.filter(n -> n%2==0).forEach(n -> System.out.println(n + ":"));
	}
}

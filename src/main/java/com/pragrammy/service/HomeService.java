package com.pragrammy.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

	public String addition(int i, int j) {
		
		return String.valueOf(i+j);
	}

}

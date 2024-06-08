package com.pragrammy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pragrammy.model.ApplicationUser;

@Repository
public interface AppUserRepo extends JpaRepository<ApplicationUser, String> {

	 @Query("SELECT u FROM ApplicationUser u WHERE u.user_email = :userEmail")
	    ApplicationUser findByUserEmail(String userEmail);

}	

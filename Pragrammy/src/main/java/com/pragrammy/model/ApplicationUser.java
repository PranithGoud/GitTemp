package com.pragrammy.model;


import java.util.Collection;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class ApplicationUser {

		@Id
	    public String user_name;
	    public String user_email;
	    public String password;
	    public String user_mobile;
	    public String location;

	    public ApplicationUser(String user_name, String user_email, String password, String user_mobile, String location) {
	        super();
	        this.user_name = user_name;
	        this.user_email = user_email;
	        this.password = password;
	        this.user_mobile = user_mobile;
	        this.location = location;
	    }

	    public ApplicationUser() {
	        super();
	    }

	    public ApplicationUser(String user_name, String password) {
	        super();
	        this.user_name = user_name;
	        this.password = password;
	    }

	
}

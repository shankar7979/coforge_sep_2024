package com.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApp1Application.class, args);
	}

}

/*
post
http://localhost:8080/addNewUser
{
  "name":"suresh kumar",
   "email":"suresh@ymail.com",
   "password":"1234",
   "roles":"ROLE_USER"
}
post
http://localhost:8080/generateToken
{
  "username":"suresh kumar",
   "password":"1234"
}
 */

//  password  abcd --https://bcrypt-generator.com/
//insert into users values(1001,'$2a$12$fhHYf2.wQAp.DIRmU3U7mu.UFaANCfBYEMAyTAz7VGhgvFyIqJazi','ram kumar');

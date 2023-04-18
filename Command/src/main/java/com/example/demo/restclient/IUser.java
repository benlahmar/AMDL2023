package com.example.demo.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.User;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface IUser {

	@GetMapping("users/{id}")
	public User getuser(@PathVariable long id);
	@PostMapping("users")
	public User saveu(@RequestBody User u);
}

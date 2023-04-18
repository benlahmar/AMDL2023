package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Command;
import com.example.demo.service.IService;

@RestController
public class OrderApi {

	@Autowired
	IService service;
	
	@PostMapping("orders")
	public Command savec(@RequestBody Command c)
	{
		return service.addcmd(c);
		
	}
	
	@GetMapping("orders/{id}")
	public Command findc(@PathVariable long id)
	{
		return service.findCmd(id);
	}
}

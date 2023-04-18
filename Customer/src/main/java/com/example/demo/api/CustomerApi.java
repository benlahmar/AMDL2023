package com.example.demo.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.repo.IUser;


@RestController
public class CustomerApi {

	@Autowired
	IUser urepo;
	
	@PostMapping("/users")
	public User adduser(@RequestBody User u)
	{
			return urepo.save(u);
	}
	
	@GetMapping("/users")
	public List<User> allusers()
	{
			return urepo.findAll();	
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> finduser(@PathVariable long id)
	{
		Optional<User> uo = urepo.findById(id);
		if(uo.isPresent())
			return new ResponseEntity<User>(uo.get(),HttpStatus.FOUND);
		else
			
			return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
		
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<Void> delet(long id)
	{
		Optional<User> uo = urepo.findById(id);
		if(uo.isPresent())
		{
			User u = uo.get();
			urepo.delete(u);
			return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
		}else
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		
	}
	
	@GetMapping("users/search")
	public Page<User> search(@RequestParam(name = "q") String mc, @RequestParam int page, @RequestParam int size)
	{
		Pageable p=PageRequest.of(page, size);
		return urepo.findByLogContainingIgnoreCase(mc, p);
	}
	
}

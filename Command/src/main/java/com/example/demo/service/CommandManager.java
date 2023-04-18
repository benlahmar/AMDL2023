package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Command;
import com.example.demo.entities.User;
import com.example.demo.repo.ICommand;
import com.example.demo.repo.ICommandLine;
import com.example.demo.restclient.IUser;

@Service
public class CommandManager implements IService{

	@Autowired
	ICommand crepo;
	@Autowired
	ICommandLine lrepo;
	@Autowired
	IUser uservice;
	
	@Override
	public Command addcmd(Command c) {
		//verifier le user dans l'autre microservice
		
		User u= uservice.getuser(c.getIduser());
		if(u!=null)
		{
		  return crepo.save(c);
		}
		else
			return null;
	}

	@Override
	public Command findCmd(long id) {
		
		Optional<Command> co = crepo.findById(id);
		Command c = co.get();
		User u= uservice.getuser(c.getIduser());
		c.setUser(u);
		return c;
	}

}

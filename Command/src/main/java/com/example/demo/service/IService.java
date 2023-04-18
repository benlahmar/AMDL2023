package com.example.demo.service;

import java.util.Optional;

import com.example.demo.entities.Command;

public interface IService {

	public Command addcmd( Command c);
	public Command findCmd(long id);
}

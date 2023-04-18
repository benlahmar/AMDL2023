package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Command;
import com.example.demo.entities.CommandLine;

public interface IService {

	public Command addcmd( Command c);
	public Command findCmd(long id);
	public List<Command> commands();
	
	public CommandLine addcomp(CommandLine c);
	public List<CommandLine> cmdline(long idc);
}

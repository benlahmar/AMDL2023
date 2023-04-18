package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.CommandLine;

public interface ICommandLine extends JpaRepository<CommandLine, Long>{

}

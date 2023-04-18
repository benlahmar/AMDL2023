package com.example.demo.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.User;

public interface IUser extends JpaRepository<User, Long>{

	public User findByLog(String lg);
	public User findByLogAndPass(String lg, String ps);
	public List<User> findByDateBetween(LocalDate dd, LocalDate df);
	public Page<User> findByLogContainingIgnoreCase(String mc, Pageable p);
	
	@Query("from User e where e.log=?1")
	public User abc(String x);
}

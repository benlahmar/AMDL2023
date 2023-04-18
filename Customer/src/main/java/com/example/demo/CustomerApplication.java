package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Adresse;
import com.example.demo.entities.User;
import com.example.demo.repo.IUser;

@SpringBootApplication
public class CustomerApplication implements CommandLineRunner{

	@Autowired
	IUser urepo;
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		User u=new User("moi3", "moi");
//		Adresse ad=new Adresse("xx", "rabat", "maroc", 10000);
//		u.setAddresse(ad);
//		String[] prn= {"pr1","pr2"};
//		u.setPrenoms(prn);
//		
//		urepo.save(u);
//		
//		User u1=urepo.findByLogAndPass("moi", "moi");
//		System.out.println("****"+u1.getDate());
//		List<User> ut = urepo.findByLogContainingIgnoreCase("M");
//		for (User user : ut) {
//			System.out.println(user.getLog());
//		}
//		
//		User u2 = urepo.abc("moi");
//		System.out.println(u2.getDate());
	}

	
}

package com.example.demo.entities;


import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.OrderColumn;

public class User {

	long id;
	String log;
	String pass;
	
	
	String[] prenoms;
	
	
	Adresse addresse;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getLog() {
		return log;
	}


	public void setLog(String log) {
		this.log = log;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String[] getPrenoms() {
		return prenoms;
	}


	public void setPrenoms(String[] prenoms) {
		this.prenoms = prenoms;
	}


	public Adresse getAddresse() {
		return addresse;
	}


	public void setAddresse(Adresse addresse) {
		this.addresse = addresse;
	}
	
}

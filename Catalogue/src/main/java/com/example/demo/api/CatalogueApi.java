package com.example.demo.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bisness.ICatalogue;
import com.example.demo.entities.Categorie;
import com.example.demo.entities.Produit;
import com.example.demo.repo.ICategorie;

@RestController
public class CatalogueApi {

	@Autowired
	ICatalogue  service;
	
	@PostMapping("categories")
	public Categorie addcat(@RequestBody Categorie c)
	{
		return service.addcat(c);
	}
	
	@GetMapping("categories/{idc}")
	public ResponseEntity<Categorie> findcat(@PathVariable long idc)
	{
		Optional<Categorie> op = service.findcat(idc);
		if(op.isPresent())
			return new ResponseEntity<Categorie>(op.get(), HttpStatus.OK);
		else
			return new ResponseEntity<Categorie>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("categories")
	public List<Categorie> allcat()
	{
		return service.allcat();
	}
	
	@PostMapping("categories/{idc}/produits")
	public Produit addp( @RequestBody Produit p, @PathVariable long idc)
	{
		Optional<Categorie> op = service.findcat(idc);
		p.setCategorie(op.get());
		return service.addprd(p);
	}
	@GetMapping("categories/{idc}/produits")
	public List<Produit> allprd(@PathVariable long idc)
	{
		return service.allproduit(idc);
	}
	
}

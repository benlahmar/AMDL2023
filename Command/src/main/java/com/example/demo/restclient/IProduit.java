package com.example.demo.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entities.Produit;

@FeignClient(name = "CATALOGUE-SERVICE")
public interface IProduit {

	@GetMapping("produits/{id}")
	public Produit fondprd( @PathVariable long id);
}

package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Categorie {


	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	long id;
	String libelle;
	
	@OneToMany(mappedBy = "categorie", 
			fetch = FetchType.EAGER,
			cascade = CascadeType.ALL)
	List<Produit> produits;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public List<Produit> getProduits() {
		return produits;
	}


	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	
}

package com.example.demo.bisness;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Categorie;
import com.example.demo.entities.Produit;

public interface ICatalogue {

	public Categorie addcat(Categorie c);
	public Optional<Categorie>  findcat(long id);
	public List<Categorie> allcat();
	
	
	public Produit addprd(Produit p);
	public Produit addprd(Produit p, long idcat);
	public Optional<Produit> findprd(long idp);
	public List<Produit> allproduit(long idcat);
	
}

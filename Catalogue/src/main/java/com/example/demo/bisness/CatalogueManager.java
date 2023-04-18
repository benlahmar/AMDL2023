package com.example.demo.bisness;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Categorie;
import com.example.demo.entities.Produit;
import com.example.demo.repo.ICategorie;
import com.example.demo.repo.IProduit;
@Service
public class CatalogueManager implements ICatalogue{

	@Autowired
	IProduit prepo;
	@Autowired
	ICategorie crepo;
	
	
	@Override
	public Categorie addcat(Categorie c) {
		
		return crepo.save(c);
	}

	@Override
	public Optional<Categorie> findcat(long id) {
		// TODO Auto-generated method stub
		return crepo.findById(id);
	}

	@Override
	public List<Categorie> allcat() {
		// TODO Auto-generated method stub
		return crepo.findAll();
	}

	@Override
	public Produit addprd(Produit p) {
		// TODO Auto-generated method stub
		return prepo.save(p);
	}

	@Override
	public Produit addprd(Produit p, long idcat) {
		Categorie c = crepo.findById(idcat).get();
		p.setCategorie(c);
		return prepo.save(p);
	}

	@Override
	public Optional<Produit> findprd(long idp) {
		// TODO Auto-generated method stub
		return prepo.findById(idp);
	}

	@Override
	public List<Produit> allproduit(long idcat) {
		// TODO Auto-generated method stub
		return prepo.findByCategorieId(idcat);
	}

}

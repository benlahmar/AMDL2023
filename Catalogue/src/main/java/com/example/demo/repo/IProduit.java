package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Produit;

public interface IProduit extends JpaRepository<Produit, Long>{

	public List<Produit> findByQteLessThan(int seuil);
	public List<Produit> findByCategorieId(long idcat);
	public List<Produit> findByCategorieLibelle(String lib);
}

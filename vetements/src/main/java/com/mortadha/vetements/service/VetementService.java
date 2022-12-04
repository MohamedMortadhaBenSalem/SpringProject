package com.mortadha.vetements.service;

import java.util.List;

import com.mortadha.vetements.entities.Marque;
import com.mortadha.vetements.entities.Vetement;

public interface VetementService {
	Vetement saveVetement(Vetement p);
	Vetement updateVetement(Vetement p);
	void deleteVetement(Vetement p);
	void deleteVetementById(Long id);
	Vetement getVetement(Long id);
	List<Vetement> getAllVetements();
	List<Vetement> findByNomVetement(String nom);
	List<Vetement> findByNomVetementContains(String nom);
	List<Vetement> findByNomPrix(String nom, Double prix);
	List<Vetement> findByMarque(Marque marque);
	List<Vetement> findByMarqueIdMar(Long id);
	List<Vetement> findByOrderByNomVetementAsc();
	List<Vetement> trierVetementsNomsPrix();
}
package com.mortadha.vetements.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mortadha.vetements.entities.Marque;
import com.mortadha.vetements.entities.Vetement;
import com.mortadha.vetements.repos.VetementRepository;
@Service
public class VetementServiceImpl implements VetementService {
@Autowired
VetementRepository vetementRepository;
@Override
public Vetement saveVetement(Vetement p) {
	return vetementRepository.save(p);
	}
	@Override
	public Vetement updateVetement(Vetement p) {
	return vetementRepository.save(p);
	}
	@Override
	public void deleteVetement(Vetement p) {
	vetementRepository.delete(p);
	}
	 @Override
	public void deleteVetementById(Long id) {
	vetementRepository.deleteById(id);
	}
	@Override
	public Vetement getVetement(Long id) {
	return vetementRepository.findById(id).get();
	}
	@Override
	public List<Vetement> getAllVetements() {
	return vetementRepository.findAll();
	}
	@Override
	public List<Vetement> findByNomVetement(String nom) {
		return vetementRepository.findByNomVetement(nom);
	}
	@Override
	public List<Vetement> findByNomVetementContains(String nom) {
		return vetementRepository.findByNomVetementContains(nom);
	}
	@Override
	public List<Vetement> findByNomPrix(String nom, Double prix) {
		return vetementRepository.findByNomPrix(nom, prix);
	}
	@Override
	public List<Vetement> findByMarque(Marque marque) {
		return vetementRepository.findByMarque(marque);
	}
	@Override
	public List<Vetement> findByMarqueIdMar(Long id) {
		return vetementRepository.findByMarqueIdMar(id);
	}
	@Override
	public List<Vetement> findByOrderByNomVetementAsc() {
		return vetementRepository.findByOrderByNomVetementAsc();
	}
	@Override
	public List<Vetement> trierVetementsNomsPrix() {
		return vetementRepository.trierVetementsNomsPrix();
	}
}

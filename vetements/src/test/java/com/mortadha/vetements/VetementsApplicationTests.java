package com.mortadha.vetements;

import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mortadha.vetements.entities.Marque;
import com.mortadha.vetements.entities.Vetement;
import com.mortadha.vetements.repos.VetementRepository;

@SpringBootTest
class VetementsApplicationTests {
	@Autowired
	private VetementRepository vetementRepository;

	@Test
	public void testCreateVetement() {
		Vetement prod = new Vetement("Jean", 220.500, new Date());
		vetementRepository.save(prod);
	}

	@Test
	public void testFindVetement() {
		Vetement p = vetementRepository.findById(1L).get();
		System.out.println(p);
	}

	@Test
	public void testUpdateVetement() {
		Vetement p = vetementRepository.findById(1L).get();
		p.setPrixVetement(100.0);
		vetementRepository.save(p);
	}

	@Test
	public void testDeleteVetement() {
		vetementRepository.deleteById(1L);
		;
	}

	@Test
	public void testListerTousVetements() {
		List<Vetement> prods = vetementRepository.findAll();
		for (Vetement p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void testFindByNomVetement() {
		List<Vetement> prods = vetementRepository.findByNomVetement("Jean");
		for (Vetement p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void testFindByNomVetementContains() {
		List<Vetement> prods = vetementRepository.findByNomVetementContains("Jean");
		for (Vetement p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void testfindByNomPrix() {
		List<Vetement> prods = vetementRepository.findByNomPrix("Jean", 100.0);
		for (Vetement p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void testfindByMarque() {
		Marque cat = new Marque();
		cat.setIdMar(1L);
		List<Vetement> prods = vetementRepository.findByMarque(cat);
		for (Vetement p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void findByMarqueIdMar() {
		List<Vetement> prods = vetementRepository.findByMarqueIdMar(1L);
		for (Vetement p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void testfindByOrderByNomVetementAsc() {
		List<Vetement> prods = vetementRepository.findByOrderByNomVetementAsc();
		for (Vetement p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void testTrierVetementsNomsPrix() {
		List<Vetement> prods = vetementRepository.trierVetementsNomsPrix();
		for (Vetement p : prods) {
			System.out.println(p);
		}
	}

}
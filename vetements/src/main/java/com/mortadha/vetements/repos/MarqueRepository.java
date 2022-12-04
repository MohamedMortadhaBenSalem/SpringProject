package com.mortadha.vetements.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mortadha.vetements.entities.Marque;

@RepositoryRestResource(path = "mar")
@CrossOrigin("http://localhost:4200/")
public interface MarqueRepository extends JpaRepository<Marque, Long> {
}
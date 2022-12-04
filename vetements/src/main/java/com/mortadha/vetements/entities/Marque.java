package com.mortadha.vetements.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Marque {	
	@JsonIgnore
	@OneToMany(mappedBy = "marque")
	private List<Vetement> vetements;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMar;
	private String nomMar;
	private String descriptionMar;
	

}
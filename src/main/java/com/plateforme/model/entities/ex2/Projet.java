package com.plateforme.model.entities.ex2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Projet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String description;
private String titre;
private String url;
@JoinColumn(name = "id_chef",referencedColumnName = "id")
@OneToOne
private Chef chef;
	
	
	
}

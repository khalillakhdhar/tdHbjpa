package com.plateforme.model.entities.ex3;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Produit {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(unique = true)
private String titre;

private String photo;
private String description;
private float prix;

}

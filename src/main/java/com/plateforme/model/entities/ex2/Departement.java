package com.plateforme.model.entities.ex2;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Departement {
@Id
private long id;
@Column(unique = true)
private String titre;
@OneToOne(cascade = CascadeType.ALL, mappedBy = "departement")
private Chef chefunite;

}

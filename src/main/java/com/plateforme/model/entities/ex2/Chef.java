package com.plateforme.model.entities.ex2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Chef {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@NotBlank
@Column(nullable = false)
private String nom;
@JoinColumn(name = "departement",referencedColumnName = "titre")
@OneToOne(optional = false)
private Departement departement;
}

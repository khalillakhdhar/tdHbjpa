package com.plateforme.model.entities.ex3;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.core.SerializableString;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class User implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(unique = true)
private String email;
@NotBlank
@Column(nullable = false)
private String mdp,nom,telephone,adresse,grade;
@OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
private List<Commande> commandList;
}

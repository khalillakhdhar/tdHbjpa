package com.plateforme.model.entities.ex1;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Rectangle extends Polygone {

	private int hauteur,largeur;
}

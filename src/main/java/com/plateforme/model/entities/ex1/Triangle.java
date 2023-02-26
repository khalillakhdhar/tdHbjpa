package com.plateforme.model.entities.ex1;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Triangle extends Polygone {
private int base;
private String types;




}

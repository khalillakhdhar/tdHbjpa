package com.plateforme.model.entities.ex1;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
@Data
public abstract class Polygone extends Forme {
private int angle;

}

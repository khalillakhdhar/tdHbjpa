package com.plateforme.model.entities.ex3;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Entity
@Data
public class Commande implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Min(value = 1)
	private int quantite;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	private String etat;

	@ManyToOne(optional = false)
	@JoinColumn(name = "id_user",referencedColumnName = "id")
	private User user;
	
@OneToMany(cascade =CascadeType.ALL)

private List<Produit> products;
	
}

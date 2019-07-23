package com.example.demo.entity;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class PersonnelsPartants {
	@Id
	private int id_Partant;
	public int getId_Partant() {
		return id_Partant;
	}
	public void setId_Partant(int id_Partant) {
		this.id_Partant = id_Partant;
	}
	private Date date_de_sortie;
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL)
	private Personnels personnels;
	public PersonnelsPartants() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Date getDate_de_sortie() {
		return date_de_sortie;
	}
	public void setDate_de_sortie(Date date_de_sortie) {
		this.date_de_sortie = date_de_sortie;
	}
	
	public Personnels getPersonnels() {
		return personnels;
	}
	public void setPersonnels(Personnels personnels) {
		this.personnels = personnels;
	}
	public PersonnelsPartants(Date date_de_sortie) {
		super();
		this.date_de_sortie = date_de_sortie;
	}

	

}

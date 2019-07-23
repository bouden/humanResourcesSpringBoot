package com.example.demo.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Assurances implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_Assurance;
	private String type_aventage;
	private int matricule;
	private Date date_debut_contrat;
	private Date date_fin_contrat;
	private float duree;
	private int num_contrat;
	@JsonIgnore
	@OneToMany(mappedBy="assurances",cascade = CascadeType.ALL)
	private Collection<Personnels>personnels;
	public int getId_Assurance() {
		return id_Assurance;
	}
	public void setId_Assurance(int id_Assurance) {
		this.id_Assurance = id_Assurance;
	}
	public String getType_aventage() {
		return type_aventage;
	}
	public void setType_aventage(String type_aventage) {
		this.type_aventage = type_aventage;
	}
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public Date getDate_debut_contrat() {
		return date_debut_contrat;
	}
	public void setDate_debut_contrat(Date date_debut_contrat) {
		this.date_debut_contrat = date_debut_contrat;
	}
	public Date getDate_fin_contrat() {
		return date_fin_contrat;
	}
	public void setDate_fin_contrat(Date date_fin_contrat) {
		this.date_fin_contrat = date_fin_contrat;
	}
	public float getDuree() {
		return duree;
	}
	public void setDuree(float duree) {
		this.duree = duree;
	}
	public int getNum_contrat() {
		return num_contrat;
	}
	public void setNum_contrat(int num_contrat) {
		this.num_contrat = num_contrat;
	}
	public Collection<Personnels> getPersonnels() {
		return personnels;
	}
	public void setPersonnels(Collection<Personnels> personnels) {
		this.personnels = personnels;
	}
	
	public Assurances(String type_aventage, int matricule, Date date_debut_contrat, Date date_fin_contrat, float duree,
			int num_contrat) {
		super();
		this.type_aventage = type_aventage;
		this.matricule = matricule;
		this.date_debut_contrat = date_debut_contrat;
		this.date_fin_contrat = date_fin_contrat;
		this.duree = duree;
		this.num_contrat = num_contrat;
	}
	public Assurances() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

package com.example.demo.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Poste implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPoste;
	
	private String Titre_de_Poste;
	private String Fonction;
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	private Personnels personnels;
	
	public Poste(String titre_de_Poste, String fonction) {
		super();
		Titre_de_Poste = titre_de_Poste;
		Fonction = fonction;
	}

	public Long getIdPoste() {
		return idPoste;
	}

	public void setIdPoste(Long idPoste) {
		this.idPoste = idPoste;
	}

	public String getTitre_de_Poste() {
		return Titre_de_Poste;
	}

	public void setTitre_de_Poste(String titre_de_Poste) {
		Titre_de_Poste = titre_de_Poste;
	}

	public String getFonction() {
		return Fonction;
	}

	public void setFonction(String fonction) {
		Fonction = fonction;
	}

	@Override
	public String toString() {
		return "Poste [idPoste=" + idPoste + ", Titre_de_Poste=" + Titre_de_Poste + ", Fonction=" + Fonction
				+ ", personnels=" + personnels + "]";
	}

	public Personnels getPersonnels() {
		return personnels;
	}

	public void setPersonnels(Personnels personnels) {
		this.personnels = personnels;
	}
}



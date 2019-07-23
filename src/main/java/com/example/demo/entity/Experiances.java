package com.example.demo.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Experiances implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idExp;
private double expExterne;
private double Anciennete;
private String nomExSos;

	/*
	 * @OneToOne(cascade = CascadeType.ALL) private Personnels personnel;
	 */
public Experiances()  {
	super();
	// TODO Auto-generated constructor stub
}
public Experiances(double expExterne, double expInterne, String nomExSos) {
	super();
	this.expExterne = expExterne;
	this.Anciennete = expInterne;
	this.nomExSos = nomExSos;
}
public Long getIdExp() {
	return idExp;
}
public void setIdExp(Long idExp) {
	this.idExp = idExp;
}
public double getExpExterne() {
	return expExterne;
}
public void setExpExterne(double expExterne) {
	this.expExterne = expExterne;
}
public double getExpInterne() {
	return Anciennete;
}
public void setExpInterne(double expInterne) {
	this.Anciennete = expInterne;
}
public String getNomExSos() {
	return nomExSos;
}
public void setNomExSos(String nomExSos) {
	this.nomExSos = nomExSos;
}
	/*
	 * public Personnels getPersonnel() { return personnel; } public void
	 * setPersonnel(Personnels personnel) { this.personnel = personnel; }
	 */

}

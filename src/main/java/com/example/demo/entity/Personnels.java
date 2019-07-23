package com.example.demo.entity;

import java.io.Serializable;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

import lombok.Data;
@Entity
 @Data
public class Personnels implements Serializable {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@JoinColumn(name="id_Personnels")
	private Long id_Personnel;
	@JoinColumn(name="Matricule")
	private String matricule;
	@JoinColumn(name="Nom")
	private String nom;
	@JoinColumn(name="Prenom")
	private String prenom;
	@JoinColumn(name="Numero_CIN")
	private String  numero_CIN ;
	@JoinColumn(name="Mois_de_Naissance")
	private int mois_de_Naissance;
	@JoinColumn(name="Date_de_Naissance")
    @Temporal(TemporalType.DATE)
	private Date date_de_Naissance;
	@JoinColumn(name="Lieu")
	private String lieu;
	@JoinColumn(name="Genre")
	private String genre;
	@JoinColumn(name="Numero_Telephone")
	private int numero_Telephone;
	@JoinColumn(name="Numero_Mobile")
	private int numero_Mobile;
	@Email(message = "SVP entrer un E_mail valide")
	@NotEmpty(message = "SVP saisie votre e_mail")
	@JoinColumn(name="E_mail")
	private String e_mail;
    @Temporal(TemporalType.DATE)
    @JoinColumn(name="Date_Embauche")
	private Date date_Embauche;
    @JoinColumn(name="Photo_Personnel")
	private String photo_Personnel;
	//private Date dateFincontrat;
    @JoinColumn(name="Adresse_Personnel")
	private String adresse_Personnel;
    @JoinColumn(name="Code_Postal")
	private String code_Postal;
    @JoinColumn(name="Ville")
	private String ville;
    @JoinColumn(name="Pays")
	private String pays;
    @JoinColumn(name="Numero_CNSS")
	private String numero_CNSS;
    @JoinColumn(name="Type_Contrat")
	private String type_Contrat;
    @JoinColumn(name="Date_Fin_Contrat")
	private String date_Fin_Contrat;
    @JoinColumn(name="Situation_Familiale")
	private String situation_Familiale;
    @JoinColumn(name="Enfant_à_charger")
	private int enfant_à_charger;
    @JoinColumn(name="Diplôme")
    private String diplôme;
    private String role;
	@JsonIgnore
	@OneToOne (cascade = CascadeType.ALL)
	private Experiances experiance;
	
	@JsonIgnore
	@OneToMany(mappedBy="personnels",cascade = CascadeType.ALL)
	private Collection<Conges> conge ;
	@JsonIgnore
	@OneToMany(mappedBy="personnels",cascade = CascadeType.ALL)
	private Collection<Poste> fonctions ;
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL)
	private Salaires salaires;
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
    private Departements departements ;
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	private Assurances assurances;
	
	public Long getId_Personnel() {
		return id_Personnel;
	}
	public void setId_Personnel(Long id_Personnel) {
		this.id_Personnel = id_Personnel;
	}
	public Assurances getAssurances() {
		return assurances;
	}
	
	public void setAssurances(Assurances assurances) {
		this.assurances = assurances;
	}
	public Personnels() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Personnels(String matricule, String nom, String prenom, String numero_CIN, int mois_de_Naissance,
			Date date_de_Naissance, String lieu, String genre, int numero_Telephone, int numero_Mobile, String e_mail,
			Date date_Embauche, String photo_Personnel, String adresse_Personnel, String code_Postal, String ville,
			String pays, String numero_CNSS, String type_Contrat, String date_Fin_Contrat, String situation_Familiale,
			int enfant_à_charger, String diplôme,String role) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.numero_CIN = numero_CIN;
		this.mois_de_Naissance = mois_de_Naissance;
		this.date_de_Naissance = date_de_Naissance;
		this.lieu = lieu;
		this.genre = genre;
		this.numero_Telephone = numero_Telephone;
		this.numero_Mobile = numero_Mobile;
		this.e_mail = e_mail;
		this.date_Embauche = date_Embauche;
		this.photo_Personnel = photo_Personnel;
		this.adresse_Personnel = adresse_Personnel;
		this.code_Postal = code_Postal;
		this.ville = ville;
		this.pays = pays;
		this.numero_CNSS = numero_CNSS;
		this.type_Contrat = type_Contrat;
		this.date_Fin_Contrat = date_Fin_Contrat;
		this.situation_Familiale = situation_Familiale;
		this.enfant_à_charger = enfant_à_charger;
		this.diplôme = diplôme;
		this.role = role;
	}
	public Long getId_Personnels() {
		return id_Personnel;
	}
	public void setId_Personnels(Long id_Personnels) {
		this.id_Personnel = id_Personnels;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNumero_CIN() {
		return numero_CIN;
	}
	public void setNumero_CIN(String numero_CIN) {
		this.numero_CIN = numero_CIN;
	}
	public int getMois_de_Naissance() {
		return mois_de_Naissance;
	}
	public void setMois_de_Naissance(int mois_de_Naissance) {
		this.mois_de_Naissance = mois_de_Naissance;
	}
	public Date getDate_de_Naissance() {
		return date_de_Naissance;
	}
	public void setDate_de_Naissance(Date date_de_Naissance) {
		this.date_de_Naissance = date_de_Naissance;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getNumero_Telephone() {
		return numero_Telephone;
	}
	public void setNumero_Telephone(int numero_Telephone) {
		this.numero_Telephone = numero_Telephone;
	}
	public int getNumero_Mobile() {
		return numero_Mobile;
	}
	public void setNumero_Mobile(int numero_Mobile) {
		this.numero_Mobile = numero_Mobile;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public Date getDate_Embauche() {
		return date_Embauche;
	}
	public void setDate_Embauche(Date date_Embauche) {
		this.date_Embauche = date_Embauche;
	}
	public String getPhoto_Personnel() {
		return photo_Personnel;
	}
	public void setPhoto_Personnel(String photo_Personnel) {
		this.photo_Personnel = photo_Personnel;
	}
	public String getAdresse_Personnel() {
		return adresse_Personnel;
	}
	public void setAdresse_Personnel(String adresse_Personnel) {
		this.adresse_Personnel = adresse_Personnel;
	}
	public String getCode_Postal() {
		return code_Postal;
	}
	public void setCode_Postal(String code_Postal) {
		this.code_Postal = code_Postal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getNumero_CNSS() {
		return numero_CNSS;
	}
	public void setNumero_CNSS(String numero_CNSS) {
		this.numero_CNSS = numero_CNSS;
	}
	public String getType_Contrat() {
		return type_Contrat;
	}
	public void setType_Contrat(String type_Contrat) {
		this.type_Contrat = type_Contrat;
	}
	public String getDate_Fin_Contrat() {
		return date_Fin_Contrat;
	}
	public void setDate_Fin_Contrat(String date_Fin_Contrat) {
		this.date_Fin_Contrat = date_Fin_Contrat;
	}
	public String getSituation_Familiale() {
		return situation_Familiale;
	}
	public void setSituation_Familiale(String situation_Familiale) {
		this.situation_Familiale = situation_Familiale;
	}
	public int getEnfant_à_charger() {
		return enfant_à_charger;
	}
	public void setEnfant_à_charger(int enfant_à_charger) {
		this.enfant_à_charger = enfant_à_charger;
	}
	public String getDiplôme() {
		return diplôme;
	}
	public void setDiplôme(String diplôme) {
		this.diplôme = diplôme;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Experiances getExperiance() {
		return experiance;
	}
	public void setExperiance(Experiances experiance) {
		this.experiance = experiance;
	}
	public Collection<Conges> getConge() {
		return conge;
	}
	public void setConge(Collection<Conges> conge) {
		this.conge = conge;
	}
	public Collection<Poste> getFonctions() {
		return fonctions;
	}
	public void setFonctions(Collection<Poste> fonctions) {
		this.fonctions = fonctions;
	}
	public Salaires getSalaires() {
		return salaires;
	}
	public void setSalaires(Salaires salaires) {
		this.salaires = salaires;
	}
	public Departements getDepartements() {
		return departements;
	}
	public void setDepartements(Departements departements) {
		this.departements = departements;
	}
	
	
}

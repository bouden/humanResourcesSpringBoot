package com.example.demo.DTO;

public class UserDTO {
	private String matricul;
	private String nomPers;
	private String prenomPers;
	private String mail;
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDTO(String matricul, String nomPers, String prenomPers, String mail) {
		super();
		this.matricul = matricul;
		this.nomPers = nomPers;
		this.prenomPers = prenomPers;
		this.mail = mail;
	}
	public String getMatricul() {
		return matricul;
	}
	public void setMatricul(String matricul) {
		this.matricul = matricul;
	}
	public String getNomPers() {
		return nomPers;
	}
	public void setNomPers(String nomPers) {
		this.nomPers = nomPers;
	}
	public String getPrenomPers() {
		return prenomPers;
	}
	public void setPrenomPers(String prenomPers) {
		this.prenomPers = prenomPers;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

}

package com.example.demo.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Transient;

@Entity
@Table(name = "user")

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	@Transient
	private String password;
	@ManyToMany
	@JoinTable(name = "USER_ROLE")
	private Collection<Role> roles;
	private boolean actived;
	@Column(name = "e_mail", nullable = false, unique = true)
	@Email(message = "S'il vous plaît fournir un e-mail valide")
	@NotEmpty(message = "S'il vous plaît fournir un e-mail")
	private String e_mail;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public User(String username, String password, boolean actived,
			@Email(message = "S'il vous plaît fournir un e-mail valide") @NotEmpty(message = "S'il vous plaît fournir un e-mail") String e_mail) {
		super();
		this.username = username;
		this.password = password;
		this.actived = actived;
		this.e_mail = e_mail;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	

	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

	public boolean isActived() {
		return actived;
	}

	public void setActived(boolean actived) {
		this.actived = actived;
	}

	

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

//	@JsonIgnore
//	@OneToOne(cascade=CascadeType.ALL)
//	private Personnels personnels;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public Personnels getPersonnels() {
//		return personnels;
//	}
//
//	public void setPersonnels(Personnels personnels) {
//		this.personnels = personnels;
//	}

	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", e_mail=" + e_mail + "]";
	}

}

package com.medic.models;

import java.util.Date;

public class Patient {

	private String code;
	private String titre;
	private String nom;
	private String prenom;
	private String profession;
	private String adresse;
	private String tel;
	private String email;
	private Date dateNaissance;
	private Date dateEnregistrement;
	
	public Patient() {
		super();
	}

	public Patient(String code, String titre, String nom, String prenom, String profession, String adresse, String tel,
			String email, Date dateNaissance, Date dateEnregistrement) {
		super();
		this.code = code;
		this.titre = titre;
		this.nom = nom;
		this.prenom = prenom;
		this.profession = profession;
		this.adresse = adresse;
		this.tel = tel;
		this.email = email;
		this.dateNaissance = dateNaissance;
		this.dateEnregistrement = dateEnregistrement;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
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

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Date getDateEnregistrement() {
		return dateEnregistrement;
	}

	public void setDateEnregistrement(Date dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}

	public String toString() {
		return code + ", " + titre + ", " + nom + ", " + prenom + ", "
				+ profession + ", " + adresse + ", " + tel + ", " + email + ", "
				+ dateNaissance + ", " + dateEnregistrement;
	}
	
}

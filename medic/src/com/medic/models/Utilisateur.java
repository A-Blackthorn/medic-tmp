package com.medic.models;

public class Utilisateur {
	
	private int id;
	private String titre;
	private String nom;
	private String prenom;
	private String tel;
	private String email;
	private String login;
	private String mdp;
	private String fonction;
	
	public Utilisateur() {
		super();
	}
	
	public Utilisateur(int id, String titre, String nom, String prenom, String tel, String email, String login,
			String mdp, String fonction) {
		super();
		this.id = id;
		this.titre = titre;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.email = email;
		this.login = login;
		this.mdp = mdp;
		this.fonction = fonction;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	@Override
	public String toString() {
		return id + ", " + titre + ", " + nom + ", " + tel + ", " + email
				+ ", " + login + ", " + mdp + ", " + fonction;
	}
	
	
}


package com.medic.models;

import java.util.Date;

public class Visite {
	private int id;
	private Date dateVisite;
	private int ordre;
	private String statut;
	private Consultation consultation;
	
	public Visite() {
		super();
	}

	public Visite(int id, Date dateVisite, int ordre, String statut, Consultation consultation) {
		super();
		this.id = id;
		this.dateVisite = dateVisite;
		this.ordre = ordre;
		this.statut = statut;
		this.consultation = consultation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateVisite() {
		return dateVisite;
	}

	public void setDateVisite(Date dateVisite) {
		this.dateVisite = dateVisite;
	}

	public int getOrdre() {
		return ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public Consultation getConsultation() {
		return consultation;
	}

	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}

	public String toString() {
		return id + ", " + dateVisite + ", " + ordre + ", " + statut
				+ ", " + consultation ;
	}
	
	

}

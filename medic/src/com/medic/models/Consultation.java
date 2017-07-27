package com.medic.models;

import java.util.Date;
import java.util.Vector;

public class Consultation {

	private int id;
	private Date dateDebut;
	private Date dateProchRv;
	private String symptomes;
	private String etat;
	private Patient patient;
	private Vector<Pathologies> pathologies;
	private Vector<Visite> visites;
	
	public Consultation() {
		super();
	}

	public Consultation(int id, Date dateDebut, Date dateProchRv, String symptomes, String etat, Patient patient) {
		super();
		this.id = id;
		this.dateDebut = dateDebut;
		this.dateProchRv = dateProchRv;
		this.symptomes = symptomes;
		this.etat = etat;
		this.patient = patient;
		this.pathologies= new Vector<>();
		this.visites = new Vector<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateProchRv() {
		return dateProchRv;
	}

	public void setDateProchRv(Date dateProchRv) {
		this.dateProchRv = dateProchRv;
	}

	public String getSymptomes() {
		return symptomes;
	}

	public void setSymptomes(String symptomes) {
		this.symptomes = symptomes;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Vector<Pathologies> getPathologies() {
		return pathologies;
	}

	public void setPathologies(Vector<Pathologies> pathologies) {
		this.pathologies = pathologies;
	}
	
	public void addPathologies(Pathologies p){
		this.pathologies.add(p);
	}

	public Vector<Visite> getVisites() {
		return visites;
	}

	public void setVisites(Vector<Visite> visites) {
		this.visites = visites;
	}
	
	public void addVisite(Visite v){
		this.visites.add(v);
	}

	@Override
	public String toString() {
		return id + ", " + dateDebut + ", " + dateProchRv + ", "
				+ symptomes + ", " + etat + ", " + patient ;
	}
	
	
	
	
}

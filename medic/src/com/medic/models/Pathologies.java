package com.medic.models;

public class Pathologies {
	
	private int id;
	private String designation;
	
	public Pathologies() {
		super();
	}

	public Pathologies(int id, String designation) {
		super();
		this.id = id;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return id + ", " + designation ;
	}
	
}

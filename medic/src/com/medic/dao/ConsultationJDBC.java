package com.medic.dao;

import java.text.SimpleDateFormat;
import java.util.List;

import com.esisa.java.jdbc.Database;
import com.medic.models.Consultation;

public class ConsultationJDBC implements ConsultationDao{

	private Database db;
	
	public ConsultationJDBC(Database db) {
		this.db = db;
	}

	@Override
	public int insert(Consultation c) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return db.insert("consultation", 0, formatter.format(c.getDateDebut()), formatter.format(c.getDateProchRv()), c.getSymptomes(), c.getEtat(), c.getPatient().getCode());
	}

	@Override
	public int delete(int id) {
		return db.delete("consultation", "id", id);
	}

	@Override
	public int update(Consultation c) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return db.update("consultation", "id", c.getId(), "dateDebut", formatter.format(c.getDateDebut()), "dateProchRV", formatter.format(c.getDateProchRv()), "symptomes", c.getSymptomes(), "etat", c.getEtat(), "codePatient", c.getPatient().getCode());
	}

	@Override
	public List<Consultation> consultations() {
		String [][]res = db.select("consultation");
		
	}

	@Override
	public Consultation selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

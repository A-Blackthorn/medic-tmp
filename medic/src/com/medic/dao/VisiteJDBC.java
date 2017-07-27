package com.medic.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import com.esisa.java.jdbc.Database;
import com.medic.models.Consultation;
import com.medic.models.Visite;

public class VisiteJDBC implements VisiteDao{

	private Database db;
	
	public VisiteJDBC(Database db) {
		this.db = db;
	}
	
	@Override
	public int insert(Visite v) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return db.insert("visite", 0, formatter.format(v.getDateVisite()), v.getOrdre(), v.getStatut(), v.getConsultation().getId());
	}

	@Override
	public int delete(int id) {
		return db.delete("visite", "id", id);
	}

	@Override
	public int update(Visite v) {
		return db.update("visite", "id", v.getId(), "dateVisite", v.getDateVisite(), "ordre", v.getOrdre(), "statut", v.getStatut(), "idConsultation", v.getConsultation().getId());
	}

	@Override
	public List<Visite> pathologies() {
		List<Visite> visites= new Vector<>();
		String [][]res = db.select("visite");
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		for(int i =1 ; i <res.length;i++){
			String [][]res1 = db.select("consultation", "id", res[i][4]);
			Consultation c = new Consultation(Integer.parseInt(res1[1][0]), formatter.parse(res1[1][1]), formatter.parse(res1[1][2]), res1[1][3], res1[1][4], res1[1][5]);
			Visite v = new Visite(Integer.parseInt(res[i][0]), formatter.parse(res[i][1]), res[i][2], res[i][3], c);
			visites.add(v);
		}
		
		return visites;
	}

	@Override
	public Visite selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.medic.dao;

import java.util.List;
import java.util.Vector;

import com.esisa.java.jdbc.Database;
import com.medic.models.Pathologies;

public class PathologiesJDBC implements PathologiesDao{
	
	private Database db;

	public PathologiesJDBC(Database db){
		this.db = db;
	}
	
	public int insert(Pathologies p) {
		return db.insert("pathologies", 0, p.getDesignation());
	}

	@Override
	public int delete(int id) {
		return db.delete("pathologise", "id", id);
	}

	@Override
	public int update(Pathologies p) {
		return db.update("pathologies", "id", p.getId(),
				"id", p.getId(),
				"desig", p.getDesignation());
	}

	@Override
	public List<Pathologies> pathologies() {
		List<Pathologies> pathologies = new Vector<>();
		String [][]res = db.select("pathologies");
		for(int i =1 ; i <res.length;i++){
			Pathologies p = new Pathologies(Integer.parseInt(res[i][0]), res[i][1]);
			pathologies.add(p);
		}
		
		return pathologies;
	}

	@Override
	public Pathologies selectById(int id) {
		Pathologies p = null;
		String res[][] = db.select("pathologies", "id", id);
		if(res.length>0) p = new Pathologies(Integer.parseInt(res[1][0]), res[1][1]);
		return p;
		
	}
	
	
	
}

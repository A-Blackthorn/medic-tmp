package com.medic.dao;

import java.util.List;

import com.medic.models.Visite;

public interface VisiteDao {

	public int insert(Visite v);
	public int delete(int id);
	public int update(Visite v);
	public List<Visite> pathologies();
	public Visite selectById(int id);
	
}

package com.medic.dao;

import java.util.List;

import com.medic.models.Pathologies;

public interface PathologiesDao {

	public int insert(Pathologies p);
	public int delete(int id);
	public int update(Pathologies p);
	public List<Pathologies> pathologies();
	public Pathologies selectById(int id);
	
}

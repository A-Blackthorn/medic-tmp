package com.medic.dao;

import java.util.List;

import com.medic.models.Consultation;

public interface ConsultationDao {

	public int insert(Consultation c);
	public int delete(int id);
	public int update(Consultation c);
	public List<Consultation> consultations();
	public Consultation selectById(int id);
	
}

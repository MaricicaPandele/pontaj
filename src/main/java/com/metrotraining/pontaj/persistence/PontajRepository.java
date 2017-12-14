package com.metrotraining.pontaj.persistence;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metrotraining.pontaj.pojos.Pontaj;
import com.metrotraining.pontaj.pojos.PontajZiSapt;



public interface PontajRepository extends JpaRepository<Pontaj, Long> {
	

	public List<Pontaj> findByEndDate(Date endDate);

	public List<Pontaj> findByStartDate(Date startDate);
	public List<Pontaj> findByZi(PontajZiSapt zi);
	
	public List<Pontaj> findAll();
	
	public Pontaj findById(long id);


}

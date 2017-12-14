package com.metrotraining.pontaj.pojos;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Lob;

import com.metrotraining.pontaj.pojos.PontajZiSapt;


@Entity
@Table
public class Pontaj {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
    
    @Column(nullable=true)
    private Date startDate;
    
    @Column(nullable=true)
	private Date endDate;
	
	@Enumerated(EnumType.STRING)
	@Column( nullable=false )
	private PontajZiSapt zi;
	
	public Pontaj() {}
	
	public Pontaj(Date startDate, Date endDate, PontajZiSapt zi) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.zi = zi;
	}

		
	@Override
	public String toString() {
		return "Pontaj [id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + ", zi=" + zi + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public PontajZiSapt getZi() {
		return zi;
	}

	public void setZi(PontajZiSapt zi) {
		this.zi = zi;
	}

	

	
	
	
}

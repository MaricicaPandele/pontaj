package com.metrotraining.pontaj.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.metrotraining.pontaj.persistence.PontajRepository;
import com.metrotraining.pontaj.pojos.Pontaj;

@Service
@Transactional
public class PontajService {
	
	private final PontajRepository pontajRepo;
	public PontajService(PontajRepository repo) {
		pontajRepo = repo;
	}

	public void save(Pontaj part) {
		pontajRepo.save(part);
	}
	
		
	public Pontaj getPontaj(long id) {
		return pontajRepo.findById(id);
	}
	
	
}


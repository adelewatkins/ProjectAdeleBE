package com.lbg.demo.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.lbg.demo.domain.DartGame;
import com.lbg.demo.repo.DartsRepo;

public class DartsService {

	private DartsRepo repo;

	public DartsService(DartsRepo repo) {
		super();
		this.repo = repo;
	}

	public ResponseEntity<DartGame> createDartGame(DartGame newDartGame) {
		DartGame created = this.repo.save(newDartGame);
		return new ResponseEntity<DartGame>(created, HttpStatus.CREATED);
	}

}

package com.lbg.demo.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lbg.demo.domain.DartGame;
import com.lbg.demo.repo.DartsRepo;

@Service
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

	public List<DartGame> getDartsGames() {
		return this.repo.findAll();
	}

}

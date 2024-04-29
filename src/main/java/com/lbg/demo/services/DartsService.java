package com.lbg.demo.services;

import java.util.List;
import java.util.Optional;

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

	public ResponseEntity<DartGame> getDartsGames(int id) {
		Optional<DartGame> found = this.repo.findById(id);
		if (found.isEmpty()) {
			return new ResponseEntity<DartGame>(HttpStatus.NOT_FOUND);
		}
		DartGame body = found.get();
		return ResponseEntity.ok(body);
	}

	public ResponseEntity<DartGame> updateScore(int id, DartGame newDartGame) {
		Optional<DartGame> found = this.repo.findById(id);

		if (found.isEmpty()) {
			return new ResponseEntity<DartGame>(HttpStatus.NOT_FOUND);
		}
		DartGame existing = found.get();

		if (newDartGame.getP1Score() != null) {
			existing.setP1Score(newDartGame.getP1Score());
		}

		if (newDartGame.getP2Score() != null) {
			existing.setP2Score(newDartGame.getP2Score());
		}

		DartGame edited = this.repo.save(existing);

		return ResponseEntity.ok(edited);
	}

}

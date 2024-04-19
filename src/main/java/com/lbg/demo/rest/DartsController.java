package com.lbg.demo.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lbg.demo.domain.DartGame;
import com.lbg.demo.services.DartsService;

@RestController
@RequestMapping("/darts")
@CrossOrigin
public class DartsController {

	private DartsService service;

	public DartsController(DartsService service) {
		super();
		this.service = service;
	}

	@PostMapping("/create")
	public ResponseEntity<DartGame> createDartGame(@RequestBody DartGame newDartGame) {
		return this.service.createDartGame(newDartGame);
	}

	@GetMapping("/get")
	public List<DartGame> getDartsGames() {
		return this.service.getDartsGames();
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<DartGame> getDartsGames(@PathVariable int id) {
		return this.service.getDartsGames(id);
	}

}

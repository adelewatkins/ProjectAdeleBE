package com.lbg.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lbg.demo.domain.DartGame;

public interface DartsRepo extends JpaRepository<DartGame, Integer> {

}

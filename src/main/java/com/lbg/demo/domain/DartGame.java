package com.lbg.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DartGame {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private Integer gameType;

	private String playerOneName;

	private String playerTwoName;

	private Integer p1Score;

	private Integer p2Score;

	public DartGame() {
		super();
	}

	public Integer getP1Score() {
		return p1Score;
	}

	public void setP1Score(Integer p1Score) {
		this.p1Score = p1Score;
	}

	public Integer getP2Score() {
		return p2Score;
	}

	public void setP2Score(Integer p2Score) {
		this.p2Score = p2Score;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGameType() {
		return gameType;
	}

	public void setGameType(Integer gameType) {
		this.gameType = gameType;
	}

	public String getPlayerOneName() {
		return playerOneName;
	}

	public void setPlayerOneName(String playerOneName) {
		this.playerOneName = playerOneName;
	}

	public String getPlayerTwoName() {
		return playerTwoName;
	}

	public void setPlayerTwoName(String playerTwoName) {
		this.playerTwoName = playerTwoName;
	}

}

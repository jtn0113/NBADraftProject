package com.skilldistillery.nba.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Commisioner {
	private Hopper hopper = new Hopper();
	private BallFactory ballFactory = new BallFactory();
	private List<PingPongBall> balls = new ArrayList<>();
	
	
	public List<PingPongBall> orderBalls(Map<String, Integer> roster) {
		balls = ballFactory.orderBalls(roster);
		return balls;
	}
	
	public void loadHopper(List<PingPongBall> balls) {
		hopper.loadDrum(balls);
	}
	
	public String announce(PingPongBall winner) {
		String winningTeam = winner.getLabel();
		System.out.println(winningTeam);
		return winningTeam;
	}
	
	public String runRaffle(Map<String, Integer> roster) {
		orderBalls(roster);
		loadHopper(balls);
		hopper.turnOn();
		return announce(hopper.pickWinner());
	}
	
	
}

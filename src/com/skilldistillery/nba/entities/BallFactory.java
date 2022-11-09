package com.skilldistillery.nba.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BallFactory {
	private List<PingPongBall> balls = new ArrayList<>();

	
	
	public BallFactory() {
	}
	
	public List<PingPongBall> orderBalls(Map<String, Integer> roster) {
		Set<String> keys = roster.keySet();
		
		
		for(String team : keys) {
			orderBalls(team, roster.get(team));
		}
		
		
		return balls;
	}
	
	public List<PingPongBall> orderBalls(String name, Integer amount) {
		
		for(int i=0; i<amount; i++) {
			balls.add(new PingPongBall(name));
		}
		
		return balls;
	}
	
	
}

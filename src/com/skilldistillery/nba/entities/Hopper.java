package com.skilldistillery.nba.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hopper {
	private List<PingPongBall> drum = new ArrayList<>();

	public Hopper() {
	}
	
	public void turnOn() {
		Collections.shuffle(drum);
	}
	
	public PingPongBall pickWinner() {
		return drum.remove(0);
	}
	
	public List<PingPongBall> loadDrum(List<PingPongBall> drum) {
		this.drum = drum;
		return drum;
	}
}

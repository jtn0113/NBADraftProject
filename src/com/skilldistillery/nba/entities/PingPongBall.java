package com.skilldistillery.nba.entities;

import java.util.Objects;

public class PingPongBall {
	private String label;

	public PingPongBall() {

	}

	public PingPongBall(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "PingPongBall [label=" + label + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(label);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PingPongBall other = (PingPongBall) obj;
		return Objects.equals(label, other.label);
	}

}

package main;

public class Cup {
	
	double probability;
	boolean up = true;
	int number;
	int row;
	
	public Cup(double probability, int number, int row) {
		this.probability = probability;
		this.number = number;
		this.row = row;
	}
	
	public double getProbability() {
		return probability;
	}
	
	public void setProbability(double probability) {
		this.probability = probability;
	}
	
	public boolean getUp() {
		return up;
	}
	
	public void knockDown() {
		this.up = false;
	}
	
	

}

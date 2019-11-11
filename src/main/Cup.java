package main;

public class Cup {
	
	double probability;
	boolean standing = true;
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
	
	public boolean getStanding() {
		return standing;
	}
	
	public void knockDown() {
		this.standing = false;
	}
	
	public int getNumber() {
		return number;
	}
	
	

}

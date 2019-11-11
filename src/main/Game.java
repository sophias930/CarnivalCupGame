package main;

import java.awt.event.ActionEvent;
import java.util.List;

public class Game {
	
	List<CupView> allCupViews;
	ThrowListener listener;
	
	public Game(List<CupView> allCupViews, ThrowListener listener) {
		this.allCupViews = allCupViews;
		this.listener = listener;
	}
	
	public boolean isGameOver() {
		// TODO create logic for determining whether game is over or not
		
		return false;
	}
	
	public List<CupView> getCupViews() {
		return allCupViews;
	}
	
	public void update (ActionEvent e) {
		
	}

}

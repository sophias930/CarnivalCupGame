package main;

import java.awt.FlowLayout;
import java.util.List;

import javax.swing.JPanel;

public class GameView extends JPanel {
	
	Game game;
	
	public GameView(Game game) {
		this.game = game;
		
		setLayout(new FlowLayout());
	
		List<CupView> allCupViews = game.getCupViews();
		
		for (CupView view : allCupViews) {
			add(view);
		}
		
	}

}

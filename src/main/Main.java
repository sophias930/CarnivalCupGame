package main;

import java.util.*;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		Cup cup1 = new Cup(0.9, 1, 3);
		Cup cup2 = new Cup(0.9, 2, 3);
		Cup cup3 = new Cup(0.9, 3, 3);
		Cup cup4 = new Cup(0.5, 4, 2);
		Cup cup5 = new Cup(0.5, 5, 2);
		Cup cup6 = new Cup(0.2, 6, 1);
		
		CupView view1 = new CupView(cup1);
		CupView view2 = new CupView(cup2);
		CupView view3 = new CupView(cup3);
		CupView view4 = new CupView(cup4);
		CupView view5 = new CupView(cup5);
		CupView view6 = new CupView(cup6);
		
		List<CupView> allViews = new ArrayList<>();
		allViews.add(view1);
		allViews.add(view2);
		allViews.add(view3);
		allViews.add(view4);
		allViews.add(view5);
		allViews.add(view6);
		
		ThrowListener listener = new ThrowListener();
		
		Game mainGame = new Game(allViews, listener);
		
		GameView gameView = new GameView(mainGame);
		
		JFrame main_frame = new JFrame();
		main_frame.setTitle("Cup Carnival Game");
		main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		main_frame.setContentPane(gameView);

		main_frame.pack();
		main_frame.setVisible(true);
	}

}

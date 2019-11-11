package main;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CupView extends JPanel {
	
	Cup cup;
	
	public CupView(Cup c) {
		this.cup = c;
		setLayout(new FlowLayout());
		
		JLabel thisCup = new JLabel("" + cup.getNumber());
		add(thisCup);
		this.addMouseListener(new ThrowListener());
	}
	
	public Cup getCup() {
		return cup;
	}

}

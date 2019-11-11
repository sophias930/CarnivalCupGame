# CarnivalCupGame
Welcome to the COMP 401 Hackathon, Cirque du 401! This is the Carnival Cup Game, in which the player throws a ball at a pyramid of 6 cups from afar and attempts to knock down the pyramid. In the COMP 401 version, the player throws a ball at the pyramid by clicking on a cup.
We have created this starter code of an MVC to represent this game. This includes:

* Main
  * Creates all the Cups and CupViews, the ThrowListener, and then creates a Game by passing those in to the constructor
  * Creates the GameView
* Game and GameView
  * Game takes in a list of CupViews in the constructor
  * Game listens for updates from ThrowListener and makes choices about whether the pyramid falls based on the probabilities in the corresponding Cup
  * Game updates GameView in the update() method
  * Game also controls whether the game is over or not by checking the "up" values of all of the cups
  * GameView is the Java Swing representation 
* Cup and CupView
  * Cup holds all of the information about a specific cup object, and CupView is the Java Swing representation of it
  * Cup holds the information describing the probability that the cup knocks down all the other cups, whether the cup is up or down, the cup number, and the cup row (e.g. top (1), middle (2), bottom (3))
  * The program should not alter the probablity, number, or row over time
  * The only field that will be changed throughout the game is whether the cup is up (up = true) or down (up = false)
  * Cup listens for clicks from CupListener
  * CupView contains its corresponding Cup as a field
* ThrowListener
  * This should listen for mouse clicks from the user on the cups and notify Game
  
  You are responsible for the following:
  1. Implement ThrowListener to listen to mouse clicks and pass that information on to Game.
  2. Add the logic in Game to update() to listen for actions from ThrowListener and make appropriate changes in GameView.
  3. Add functionality to the isGameOver() method.
  4. Use Java Swing to make the UI user-friendly.
  
  Bonus ideas:
  * A power meter to increase the probability of a cup falling on a high-power throw
  * Add functionality for the user to specify the number of cups (i.e. 3, 6, 10, 15, 21, ...)
  * Anything else to make this game more fun! 
  
  Helpful resources:
  * Java Swing Tutorial Point user-friendly documentation: https://www.javatpoint.com/java-swing
  * Another user-friendly documentation: https://www.guru99.com/java-swing-gui.html
  * Oracle documentation for Java Swing: https://docs.oracle.com/javase/tutorial/uiswing/index.html

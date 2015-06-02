/**
 * 
 */
package com.sirolfgoku.StoryGameCLI.rooms.forest;

import java.util.Scanner;

import com.sirolfgoku.StoryGameCLI.Level;
import com.sirolfgoku.StoryGameCLI.Game;
import com.sirolfgoku.StoryGameCLI.Player;

/**
 * @author gokhankacan
 *
 */
public class ForestEnter extends Level {

	public boolean handleCommands(Scanner scanner, String command) {
		if (super.handleCommands(scanner, command)) {
			return true;
		} else if (commandIs(command, "Look around ss")) {
			print("You are in the forest with your wive and dog. It is a beautiful sunny day for a Walk in the forest.");
			return true;
		} else if (commandIs(command, "Look at wive")) {
			print("It's sunny and your wive smile at you");
			return true;
		} else if (commandIs(command, "Walk to bridge")) {
			print("You have to Walk forward to get to the the bridge");
			return true;
		} else if (commandIs(command, "Climb tree")) {
			print("The tree is to big to climb, but your dog has a branch in he's mouth");
			return true;
		} else if (commandIs(command, "Climb tree")) {
			print("The tree is to big to climb, but your dog has a stick in he's mouth");
			return true;
		} else if (commandIs(command, "Look at dog")) {
			print("The dog smiles and want you to throw the stick");
			return true;
		} else if (commandIs(command, "Throw stick")) {
			print("The dog fetches the stick and waits for you to come.");
			return true;
		} else if (commandIs(command, "Go to dog")) {
			print("You have to Walk forward to go to your dog.");
			return true;
		} else if (commandIs(command, "Walk forward") || commandIs(command, "Walk")) {
			print("Your path splits into two ways. You can Go left or right");
			Game.instance.setCurrentRoom(new ForestBridge());
			return true;
		} 
		
		
		return false;
	}

	
	@Override
	public String welcomingMessage() {
		return "You are in the forest with your wive and dog. It is a beautiful sunny day for a walk in the forest.";
	}
}

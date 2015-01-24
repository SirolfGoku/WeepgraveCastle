package com.sirolfgoku.StoryGameCLI;

import java.util.Scanner;

public abstract class Level {

	public Level() {
	}
	
	public boolean handleCommands(Scanner scanner, String command) {
		if(commandIs(command, "Look Around")) {
			lookAround();
			return true;
		} else if(commandIs(command, "help") || commandIs(command, "?")) {
			print("if you're stuck, try typing \"Look around\"\nTo see what items you have, type \"List inventory\"");
			return true;
		} else if(commandIs(command, "list inventory")) {
			print("Your inventory contains:");
			if(Game.player.getInventory().size() == 0) {
				print("Nothing!");
				return true;
			}
			for(String item : Game.player.getInventory()) {
				print(item);
				return true;
			}
			return true;
		}
		return false;
	}
	
	public void lookAround() {
		print("There is nothing here");
	}
	
	public abstract String welcomingMessage();
	
	public void print(Object msg) {
		System.out.println(msg);
	}
	
	public boolean commandIs(String currentCommand, String command) {
		return currentCommand.equalsIgnoreCase(command);
	}
	
	public boolean hasPlayer(String item) {
		return Game.player.hasPlayer(item);
	}
	
	public void givePlayer(String item) {
		Game.player.givePlayer(item);
	}

}

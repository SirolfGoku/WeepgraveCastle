package com.sirolfgoku.StoryGameCLI.rooms.dungeon;

import java.util.Scanner;

import com.sirolfgoku.StoryGameCLI.Game;
import com.sirolfgoku.StoryGameCLI.Level;

public class RoomCell extends Level {

	private boolean hasShivedDoor;
	
	private static String SHIV = "shiv";

	public RoomCell() {
		hasShivedDoor = false;
	}

	public boolean handleCommands(Scanner scanner, String command) {
		if(super.handleCommands(scanner, command)) {
			return true;
		} else if(commandIs(command, "Look at bed")) {
			print("The bed has been made");
			return true;
		} else if(commandIs(command, "Lift pillow")) {
			if(!hasPlayer("shiv")) {
				print("You've found a shiv!");
				givePlayer(SHIV);
			} else {
				print("There is nothing there.");
			}
			return true;
		} else if(commandIs(command, "Lift sheet")) {
			print("There is nothing there");
			return true;
		} else if(commandIs(command, "Look at door")) {
			print("It's a door...");
			return true;
		} else if(commandIs(command, "Beat down walls")) {
			print("You can't do this with bare hands");
			return true;
		} else if(commandIs(command, "Open door")) {
			if(!hasShivedDoor) {
				print("It's locked");
			} else {
				Game.instance.setCurrentRoom(new RoomDungeonHallway());
			}
			return true;
		} else if(commandIs(command, "shiv door")) {
			if(!hasPlayer(SHIV)) {
				print("You haven't got a shiv");
			} else {
				print("The lock springs open");
				hasShivedDoor = true;
			}
			return true;
		}
		return false;
	}

	@Override
	public void lookAround() {
		print("You see a bed and a door.\nThe walls are made out of stone.");
	}

	@Override
	public String welcomingMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}

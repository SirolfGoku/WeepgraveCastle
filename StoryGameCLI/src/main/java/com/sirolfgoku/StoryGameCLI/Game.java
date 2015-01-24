package com.sirolfgoku.StoryGameCLI;

import java.util.Scanner;

import com.sirolfgoku.StoryGameCLI.rooms.dungeon.RoomCell;

public class Game {
	
	private Scanner scanner;
	private Level currentRoom;

	public static Player player;
	public static Game instance;

	public Game() {
		instance = this;
		init();
		gameLoop();
	}


	private void gameLoop() {
		while(true) {
			String command = scanner.next();
			if(!currentRoom.handleCommands(scanner, command)) {
				System.out.println("I don't know how to "+command);
			}
		}
	}

	private void init() {
		scanner = new Scanner(System.in);
		scanner.useDelimiter("\n");
		currentRoom = new RoomCell();
		player = new Player();
		System.out.println("You wake up in a room you do not know");
	}
	
	public Level getCurrentRoom() {
		return currentRoom;
	}

	public void setCurrentRoom(Level currentRoom) {
		this.currentRoom = currentRoom;
	}

	public static void main(String[] args) {
		new Game();
	}

}

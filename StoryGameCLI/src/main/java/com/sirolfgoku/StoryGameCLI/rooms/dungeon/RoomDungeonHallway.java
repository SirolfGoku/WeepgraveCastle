package com.sirolfgoku.StoryGameCLI.rooms.dungeon;

import com.sirolfgoku.StoryGameCLI.Level;

public class RoomDungeonHallway extends Level {

	public RoomDungeonHallway() {
	}
	
	public void lookAround() {
		print("You see a large corridor with many locked doors");
	}

	@Override
	public String welcomingMessage() {
		return null;
	}

}

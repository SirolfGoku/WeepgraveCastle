package com.sirolfgoku.StoryGameCLI;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<String> inventory;
	
	public Player() {
		inventory = new ArrayList<String>();
	}
	
	public void givePlayer(String item) {
		inventory.add(item);
	}
	
	public boolean hasPlayer(String item) {
		return inventory.contains(item);
	}
	
	public List<String> getInventory() {
		return inventory;
	}

}

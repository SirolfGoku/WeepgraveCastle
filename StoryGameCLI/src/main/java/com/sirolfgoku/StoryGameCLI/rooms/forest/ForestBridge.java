package com.sirolfgoku.StoryGameCLI.rooms.forest;

public class ForestBridge {

}



if (commandIs(command, "left") || commandIs(command, "Go left")) {
	print("You arrived on at the bridge");
	return true;
} else if (commandIs(command, "right") || commandIs(command, "Go right")) {
	print("You see a crazy person in the distance. Your wive is afraid to go right.");
	return true;
}
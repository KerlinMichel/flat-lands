package com.dwarfmines.flatlands.game;

import java.util.LinkedList;
import java.util.List;

import com.badlogic.gdx.scenes.scene2d.Stage;

public class Team {
	
	private List<Army> armies;
	private Stage stage;
	
	public Team(Army... armies) {
		this.armies = new LinkedList<Army>();
		for(Army army : armies)
			this.armies.add(army);
	}
	
	public void init(Stage stage) {
		for(Army army : armies)
			army.setStage(stage);
	}
	
	public List<Army> getArmies() {
		return armies;
	}

}

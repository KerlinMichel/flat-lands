package com.dwarfmines.flatlands.game;

import java.util.LinkedList;
import java.util.List;

import com.badlogic.gdx.scenes.scene2d.Stage;

public class Flatworld {
	
	private List<Team> teams;
	private Map map;
	
	public Flatworld(Team... teams) {
		this.teams = new LinkedList<Team>();
		for(Team team : teams)
			this.teams.add(team);
	}
	
	public void init(Stage stage) {
		for(Team team : teams) {
			team.init(stage);
			for(Army army : team.getArmies())
				army.init();
		}
	}

}

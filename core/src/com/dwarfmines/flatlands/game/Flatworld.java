package com.dwarfmines.flatlands.game;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.dwarfmines.flatlands.util.MapUtil;

public class Flatworld {
	
	private List<Team> teams;
	private Map map;
	private Army playerArmy;
	
	public Flatworld(Army playerArmy, Team... teams) {
		this.teams = new LinkedList<Team>();
		this.playerArmy = playerArmy;
		for(Team team : teams)
			this.teams.add(team);
		map = MapUtil.randomMap(MapUtil.defaultWidth, MapUtil.defaultHeight, 2);
	}
	
	/** Inits each Army and each team and gives it unique locations from
	 * @param stage The stage that all polygons display on 
	 * the map */
	public void init(Stage stage, WarHUD warHUB) {
		this.playerArmy.setWarHUD(warHUB);
		List<Vector2> baseLocs = new ArrayList<Vector2>(map.getBaseLocs());
		for(Team team : teams) {
			team.init(stage);
			Random r = new Random();
			for(Army army : team.getArmies()) {
				int idx = r.nextInt(baseLocs.size());
				Vector2 pos = baseLocs.get(idx);
				baseLocs.remove(idx);
				army.init(pos.x, pos.y);
			}
		}
	}
	
	public Army getPlayerArmy() {
		return playerArmy;
	}

}

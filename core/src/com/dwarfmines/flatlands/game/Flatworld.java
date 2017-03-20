package com.dwarfmines.flatlands.game;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.dwarfmines.flatlands.util.MapUtil;

public class Flatworld {
	
	private List<Team> teams;
	private Map map;
	private Army playerArmy;
	private World world;
	
	public Flatworld(Army playerArmy, Team... teams) {
		this.teams = new LinkedList<Team>();
		this.playerArmy = playerArmy;
		for(Team team : teams)
			this.teams.add(team);
		//map = MapUtil.randomMap(MapUtil.defaultWidth, MapUtil.defaultHeight, 2);
		map = MapUtil.randomMap(350, 350, 2);
		world = new World(new Vector2(0,0), true);
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
	
	public void update() {
		world.step(1/60f, 6, 2);
	}
	
	public Army getPlayerArmy() {
		return playerArmy;
	}

}

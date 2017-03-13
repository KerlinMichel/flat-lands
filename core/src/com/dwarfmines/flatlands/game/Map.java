package com.dwarfmines.flatlands.game;

import java.util.LinkedList;
import java.util.List;

import com.badlogic.gdx.math.Vector2;
import com.dwarfmines.flatlands.entities.Polygon;

public class Map {
	
	private List<Polygon> terrain;
	private List<Vector2> baseLocs;
	private int width;
	private int height;
	
	public Map(int width, int height) {
		terrain = new LinkedList<Polygon>();
		baseLocs = new LinkedList<Vector2>();
		this.width = width;
		this.height = height;
	}
	
	public void addTerrain(Polygon terrain) {
		this.terrain.add(terrain);
	}
	
	public void addBaseLoc(float x, float y) {
		baseLocs.add(new Vector2(x, y));
	}
	
	public List<Vector2> getBaseLocs() {
		return baseLocs;
	}

}

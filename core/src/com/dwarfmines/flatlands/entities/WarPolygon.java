package com.dwarfmines.flatlands.entities;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.dwarfmines.flatlands.game.Army;

public class WarPolygon extends InteractablePolygon {

	private Army army;
	
	public WarPolygon(float[] vertices, Color c, Army army) {
		super(vertices, c);
		this.army = army;
	}
	
	public WarPolygon(float[] vertices, Texture texture, Army army) {
	    super(vertices, texture);
	    this.army = army;
	}
}

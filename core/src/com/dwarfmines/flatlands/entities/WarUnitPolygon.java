package com.dwarfmines.flatlands.entities;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;
import com.badlogic.gdx.physics.box2d.World;
import com.dwarfmines.flatlands.game.Army;

public abstract class WarUnitPolygon extends InteractablePolygon {

	protected Army army;
	private int neededBuildPoints;
	
	public WarUnitPolygon(float[] vertices, Color c, Army army) {
		super(vertices, c);
		this.army = army;
		bodyDef.type = BodyType.DynamicBody;
	}
	
	public WarUnitPolygon(float[] vertices, Texture texture, Army army) {
	    super(vertices, texture);
	    this.army = army;
	    bodyDef.type = BodyType.DynamicBody;
	}
	
	public int getNeededBuildPoints() {
		return neededBuildPoints;
	}

	public abstract void initBox2dBody(World world);
}

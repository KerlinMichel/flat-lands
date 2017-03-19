package com.dwarfmines.flatlands.entities;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;
import com.badlogic.gdx.physics.box2d.World;
import com.dwarfmines.flatlands.game.Army;

public abstract class WarPolygon extends InteractablePolygon {

	private Army army;
	
	public WarPolygon(float[] vertices, Color c, Army army) {
		super(vertices, c);
		this.army = army;
		bodyDef.type = BodyType.DynamicBody;
	}
	
	public WarPolygon(float[] vertices, Texture texture, Army army) {
	    super(vertices, texture);
	    this.army = army;
	    bodyDef.type = BodyType.DynamicBody;
	}

	public abstract void initBox2dBody(World world);
}

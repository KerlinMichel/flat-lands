package com.dwarfmines.flatlands.entities;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.dwarfmines.flatlands.game.WarHUD;

public abstract class InteractablePolygon extends Polygon {
	
	protected WarHUD warHUD;
	protected BodyDef bodyDef;
	protected Body body;

	public InteractablePolygon(float[] vertices, Color c) {
		super(vertices, c);
		bodyDef = new BodyDef();
	}
	
	public InteractablePolygon(float[] vertices, Texture texture) {
	    super(vertices, texture);
	    bodyDef = new BodyDef();
	}
	
	public abstract void initBox2dBody(World world);
	
	public void setWarHUD(WarHUD warHUD) {
		this.warHUD = warHUD;
	}

}

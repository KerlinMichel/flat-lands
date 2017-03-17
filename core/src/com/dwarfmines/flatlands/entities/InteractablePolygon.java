package com.dwarfmines.flatlands.entities;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.dwarfmines.flatlands.game.WarHUD;

public abstract class InteractablePolygon extends Polygon {
	
	private WarHUD warHUD;

	public InteractablePolygon(float[] vertices, Color c) {
		super(vertices, c);
	}
	
	public InteractablePolygon(float[] vertices, Texture texture) {
	    super(vertices, texture);
	}
	
	public void setWarHUD(WarHUD warHUD) {
		this.warHUD = warHUD;
	}

}

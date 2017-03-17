package com.dwarfmines.flatlands.jags;

import com.badlogic.gdx.graphics.Color;
import com.dwarfmines.flatlands.entities.WarPolygon;
import com.dwarfmines.flatlands.game.Army;

public class Base extends WarPolygon {
	
	private final static float vertices[] = new float[] {
			50,0,
			0,100,
			50,200,
			50,150,
			70,150,
			70,200,
			120,100,
			70,0,
			70,50,
			50,50
	};
	
	public Base(float x, float y, Army army) {
		super(vertices, Color.RED, army);
		setPosition(x, y);
	}

}

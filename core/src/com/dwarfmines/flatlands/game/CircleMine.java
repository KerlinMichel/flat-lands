package com.dwarfmines.flatlands.game;

import com.badlogic.gdx.graphics.Color;
import com.dwarfmines.flatlands.entities.Polygon;

public class CircleMine extends Polygon {
	
	private final static float vertices[] = new float[]{
			0,0,
			0,20,
			20,20,
			20,0
	};

	public CircleMine() {
		super(vertices, Color.BLUE);
	}
	
	

}

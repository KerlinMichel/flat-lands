package com.dwarfmines.flatlands.jags;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.dwarfmines.flatlands.entities.WarUnitPolygon;
import com.dwarfmines.flatlands.game.Army;

public class Base extends WarUnitPolygon {
	
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

	@Override
	public void initBox2dBody(World world) {
		BodyDef groundBodyDef = new BodyDef();  

		groundBodyDef.position.set(new Vector2(getX(), getY()));  

		Body groundBody = world.createBody(groundBodyDef);  

		PolygonShape polygonShape = new PolygonShape();
		
		polygonShape.set(vertices);
		groundBody.createFixture(polygonShape, 0.0f); 
		polygonShape.dispose();
	}
	
	public void spawnUnit(WarUnitPolygon warUnit) {
		
	}

}

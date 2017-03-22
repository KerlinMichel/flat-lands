package com.dwarfmines.flatlands.entities.template;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.dwarfmines.flatlands.entities.WarUnitPolygon;
import com.dwarfmines.flatlands.entities.components.UnitBuilder;
import com.dwarfmines.flatlands.game.Army;

public abstract class Base extends WarUnitPolygon implements UnitSpawner {

	public Base(float[] vertices, Color c, Army army) {
		super(vertices, c, army);
	}
	
	public Base(float[] vertices, Texture texture, Army army) {
		super(vertices, texture, army);
	}

	@Override
	public abstract void initBox2dBody(World world);
	
	public Vector2 findSpawnPosition() {
		//TODO: Do collision detection to find suitable position
		return new Vector2(getX(), getY()+getHeight()+10);
	}
	
	public void spawnUnit(WarUnitPolygon warUnit) {
		Vector2 pos = findSpawnPosition();
		warUnit.setPosition(pos.x, pos.y);
		army.addUnit(warUnit);
	}

	public void addToBuildQueue(WarUnitPolygon unit) {
		((UnitBuilder)getEntity().getComponent(UnitBuilder.class)).addToQueue(unit);
	}
}

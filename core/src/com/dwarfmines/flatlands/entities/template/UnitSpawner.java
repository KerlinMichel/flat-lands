package com.dwarfmines.flatlands.entities.template;

import com.badlogic.gdx.math.Vector2;
import com.dwarfmines.flatlands.entities.WarUnitPolygon;

public interface UnitSpawner {
	
	public Vector2 findSpawnPosition();
	
	public void spawnUnit(WarUnitPolygon warUnit);

}

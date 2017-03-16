package com.dwarfmines.flatlands.game;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.dwarfmines.flatlands.entities.Polygon;
import com.dwarfmines.flatlands.jags.Base;

public class Army {
	
	public HashMap<java.lang.Class<? extends Polygon>, List<Polygon>> structures;
	private HashMap<java.lang.Class<? extends Polygon>, List<Polygon>> units;
	
	private Stage stage;
	
	private int numCircles;
	
	public enum Class {
		JAGS,
		QULATS,
		EUCLIDES
	}
	
	private final Class classType;
	
	public Army(Class classType) {
		structures = new HashMap<java.lang.Class<? extends Polygon>, List<Polygon>>();
		units = new HashMap<java.lang.Class<? extends Polygon>, List<Polygon>>();
		this.classType = classType;
		numCircles = 0;
	}
	
	public void init(float x, float y) {
		switch(classType) {
			case JAGS: addStructure(new Base(x, y)); break;
		}
	}
	
	private void addStructure(Polygon polygon) {
		stage.addActor(polygon);
		if(structures.containsKey(polygon.getClass()))
			structures.get(polygon).add(polygon);
		else {
			structures.put(polygon.getClass(), new LinkedList<Polygon>());
			structures.get(polygon.getClass()).add(polygon);
		}
	}
	
	public void setStage(Stage stage) {
		this.stage = stage;
	}

}

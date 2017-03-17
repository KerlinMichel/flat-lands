package com.dwarfmines.flatlands.game;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.dwarfmines.flatlands.entities.InteractablePolygon;
import com.dwarfmines.flatlands.jags.Base;

public class Army {
	
	private HashMap<java.lang.Class<? extends InteractablePolygon>, List<InteractablePolygon>> structures;
	private HashMap<java.lang.Class<? extends InteractablePolygon>, List<InteractablePolygon>> units;
	
	private List<InteractablePolygon> selectedPolygons; 
	
	private Stage stage;
	private WarHUD warHUD;
	
	private int numCircles;
	
	public enum Class {
		JAGS,
		QULATS,
		EUCLIDES
	}
	
	private final Class classType;
	
	public Army(Class classType) {
		structures = new HashMap<java.lang.Class<? extends InteractablePolygon>, List<InteractablePolygon>>();
		units = new HashMap<java.lang.Class<? extends InteractablePolygon>, List<InteractablePolygon>>();
		this.classType = classType;
		numCircles = 0;
	}
	
	public void init(float x, float y) {
		switch(classType) {
			case JAGS: addStructure(new Base(x, y, this)); break;
		}
	}
	
	public void setWarHUD(WarHUD warHUD) {
		this.warHUD = warHUD;
	}
	
	private void addStructure(InteractablePolygon polygon) {
		stage.addActor(polygon);
		polygon.setWarHUD(warHUD);
		if(structures.containsKey(polygon.getClass()))
			structures.get(polygon).add(polygon);
		else {
			structures.put(polygon.getClass(), new LinkedList<InteractablePolygon>());
			structures.get(polygon.getClass()).add(polygon);
		}
	}
	
	public void setStage(Stage stage) {
		this.stage = stage;
	}

}

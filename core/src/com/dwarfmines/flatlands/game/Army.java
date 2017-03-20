package com.dwarfmines.flatlands.game;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.dwarfmines.flatlands.entities.InteractablePolygon;
import com.dwarfmines.flatlands.entities.WarUnitPolygon;
import com.dwarfmines.flatlands.jags.JagsBase;

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
			case JAGS: addStructure(new JagsBase(x, y, this)); break;
		}
	}
	
	public void setWarHUD(WarHUD warHUD) {
		this.warHUD = warHUD;
	}
	
	public WarHUD getWarHUD() {
		return warHUD;
	}
	
	private void addStructure(InteractablePolygon structure) {
		stage.addActor(structure);
		structure.setWarHUD(warHUD);
		if(structures.containsKey(structure.getClass()))
			structures.get(structure).add(structure);
		else {
			structures.put(structure.getClass(), new LinkedList<InteractablePolygon>());
			structures.get(structure.getClass()).add(structure);
		}
	}
	
	public void addUnit(InteractablePolygon unit) {
		stage.addActor(unit);
		unit.setWarHUD(warHUD);
		if(units.containsKey(unit.getClass()))
			units.get(unit.getClass()).add(unit);
		else {
			units.put(unit.getClass(), new LinkedList<InteractablePolygon>());
			units.get(unit.getClass()).add(unit);
		}
	}
	
	public void setStage(Stage stage) {
		this.stage = stage;
	}

}

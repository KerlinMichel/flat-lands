package com.dwarfmines.flatlands.game;

import java.util.LinkedList;
import java.util.List;

import com.dwarfmines.flatlands.entities.Polygon;
import com.dwarfmines.flatlands.jags.Base;

public class Army {
	
	private List<Polygon> structures;
	private List<Polygon> units;
	
	private int numCircles;
	
	public enum Class {
		JAGS,
		QULATS,
		EUCLIDES
	}
	
	private final Class classType;
	
	public Army(Class classType) {
		structures = new LinkedList<Polygon>();
		units = new LinkedList<Polygon>();
		this.classType = classType;
		numCircles = 0;
	}
	
	public void init() {
		switch(classType) {
			case JAGS: structures.add(new Base()); break;
		}
	}

}

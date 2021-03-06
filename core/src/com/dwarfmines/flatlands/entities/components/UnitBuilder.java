package com.dwarfmines.flatlands.entities.components;

import java.util.LinkedList;

import com.dwarfmines.flatlands.entities.WarUnitPolygon;
import com.dwarfmines.flatlands.entities.template.UnitSpawner;

import pieces.component.Component;

public class UnitBuilder extends Component {
	
	/* buildQueue is not implemented with a Queue
	 * so that the entire buildQueue can be viewed without
	 * having to remove elements
	 */
	private LinkedList<WarUnitPolygon> buildQueue;
	private int neededBuildPoints;
	private int totalBuildPoints;
	private UnitSpawner spawner;
	
	public UnitBuilder(UnitSpawner spawner) {
		super();
		this.spawner = spawner;
	}

	@Override
	protected void update() {
		if(buildQueue == null || buildQueue.isEmpty())
			return;
		if(totalBuildPoints < neededBuildPoints) {
			totalBuildPoints++;
		} else {
			WarUnitPolygon warUnit = buildQueue.pollFirst();
			spawner.spawnUnit(warUnit);
			if(buildQueue.isEmpty())
				neededBuildPoints = 0;
			else
				totalBuildPoints = buildQueue.peekFirst().getNeededBuildPoints();
			
			totalBuildPoints = 0;
		}
	}
	
	public void addToQueue(WarUnitPolygon warUnit) {
		if(buildQueue.isEmpty())
			neededBuildPoints = warUnit.getNeededBuildPoints();
		
		buildQueue.addLast(warUnit);
	}

}

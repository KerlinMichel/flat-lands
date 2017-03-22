package com.dwarfmines.flatlands.entities.components;

import java.util.ArrayList;
import java.util.List;

import pieces.component.Component;

public class AI extends Component {
	
	private List<Behaviour> behaviours;
	
	public interface Behaviour {
		boolean shouldAct();
		void act();
	}
	
	public AI(Behaviour ... behaviours) {
		this.behaviours = new ArrayList<Behaviour>();
		for(Behaviour behaviour : behaviours)
			this.behaviours.add(behaviour);
	}
	
	public AI(List<Behaviour> behaviours) {
		this.behaviours = behaviours;
	}
	
	@Override
	protected void update() {
		for(Behaviour behaviour : behaviours) {
			if(behaviour.shouldAct()) {
				behaviour.act();
				break;
			}
		}
	}

}

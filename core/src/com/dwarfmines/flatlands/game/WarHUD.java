package com.dwarfmines.flatlands.game;

import com.badlogic.gdx.scenes.scene2d.Stage;

public class WarHUD {
	
	private Stage stage;
	private Army army;
	
	public WarHUD(Army army) {
		this.army = army;
		this.stage = new Stage();
	}
	
	public void update(float dt) {
		stage.act(dt);
		stage.draw();
	}

}

package com.dwarfmines.flatlands;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.dwarfmines.flatlands.gamescreen.MainMenu;
import com.dwarfmines.flatlands.gamescreen.TestScreen;
import com.dwarfmines.flatlands.util.UI;

public class FlatLands extends Game {
	public SpriteBatch batch;
	
	private enum Mode {
		PROD,
		TEST
	}
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		
		UI.init();
		
		Mode mode = Mode.PROD;
		switch(mode) {
			case PROD: setScreen(new MainMenu(this)); break;
			case TEST: setScreen(new TestScreen(this)); break; 
			default: setScreen(new TestScreen(this));
		}
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
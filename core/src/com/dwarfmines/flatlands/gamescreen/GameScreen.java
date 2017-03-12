package com.dwarfmines.flatlands.gamescreen;

import com.badlogic.gdx.Screen;
import com.dwarfmines.flatlands.FlatLands;

public abstract class GameScreen implements Screen {
	
	protected final FlatLands flGame;
	
	public GameScreen(FlatLands flGame) {
		this.flGame = flGame;
	}

}

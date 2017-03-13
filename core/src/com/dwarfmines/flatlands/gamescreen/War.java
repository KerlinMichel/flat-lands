package com.dwarfmines.flatlands.gamescreen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.dwarfmines.flatlands.FlatLands;
import com.dwarfmines.flatlands.game.Flatworld;

public class War extends GameScreen {
	
	private Stage stage;
	private Flatworld world;

	public War(FlatLands flGame, Flatworld world) {
		super(flGame);
		stage = new Stage();
		this.world = world;
	}

	@Override
	public void show() {	
		world.init(stage);
	}

	@Override
	public void render(float delta) {	
		Gdx.gl.glClearColor(0, 0, 0.2f, 1);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.act(delta);
		stage.draw();
	}

	@Override
	public void resize(int width, int height) {	
	}

	@Override
	public void pause() {		
	}

	@Override
	public void resume() {	
	}

	@Override
	public void hide() {	
	}

	@Override
	public void dispose() {	
		stage.dispose();
	}

}

package com.dwarfmines.flatlands.gamescreen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.dwarfmines.flatlands.FlatLands;
import com.dwarfmines.flatlands.entities.Polygon;
import com.dwarfmines.flatlands.game.Flatworld;
import com.dwarfmines.flatlands.game.WarHUD;
import com.dwarfmines.flatlands.input.DesktopInput;

public class War extends GameScreen {
	
	private Stage stage;
	private Flatworld world;
	
	private WarHUD warHUD;
	private DesktopInput desktopInput;

	public War(FlatLands flGame, Flatworld world) {
		super(flGame);
		stage = new Stage();
		this.world = world;
		desktopInput = new DesktopInput(stage);
		warHUD = new WarHUD(world.getPlayerArmy());
	}

	@Override
	public void show() {	
		InputMultiplexer inputMultiplexer = new InputMultiplexer(stage, desktopInput);
		Gdx.input.setInputProcessor(inputMultiplexer);
		world.init(stage, warHUD);
	}

	@Override
	public void render(float delta) {	
		Gdx.gl.glClearColor(0, 0, 0.2f, 1);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	    desktopInput.update();
	    //Makes sure that the polygonspritebatch draws sccording to the stages camera
	    Polygon.polyBatch.setProjectionMatrix(stage.getCamera().combined);
		stage.act(delta);
		stage.draw();
		warHUD.update(delta);
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

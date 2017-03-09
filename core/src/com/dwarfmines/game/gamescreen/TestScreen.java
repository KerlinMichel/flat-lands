package com.dwarfmines.game.gamescreen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.dwarfmines.game.FlatLands;

public class TestScreen extends GameScreen {
	
	private Texture img;

	public TestScreen(FlatLands flGame) {
		super(flGame);
	}

	@Override
	public void show() {
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		flGame.batch.begin();
		flGame.batch.draw(img, 0, 0);
		flGame.batch.end();
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
		img.dispose();
	}

}

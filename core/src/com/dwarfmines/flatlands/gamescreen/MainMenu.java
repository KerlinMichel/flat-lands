package com.dwarfmines.flatlands.gamescreen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.dwarfmines.flatlands.FlatLands;
import com.dwarfmines.flatlands.util.UI;

public class MainMenu extends GameScreen {
	
	private Stage stage;
	private TextButton playBtn;

	public MainMenu(FlatLands flGame) {
		super(flGame);
		stage = new Stage();
		playBtn = new TextButton("Play", UI.basicTextBtnSty);
		playBtn.setPosition(UI.centerX(playBtn), UI.centerY(playBtn));
		playBtn.addListener(new ChangeListener() {
			@Override
			public void changed(ChangeEvent event, Actor actor) {
				System.out.println("Button pressed");
			}
		});
	}

	@Override
	public void show() {
		Gdx.input.setInputProcessor(stage);
		stage.addActor(playBtn);
	}

	@Override
	public void render(float delta) {	
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

package com.dwarfmines.flatlands.gamescreen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.dwarfmines.flatlands.FlatLands;
import com.dwarfmines.flatlands.game.Army;
import com.dwarfmines.flatlands.game.Flatworld;
import com.dwarfmines.flatlands.game.Team;
import com.dwarfmines.flatlands.util.UI;

public class MainMenu extends GameScreen {
	
	private Stage stage;
	private TextButton playBtn;

	public MainMenu(final FlatLands flGame) {
		super(flGame);
		stage = new Stage();
		playBtn = new TextButton("Play", UI.basicTextBtnSty);
		playBtn.setPosition(UI.centerX(playBtn), UI.centerY(playBtn));
		playBtn.addListener(new ChangeListener() {
			@Override
			public void changed(ChangeEvent event, Actor actor) {
				flGame.setScreen(new War(flGame, new Flatworld(
						new Team(new Army(Army.Class.JAGS)),
						new Team(new Army(Army.Class.JAGS))
						)));
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

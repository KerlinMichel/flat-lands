package com.dwarfmines.flatlands.input;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class DesktopInput implements InputProcessor {
	
	private Camera camera;
	
	private boolean camUp;
	private boolean camLeft;
	private boolean camDown;
	private boolean camRight;
	
	public DesktopInput(Stage stage) {
		this.camera = stage.getCamera();
	}
	
	public void update() {
		if(camUp)
			camera.translate(0, 5, 0);
		if(camLeft)
			camera.translate(-5, 0, 0);
		if(camDown)
			camera.translate(0, -5, 0);
		if(camRight)
			camera.translate(5, 0, 0);
	}

	@Override
	public boolean keyDown(int keycode) {
		switch(keycode) {
			case Input.Keys.W: camUp = true; break;
			case Input.Keys.A: camLeft = true; break;
			case Input.Keys.S: camDown = true; break;
			case Input.Keys.D: camRight = true; break;
		}
		return true;
	}

	@Override
	public boolean keyUp(int keycode) {
		switch(keycode) {
			case Input.Keys.W: camUp = false; break;
			case Input.Keys.A: camLeft = false; break;
			case Input.Keys.S: camDown = false; break;
			case Input.Keys.D: camRight = false; break;
		}
		return true;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		return false;
	}

}

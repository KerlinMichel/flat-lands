package com.dwarfmines.flatlands.game;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import static com.dwarfmines.flatlands.util.UI.*;

public class WarHUD {
	
	private Stage stage;
	private Army army;
	
	private List<ImageButton> controls;
	
	private static WarHUD warHUD;
	
	private WarHUD(Army army) {
		this.army = army;
		this.stage = new Stage();
		controls = new ArrayList<ImageButton>();
	}
	
	public static WarHUD createInstance(Army army) {
		warHUD = new WarHUD(army);
		return warHUD;
	}
	
	public static WarHUD getInstance() {
		return warHUD;
	}
	
	public void update(float dt) {
		stage.act(dt);
		stage.draw();
	}
	
	public void setControls(List<ImageButton> controls) {
		for(ImageButton imgBtn : this.controls)
			imgBtn.remove();
		this.controls = controls;
		int size = controls.size();
		float controlSize = screenPercentWidth(10);
		float offset = controlSize;
		for(int i = 0; i < size; i++) {
			controls.get(size-1-i).setBounds(screenRight()-(offset*(i+1)), 0,
					controlSize, controlSize);
			stage.addActor(controls.get(size-1-i));
		}
	}

}

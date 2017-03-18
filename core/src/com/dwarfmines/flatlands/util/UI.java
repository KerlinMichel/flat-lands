package com.dwarfmines.flatlands.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;

public class UI {
	
	private UI() {};
	
	
	public static TextButton.TextButtonStyle basicTextBtnSty;
	
	public static void init() {
		basicTextBtnSty = new TextButtonStyle();
		basicTextBtnSty.font = new BitmapFont();
	}
	
	public static float centerX(Actor a) {
		return ((Gdx.graphics.getWidth() - a.getWidth()) / 2);
	}
	
	public static float centerY(Actor a) {
		return ((Gdx.graphics.getHeight() - a.getHeight()) / 2);
	}
	
	public static float screenRight() {
		return Gdx.graphics.getWidth();
	}
	
	public static float screenPercentWidth(float percent) {
		return Gdx.graphics.getWidth()*(percent/100);
	}
	
	public static float screenPercentHeight(float percent) {
		return Gdx.graphics.getHeight()*(percent/100);
	}
	
}

package com.dwarfmines.flatlands.util;

import java.util.LinkedList;
import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class UI {
	
	private UI() {};
	
	
	public static TextButton.TextButtonStyle basicTextBtnSty;
	
	public static void init() {
		basicTextBtnSty = new TextButtonStyle();
		basicTextBtnSty.font = new BitmapFont();
		JagsUI.init();
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
	
	public static Drawable textureToDrawable(String file) {
		return new TextureRegionDrawable(new TextureRegion(new Texture(file)));
	}
	
	public static Drawable textureToDrawable(Texture texture) {
		return new TextureRegionDrawable(new TextureRegion(texture));
	}
	
	public static class JagsUI {
		private static List<ImageButton> jagBaseCtrls;
		public static List<ImageButton> JagsBaseUI() {
			return jagBaseCtrls;
		}
		
		private static void init() {
			jagBaseCtrls = new LinkedList<ImageButton>();
		}
	};
	
}

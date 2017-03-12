package com.dwarfmines.flatlands.util;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.g2d.PolygonRegion;
import com.badlogic.gdx.graphics.g2d.PolygonSprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class PolygonEngine {
	
	private PolygonEngine() {};
	
	public static Texture coloredTexture(Color c) {
		Pixmap pixmap = new Pixmap( 1, 1, Format.RGBA8888 );
		pixmap.setColor(c);
		pixmap.drawPixel(0, 0);
		Texture pixmaptex = new Texture( pixmap );
		pixmap.dispose();
		return pixmaptex;
	}
	
	public static PolygonSprite generatePolySprite(float[] vertices, short[] triangles, Texture texture) {
		PolygonRegion polyReg = new PolygonRegion(
			new TextureRegion(texture),
			vertices, triangles);
		return new PolygonSprite(polyReg);
	}

}

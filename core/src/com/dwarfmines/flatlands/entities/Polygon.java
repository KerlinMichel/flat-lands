package com.dwarfmines.flatlands.entities;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.PolygonSprite;
import com.badlogic.gdx.graphics.g2d.PolygonSpriteBatch;
import com.badlogic.gdx.math.EarClippingTriangulator;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.dwarfmines.flatlands.util.PolygonEngine;

import pieces.Entity;

public abstract class Polygon extends Actor {
	
	private PolygonSprite poly;
	
	/** entity holds all the components**/
	private Entity entity;
	
	public static final EarClippingTriangulator triangulator = new EarClippingTriangulator();
	public static final PolygonSpriteBatch polyBatch = new PolygonSpriteBatch();
	
	public Polygon(float[] vertices, Color c) {
	    poly = PolygonEngine.generatePolySprite(vertices, 
	    		triangulator.computeTriangles(vertices).items, 
	    		PolygonEngine.coloredTexture(c));
	}
	
	public Polygon(float[] vertices, Texture texture) {
	    poly = PolygonEngine.generatePolySprite(vertices, 
	    		triangulator.computeTriangles(vertices).items, 
	    		texture);
	}
	
	@Override
	public void draw(Batch batch, float parentAlpha) {
		batch.end();
		polyBatch.begin();
		poly.draw(polyBatch);
		polyBatch.end();
		batch.begin();
	}
	
	@Override
	public void setPosition(float x, float y) {
		this.setX(x);
		this.setY(y);
		poly.setPosition(x, y);
	}

}

package com.dwarfmines.flatlands.util;

import java.util.Random;

import com.dwarfmines.flatlands.game.Map;

public class MapUtil {
	
	private MapUtil() {};
	
	public static final int defaultWidth = 2500;
	public static final int defaultHeight = 2500;
	
	public static Map randomMap(int width, int height, int numPlayers) {
		Map map = new Map(width, height);
		Random r = new Random();
		//TODO: When randomly adding things on the map make sure they don't intersect 
		for(int i = 0; i < numPlayers; i++)
			map.addBaseLoc(r.nextFloat()*width, r.nextFloat()*height);
		
		return map;
	}

}

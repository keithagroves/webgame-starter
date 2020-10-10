package org.mygroup;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StateManager {
	Map<String, GameObject> players = new HashMap<String, GameObject>();
	
	public StateManager() {
		createPlayer("test");
	}
	
	public GameObject createPlayer(String id) {
		int x = new Random().nextInt(500);
		int y = new Random().nextInt(500);
		return players.put(id, new GameObject(x,y));
	}
	
	String getStateJSON() {
		try {
			return new ObjectMapper().writeValueAsString(players);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "{error}";
	}
}
